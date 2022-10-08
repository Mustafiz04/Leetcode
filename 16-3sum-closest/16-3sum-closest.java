class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[n-1];
        
        Arrays.sort(nums);
        
        for(int i = 0; i<n-2; i++){
            int start = i+1, end = n-1;
            
            while( start < end ){
                int currSum = nums[i] + nums[start] + nums[end];
                if( currSum < target ){
                    start++;
                }else{
                    end--;
                }
                
                if(Math.abs( currSum - target ) < Math.abs(result - target) ){
                    result = currSum;
                }
            }
        }
        return result;
    }
}