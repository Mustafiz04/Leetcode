class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] memo = new int[target + 1];
        Arrays.fill(memo, -1);
        return findCombinationSum(target, nums, memo);
    }
    private int findCombinationSum(int sum, int[] nums, int[] memo) {
        if(sum == 0) return 1;
        if(sum < 0) return 0;
        
        if(memo[sum] != -1) return memo[sum];
        
        int count = 0;
        for(int i=0 ;i<nums.length ;i++)
            count += findCombinationSum(sum - nums[i], nums, memo);
        return memo[sum] = count;
    }
}