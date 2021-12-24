class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int n = nums.length;
        if( n == 2 ) return true;
        int indexToRemove = 0, count = 0;
        for(int i = 0; i<n-1; i++){
            if( nums[i] >= nums[i+1] ){
                indexToRemove = i;
                count++;
            }
        }
        
        if( count > 1 ) return false;
        if( indexToRemove == 0) return true;
        if( nums[indexToRemove - 1] >= nums[indexToRemove + 1] ){
            indexToRemove += 1;
        }
        
        if( indexToRemove == n-1 ) return true;
        
        for(int i = 0; i<indexToRemove - 1; i++){
            if( nums[i] >= nums[i+1] ){
                return false;
            }
        }
        
        for(int i = indexToRemove+1; i<n - 1; i++){
            if( nums[i] >= nums[i+1] ){
                return false;
            }
        }
        
        if( nums[indexToRemove - 1] >= nums[indexToRemove + 1] ){
            return false;
        }
        
        return true;
    }
}