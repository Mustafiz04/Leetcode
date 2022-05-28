class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return 0;
        int sum = 0;
        for(int i : nums) sum += i;
        int actualSum = n * (n + 1)/2;
        return actualSum - sum;
    }
}