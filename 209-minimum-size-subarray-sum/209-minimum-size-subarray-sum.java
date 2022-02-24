class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if( n == 0 ) return 0;
        int start = 0, end = 0, minLen = n+1, currSum = 0;
        boolean isPossible = false;
        while( end < n ){
            while( currSum < target && end < n ){
                currSum += nums[end++];
            }
            while( currSum >= target && start < n ){
                isPossible = true;
                minLen = Math.min(minLen, end - start);
                currSum -= nums[start++];
            }
        }
        if( !isPossible ){
            return 0;
        }
        return minLen;
    }
}