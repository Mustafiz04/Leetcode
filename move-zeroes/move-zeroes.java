class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return;
        int len = 0;
        for(int i = 0; i<n; i++){
            if( nums[i] != 0 ){
                int temp = nums[i];
                nums[i] = nums[len];
                nums[len] = temp;
                len++;
            }
        }
    }
}

// [1,3,12,0,12]
// one = 4
// zero = 2

// 0 < 5
