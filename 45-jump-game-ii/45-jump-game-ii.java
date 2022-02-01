class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE-1);
        dp[0] = 0;
        int minStep = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                if( j + nums[j] >= i ){
                    dp[i] = Math.min(dp[j] + 1, dp[i] );
                }
            }
        }
        return dp[n-1];
    }
}