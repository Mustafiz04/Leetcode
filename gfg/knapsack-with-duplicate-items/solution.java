

//User function Template for Java

class Solution{
    static int knapSack(int n, int w, int val[], int wt[]){
        int[][] dp = new int[n+1][w+1];
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=w; j++){
                if( wt[i-1] > j ){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j - wt[i-1]] + val[i-1] );
                }
            }
        }
        return dp[n][w];
    }
}