// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Compute obj = new Compute();
            System.out.println(obj.maxSumBS(a, n));
            
        }
	}
}
// } Driver Code Ends


//User function Template for Java



class Compute {
    public static int maxSumBS(int arr[], int n){
        int[] increasing = new int[n];
        int[] decreasing = new int[n];
        int maxSum = 0;
        for(int i = 0; i<n; i++){
	        increasing[i] = arr[i];
            decreasing[i] = arr[i];
	    }
        for(int i = 1; i<n; i++){
            for(int j = 0; j<i; j++){
                if( arr[i] > arr[j] ){
                    increasing[i] = Math.max(increasing[i], increasing[j] + arr[i]);
                }
            }
        }
        
        for(int i = n-2; i>=0; i--){
            for(int j = n-1; j>i; j--){
                if( arr[i] > arr[j] ){
                    decreasing[i] = Math.max(decreasing[i], decreasing[j] + arr[i]);
                }
            }
        }
        for(int i = 0; i < n; i++){
	        maxSum = Math.max(maxSum,  increasing[i] + decreasing[i] - arr[i]);
	    }
        
        return maxSum;
    }
}