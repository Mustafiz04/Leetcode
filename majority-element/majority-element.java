class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, majority = 0;
        for(int num : nums){
            if(count == 0){
                majority = num;
            }
            if( num == majority ){
                count++;
            }else{
                count--;
            }
        }
        return majority;
    }
}