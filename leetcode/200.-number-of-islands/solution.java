class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        if( row == 0 ) return 0;
        int col = grid[0].length;
        int island = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if( grid[i][j] == '1' ){
                    island++;
                    isIsland(grid, i, j, row, col);
                }
            }
        }
        return island;
    }
    
    public void isIsland(char[][] grid, int i, int j, int row, int col){
        if( i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1' ){
            return;
        }
        grid[i][j] = '2';
        isIsland(grid, i+1, j, row, col);
        isIsland(grid, i-1, j, row, col);
        isIsland(grid, i, j+1, row, col);
        isIsland(grid, i, j-1, row, col);
    }
}