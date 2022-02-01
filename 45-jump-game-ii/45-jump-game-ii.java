class Solution {
    public int jump(int[] nums) {
        int jump = 0;
		int left = 0;
		int right = 0;
		//till we reach end of the array
		while (right < nums.length - 1) {
			int max = 0;
			//find max reach (in range of indexes left and right)
			for (int i = left; i <= right; i++) {
				max = Math.max(nums[i] + i, max);
			}
			//update new boundaries
			left = right + 1;
			right = max;
			jump++;
		}
		return jump;
//         int n = nums.length;
        
//         int[] dp = new int[n];
//         Arrays.fill(dp, Integer.MAX_VALUE-1);
//         dp[0] = 0;
//         int minStep = Integer.MAX_VALUE;
//         for(int i = 0; i<n; i++){
//             for(int j = 0; j<i; j++){
//                 if( j + nums[j] >= i ){
//                     dp[i] = Math.min(dp[j] + 1, dp[i] );
//                 }
//             }
//         }
//         return dp[n-1];
    }
}