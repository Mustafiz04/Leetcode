class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n+1][m+1];
        return lcs(text1, text2, n, m, dp);
    }
    
    public int lcs(String s, String t, int n, int m, int[][] dp){
        if( n == 0 || m == 0 ) return 0;
        if( dp[n][m] != 0 ) return dp[n][m];
        if( s.charAt(n-1) == t.charAt(m-1) ){
            return dp[n][m] = 1 + lcs(s, t, n-1, m-1, dp);
        }else{
            return dp[n][m] = Math.max(lcs(s, t, n-1, m, dp), lcs(s, t, n, m-1, dp) );
        }
    }
}