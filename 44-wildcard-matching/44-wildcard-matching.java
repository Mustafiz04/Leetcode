class Solution {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i<=n; i++){
            Arrays.fill(dp[i], -1);
        }
        return wildCard(s, p, n, m, dp) == 1;
    }
    
    public int wildCard(String s, String p, int n, int m, int[][] dp){
        if( n == 0 && m == 0 ) return 1;
        if( n == 0 ) {
            for(int i = 0; i<m; i++){
                if( p.charAt(i) != '*' ) return 0;
            }
            return 1;
        }
        if( m == 0 ) return 0;
        if( dp[n][m] != -1 ) return dp[n][m];
        if( s.charAt(n-1) == p.charAt(m-1) || p.charAt(m-1) == '?' ){
            return dp[n][m] = wildCard(s, p, n-1, m-1, dp);
        }
        if( p.charAt(m-1) == '*' ){
            int a = wildCard(s, p, n, m-1, dp);
            int b = wildCard(s, p, n-1, m, dp);
            return dp[n][m] = (a == 1 || b == 1) == true ? 1 : 0; 
        }
        return dp[n][m] = 0;
    }
}