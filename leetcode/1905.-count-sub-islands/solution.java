class Solution {
    boolean isValid = false;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int row = grid1.length;
        if(row == 0) return 0;
        int col = grid1[0].length;
        
        int count = 0;
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if( grid2[i][j] == 1 ) {
                    isValid = true;
                    dfs(grid1, grid2, i, j);
                    if(isValid) count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid1, int[][] grid2, int i, int j) {
        int row = grid2.length;
        int col = grid2[0].length;
        if( i < 0 || j < 0 || i >= row || j >= col || grid2[i][j] != 1 ) {
            return;
        }
        if( grid1[i][j] == 0 && grid2[i][j] == 1 ) isValid = false;
        grid2[i][j] = 0;

        dfs(grid1, grid2, i+1, j);
        dfs(grid1, grid2, i-1, j);
        dfs(grid1, grid2, i, j+1);
        dfs(grid1, grid2, i, j-1);

    }
}