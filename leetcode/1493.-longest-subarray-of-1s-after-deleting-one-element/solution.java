class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int countOfZero = 0;
        for(int i : nums) {
            if(i == 0) countOfZero++;
        }
        if( countOfZero == 0 ) return n - 1;
        int left = 0, count = 0, ans = 0;
        for(int i = 0; i<n; i++) {
            count += nums[i] == 0 ? 1 : 0;
            while(count > 1 && left < i) {
                count -= nums[left] == 0 ? 1 : 0;
                left++;
            }
            ans = Math.max(ans, i - left);
        }
        return ans;
    }
}