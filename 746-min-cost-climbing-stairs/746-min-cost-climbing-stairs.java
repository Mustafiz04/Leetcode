class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min( minCost(cost, 0, dp), minCost(cost, 1, dp) );
    }
    
    public int minCost(int[] cost, int index, int[] dp){
        if( index >= cost.length ) return 0;
        if( dp[index] != -1 ) return dp[index];
        return dp[index] = cost[index] + Math.min(minCost(cost, index+1, dp), minCost(cost, index+2, dp));
    }
    
    
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     if(n == 0) return 0;
    //     int[] dp = new int[n+1];
    //     dp[n-1] = cost[n-1];
    //     for(int i = n-2; i>=0; i--){
    //         dp[i] = Math.min(dp[i+1], dp[i+2]) + cost[i];
    //     }
    //     return Math.min(dp[0], dp[1]);
    // }
    
}