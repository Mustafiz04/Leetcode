class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n-1; i> 1; i--){
            int c = nums[i], b = nums[i-1], a = nums[i-2];
            if( c < a + b ) return a + b + c;
        }
        return 0;
    }
}