class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int len = nums.length;
        int[] freqNums = new int[10001];
        int repeatedNums = 0;
        int maxSubArraySum = 0, currSum = 0;
        int start = 0;
        for(int end = 0; end<len; end++) {
            currSum += nums[end];
            freqNums[nums[end]]++;

            if(freqNums[nums[end]] == 2) {
                repeatedNums++;
            }

            while(start<end && repeatedNums !=0) {
                freqNums[nums[start]]--;
                currSum -= nums[start];

                if(freqNums[nums[start]] == 1) {
                    repeatedNums--;
                }
                start++;
            }               
            maxSubArraySum = Math.max(maxSubArraySum, currSum);
        }
        return maxSubArraySum;
    }
}