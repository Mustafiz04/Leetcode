class Solution {
    public int majorityElement(int[] nums) {
        int count = 1, majority = nums[0], n = nums.length;
        for(int num : nums){
            if( num == majority ){
                count++;
            }else{
                count--;
                if( count == 0 ){
                    majority = num;
                    count = 1;
                }
            }
        }
        // count = 0;
        // for(int num : nums){
        //     if( num == majority ) count++;
        // }
        return majority;
    }
}