class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        if(n == 0) return new int[0];
        int[] prefixSum = new int[n];
        int[] postfixSum = new int[n];
        prefixSum[0] = 1;
        postfixSum[n-1] = 1;
        for(int i = 1; i<n; i++){
            prefixSum[i] = nums[i-1] * prefixSum[i-1];
        }

        for(int i = n-2; i>= 0; i--) {
            postfixSum[i] = nums[i+1] * postfixSum[i+1];
        }

        for(int i = 0; i<n; i++){
            nums[i] = prefixSum[i] * postfixSum[i];
        }

        return nums;
    }
}
