class Solution {
    int[][] dp = new int[201][201];
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        return pathSum(grid, n, m);
        // int row = grid.length;
        // int col = grid[0].length;
        // int[][] dp = new int[row][col];
        // dp[0][0] = grid[0][0];
        // for(int i = 1; i<row; i++){
        //     dp[i][0] = dp[i-1][0] + grid[i][0];
        // }
        // for(int i = 1; i<col; i++){
        //     dp[0][i] = dp[0][i-1] + grid[0][i];
        // }
        // for(int i = 1; i<row; i++){
        //     for(int j = 1; j<col; j++){
        //         dp[i][j] = Math.min( dp[i-1][j], dp[i][j-1] ) + grid[i][j];
        //     }
        // }
        // return dp[row-1][col-1];
    }
    
    public int pathSum(int[][] grid, int n, int m){
        if( n <= 0 || m <= 0 ) return Integer.MAX_VALUE;
        if( n == 1 && m == 1 ) return grid[n-1][m-1];
        if( dp[n][m] != 0 ) return dp[n][m];
        return dp[n][m] = grid[n-1][m-1] + Math.min( pathSum(grid, n-1, m), pathSum(grid, n, m-1) );
    }
}