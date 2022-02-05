// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking number of testcases
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            //taking number of steps in stair
            int n = sc.nextInt();
            
            //calling method countWays() of class Hops
            System.out.println(new Solution().countWays(n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static long countWays(int n){
        long MOD = 1000000007;
        if( n <= 2 ) return n;
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%MOD;
        }
        return dp[n];
    }
}

