class Solution {
    public int arraySign(int[] nums) {
        int negative = 0, zero = 0;
        for(int i : nums){
            if( i == 0 ) return 0;
            else if( i < 0 ) negative++;
        }
        if( negative % 2 == 0 ) return 1;
        return -1;
    }
}