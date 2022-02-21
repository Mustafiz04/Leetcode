// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            String line[] = read.readLine().trim().split("\\s+");
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[c++]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, k = r*c/2+1;
        for(int i = 0; i<r; i++){
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c-1]);
        }
        while( min <= max ){
            int mid = min + (max - min)/2;
            int count = 0;
            for(int i = 0; i<r; i++){
                int start = 0, end = c - 1;
                while( start <= end ){
                    int m = start + (end - start)/2;
                    if( matrix[i][m] <= mid ){
                        count += m - start + 1;
                        start = m + 1;
                    }else{
                        end = m - 1;
                    }
                }
            }
            if( count < k ){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return min;
    }
}