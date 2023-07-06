class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int start = 0, end = 0, maxLength = n+1, currSum = 0;
        boolean isPossible = false;
        while( end < n ) {
            while( currSum < target && end < n ) {
                currSum += nums[end];
                end++;
            }
            while( currSum >= target && start < n ) {
                isPossible = true;
                maxLength = Math.min(maxLength, end - start);
                currSum -= nums[start];
                start++;
            }
        }
        if( !isPossible ) return 0;
        return maxLength;
    }
}