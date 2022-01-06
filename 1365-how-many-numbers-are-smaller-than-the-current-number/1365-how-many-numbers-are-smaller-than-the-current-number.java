class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] freq = new int[101];
        int[] smaller = new int[101];
        for(int num : nums){
            freq[num]++;
        }
        int runner = 0;
        for(int i = 0; i<101; i++){
            smaller[i] = runner;
            runner += freq[i];
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = smaller[nums[i]];
        }
        
        return nums;
    }
}