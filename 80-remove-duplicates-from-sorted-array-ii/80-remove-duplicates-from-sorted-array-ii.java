class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if( n < 3 ) return n;
        int prev = nums[0], count = 1, length = 1;
        for(int i = 1; i<n; i++){
           if( nums[i] != prev ){
               count = 1;
               prev = nums[i];
               nums[length++] = nums[i];
           }else if( count++ < 2 ) {
               nums[length++] = nums[i];
           }
        }
        return length;
    }
}