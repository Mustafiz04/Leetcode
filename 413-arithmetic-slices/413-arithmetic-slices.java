class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if( n < 3 ) return 0;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 0;
        int count = 0;
        for(int i = 2; i<n; i++){
            if( nums[i] - nums[i-1] == nums[i-1] - nums[i-2]  ){
                dp[i] = 1 + dp[i-1];
                count += dp[i];
            }
        }
        return count;
    }
}