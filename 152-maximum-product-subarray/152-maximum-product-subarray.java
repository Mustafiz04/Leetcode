class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = maxProd;
        
        for(int i = 1; i<n; i++){
            int curr = nums[i];
            int tempMax = Math.max(curr, Math.max( maxProd*curr, minProd*curr ) );
            minProd = Math.min(curr, Math.min( maxProd*curr, minProd*curr ) );
            maxProd = tempMax;
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}