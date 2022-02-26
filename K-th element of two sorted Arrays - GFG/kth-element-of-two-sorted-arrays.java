// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        long min = Math.min(arr1[0], arr2[0]);
        long max = Math.max(arr1[n-1], arr2[m-1]);
        while( min <= max ){
            long count = 0;
            long mid = min + (max - min)/2;
            count += countLessThanMid(arr1, n, mid);
            count += countLessThanMid(arr2, m, mid);
            if( count < k ){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return (long)min;
    }
    
    public long countLessThanMid(int[] arr, int n, long x){
        int start = 0, end = n-1;
        long count = 0;
        while( start <= end ){
            int mid = start + (end - start)/2;
            if( (long)arr[mid] <= x ){
                count += mid - start + 1;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return count;
    }
}