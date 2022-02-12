// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][]){
        int max = Integer.MIN_VALUE;
        if( m == 1 ){
            for(int i= 0; i<n; i++) max = Math.max(max, M[i][0]);
        }
        for(int j = m-2; j>= 0; j--){
            for(int i = 0; i<n; i++){
                int right = M[i][j+1];
                int up = i == 0 ? 0 : M[i-1][j+1];
                int down = i == n-1 ? 0 : M[i+1][j+1];
                M[i][j] = M[i][j] + Math.max(right, Math.max(up, down));
                if( j == 0 ){
                    max = Math.max(max, M[i][j]);
                }
            }
        }
        return max;
    }
}