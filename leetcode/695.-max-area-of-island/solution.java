class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        if(row == 0) return 0;
        int col = grid[0].length;
        int maxArea = 0;
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if( grid[i][j] == 1 ) {
                    int count = dfs(grid, i, j, row, col);
                    maxArea = Math.max(maxArea, count);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int i, int j, int row, int col) {
        if( i < 0 || i >= row || j < 0 || j >= col || grid[i][j] != 1 ) {
            return 0;
        }
        grid[i][j] = 2;
        int a = dfs(grid, i+1, j, row, col);
        int b = dfs(grid, i-1, j, row, col);
        int c = dfs(grid, i, j+1, row, col);
        int d = dfs(grid, i, j-1, row, col);
        return 1 + a + b + c + d;
    }
}