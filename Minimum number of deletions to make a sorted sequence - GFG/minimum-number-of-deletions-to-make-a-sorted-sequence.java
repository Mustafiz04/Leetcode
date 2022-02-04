// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java
class Solution{
	public int minDeletions(int arr[], int n) { 
	   return n - LIS(arr, n);
	} 
	
	public int LIS(int[] arr, int n){
	    int[] dp = new int[n];
	    Arrays.fill(dp, 1);
	    int max = 1;
	    for(int i = 1; i<n; i++){
	        int curr = arr[i];
	        for(int j = 0; j<i; j++){
	            if( arr[j] < curr ) dp[i] = Math.max(dp[i], dp[j] + 1);
	        }
	        max = Math.max(max, dp[i]);
	    }
	    return max;
	}
}