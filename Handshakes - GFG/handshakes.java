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
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.count(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int count(int n) { 
        int[] dp = new int[n+1];
        dp[0] = 1;
        for(int i = 2; i<=n; i+=2){
            for(int j = 2; j<= i; j+=2){
                dp[i] += dp[j-2] * dp[i - j];
            }
        }
        return dp[n];
    }
};
