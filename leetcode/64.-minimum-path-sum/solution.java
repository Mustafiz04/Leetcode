class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if(row == 0) return 0;
        int col = grid[0].length;
        int[][] answerGrid = new int[row][col];
        answerGrid[0][0] = grid[0][0];

        for(int i = 1; i< row; i++) {
            answerGrid[i][0] = answerGrid[i-1][0] + grid[i][0];
        }

        for(int i = 1; i< col; i++) {
            answerGrid[0][i] = answerGrid[0][i-1] + grid[0][i];
        }

        for(int i = 1; i<row; i++) {
            for(int j = 1; j<col; j++) {
                answerGrid[i][j] = Math.min(answerGrid[i-1][j], answerGrid[i][j-1]) + grid[i][j];
            }
        }

        return answerGrid[row-1][col-1];
    }
}