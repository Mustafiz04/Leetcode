

//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
       int n = S.length();
       
       return n - lcs(S, reverse(S), n);
    }
    
    static int lcs(String s, String t, int n) {
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n; j++) {
                if(s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = 1 + dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][n];
    }
    
    static String reverse(String s) {
        String ans = "";
        for(int i = s.length() - 1; i>= 0; i--) {
            ans += s.charAt(i);
        }
        return ans;
    }
}


// aebcbda
// adbcbea

// abcba
// abcba