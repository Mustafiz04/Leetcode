class Solution {
    Boolean[] dp = new Boolean[100001];
    public boolean divisorGame(int n) {
        if( n <= 1 ) return false;
        if(dp[n] != null) return dp[n];
        for(int i = 1; i<n; i++){
            if( n % i == 0 && !divisorGame(n - i) ){
                return dp[n] = true;
            }
        }
        return dp[n] = false;
    }
}