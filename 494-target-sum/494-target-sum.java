class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       return findTargetSumWays(nums, target, 0, 0);
    }
    
    public int findTargetSumWays(int[] nums, int target, int idx, int curr) {
        if(idx == nums.length) return curr == target ? 1 : 0;
        return findTargetSumWays(nums, target, idx + 1, curr + nums[idx])
               + findTargetSumWays(nums, target, idx + 1, curr - nums[idx]);
    }
}