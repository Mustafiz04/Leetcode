class Solution {
    int[][] dp = new int[101][101];
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        if( n == 0 ) return 0;
        int m = obstacleGrid[0].length;
        return path(obstacleGrid, n, m);
    }
    
    public int path(int[][] obstacleGrid, int n, int m){
        if( n <= 0 || m <= 0 || obstacleGrid[n-1][m-1] == 1 ){
            return 0;
        }
        if( n == 1 && m == 1 ){
            return 1;
        }
        if( dp[n-1][m-1] != 0 ) return dp[n-1][m-1];
        return dp[n-1][m-1] = path(obstacleGrid, n-1, m) + path(obstacleGrid, n, m-1);
        
    }
}