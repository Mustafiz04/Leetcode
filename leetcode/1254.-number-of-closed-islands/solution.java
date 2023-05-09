class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        if( row == 0 ) return 0;
        int col = grid[0].length;
        int island = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if( grid[i][j] == 0 && dp(grid, i, j, row, col) ){
                    island++;
                }
            }
        }
        return island;
    }
    
    public boolean dp(int[][] grid, int i, int j, int row, int col){
        if( i < 0 || j < 0 || i >= row || j >= col ) return false;
        if( grid[i][j] == 1 ) return true;
        grid[i][j] = 1;
        return dp(grid, i+1, j, row, col) & dp(grid, i-1, j, row, col) & dp(grid, i, j+1, row, col) & dp(grid, i, j-1, row, col); 
    }
}
