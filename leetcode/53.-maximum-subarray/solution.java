class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int maxSumSoFar = nums[0];

        for(int i = 1; i<n; i++) {
            maxSumSoFar = Math.max(maxSumSoFar + nums[i], nums[i]);
            maxSum = Math.max(maxSum, maxSumSoFar);
        }

        return maxSum;
    }
}