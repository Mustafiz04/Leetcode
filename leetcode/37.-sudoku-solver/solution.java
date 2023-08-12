class Solution {
    public void solveSudoku(char[][] board) {
        solveSudokuUtil(board, 9);
    }
    
    public boolean solveSudokuUtil(char[][] board, int n){
        int row = -1, col = -1;
        boolean isEmpty = false;
        for(int i = 0; i<9; i++){
            for(int j = 0; j<9; j++){
                if( board[i][j] == '.' ){
                    row = i;
                    col = j;
                    isEmpty = true;
                    break;
                }
            }
            if( isEmpty ){
                break;
            }
        }
        if( !isEmpty ){
            return true;
        }
        
        for(char i = '1'; i<= '9'; i++){
            if( isSafe(board, row, col, i) ){
                board[row][col] = i;
                if( solveSudokuUtil( board, n ) ){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    
    public boolean isSafe(char[][] board, int row, int col, char num){
        for(int d = 0; d < 9; d++){
            if( board[row][d] == num ) {
                return false;
            }
        }
        for(int r = 0; r < 9; r++){
            if( board[r][col] == num ) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(9);
        int rs = row - row % sqrt;
        int cs = col - col % sqrt;
        
        for(int r = rs; r < rs+sqrt; r++){
            for(int c = cs; c<cs+sqrt; c++){
                if( board[r][c] == num ){
                    return false;
                }
            }
        }
        return true;
    }
}