class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int x : nums)
            sum += x;
        if(((sum - target) % 2 == 1) || (target > sum))
            return 0;
        
        int n = nums.length;
        int s2 = (sum - target)/2;
        int[][] t = new int[n + 1][s2 + 1];
        t[0][0] = 1;
        
        for(int i = 1; i < n + 1; i++) {
            for(int j = 0; j < s2 + 1; j++) {
                if(nums[i - 1] <= j)
                    t[i][j] = t[i-1][j] + t[i - 1][j - nums[i - 1]];
                else
                    t[i][j] = t[i - 1][j];
            }
        }
        return t[n][s2];
    }
    
    public int count(int[] nums, int sum, int n){
        int[][] dp = new int[n+1][sum+1];
        for(int i = 0; i<=sum; i++) dp[0][i] = 0;
        for(int i = 0; i<=n; i++) dp[i][0] = 1;
        
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if( nums[i-1] > j ){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i-1][j - nums[i-1]];
                }
            }
        }
        
        return dp[n][sum];
    }
            
    // public int findTargetSumWays(int[] nums, int target, int idx, int curr) {
    //     if(idx == nums.length) return curr == target ? 1 : 0;
    //     return findTargetSumWays(nums, target, idx + 1, curr + nums[idx])
    //            + findTargetSumWays(nums, target, idx + 1, curr - nums[idx]);
    // }
}