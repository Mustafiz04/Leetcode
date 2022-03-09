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
                    Solution ob = new Solution();
                    System.out.println(ob.countFriendsPairings(n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution{
    long MOD = 1000000007;
    public long countFriendsPairings(int n) { 
    //   if( n <= 2 ) return n;
    //   return countFriendsPairings(n-1) + countFriendsPairings(n-2)*(n-1);
        long[] dp = new long[n+1];
        for(int i = 0; i<=n; i++ ){
            if( i <= 2 ) dp[i] = i;
            else dp[i] = (dp[i-1] + dp[i-2]*(i-1))%MOD;
        }
        return dp[n]%MOD;
    }
}    
 