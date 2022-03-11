class Solution {
    int maxArea = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        if( row == 0 ) return 0;
        int col = grid[0].length;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if( grid[i][j] == 1 ){
                    int count = island(grid, i, j, row, col);
                    maxArea = Math.max(maxArea, count);
                }
            }
        }
        return maxArea;
    }
    
    public int island(int[][] grid, int i, int j, int row, int col){
        if( i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != 1 ){
            return 0;
        }
        grid[i][j] = 2;
        int a = island(grid, i+1, j, row, col);
        int b = island(grid, i-1, j, row, col);
        int c = island(grid, i, j+1, row, col);
        int d = island(grid, i, j-1, row, col);
        return 1 + a + b + c + d;
    }
}