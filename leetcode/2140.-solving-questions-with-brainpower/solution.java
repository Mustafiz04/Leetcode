class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        dp[n-1] = questions[n-1][0];
        long ans = dp[n-1];
        for(int i = n-2; i>= 0; i--) {
            int skip = questions[i][1];
            int point = questions[i][0];

            if( i + skip + 1 >= n ) {
                dp[i] = Math.max(dp[i+1], point);
            } else {
                dp[i] = Math.max( dp[i+1], point + dp[i + skip + 1] );
            }
        }

        return dp[0];
    }
}

// [[21,5],[92,3],[74,2],[39,4],[58,2],[5,5],[49,4],[65,3]]

// [157, 157, 144, 123, 123, 65, 65, 65]

// ans = 123
// n = 8
// i = 1, skip = 3, point = 92