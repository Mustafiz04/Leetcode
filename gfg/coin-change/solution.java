

// User function Template for Java

class Solution {
    public long count(int S[], int n, int sum) {
        long[][] dp = new long[n+1][sum+1];
        for(int i = 0; i<=sum; i++) dp[0][i] = 0;
        for(int i = 0; i<=n; i++) dp[i][0] = 1;
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if( S[i-1] > j ){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-S[i-1]];
                }
            }
        }
        return dp[n][sum];
        // if( n == 0 ) return 0;
        // if( sum == 0 ) return 1;
        
        // if( S[n-1] > sum ){
        //     return count(S, n-1, sum);
        // }else{
        //     return count(S, n-1, sum) + count(S, n, sum-S[n-1]);
        // }
    }
}