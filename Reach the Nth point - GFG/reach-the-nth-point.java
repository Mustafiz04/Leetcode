// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int[] dp = new int[10001];
    public int nthPoint(int n){
        int MOD = 1000000007;
        // if( n <= 1 ) return n;
        // int[] dp = new int[n+1];
        // dp[0] = 1;
        // dp[1] = 1;
        // for(int i = 2; i<=n; i++){
        //     dp[i] = ((dp[i-1])%MOD + (dp[i-2])%MOD)%MOD;
        // }
        // return dp[n];
        if( n == 0 || n == 1 ) return 1;
        if( dp[n] != 0 ) return dp[n];
        return dp[n] = (nthPoint(n-1) + nthPoint(n-2) ) %MOD;
    }
}