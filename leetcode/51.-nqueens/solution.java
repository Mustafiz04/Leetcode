class Solution {
    List<List<String>> ans = new ArrayList<>();
    
    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        solveUtil(board, 0);
        return ans;
    }
    
    public boolean solveUtil(int[][] board, int row){
        int n = board.length;
        if( row == n ){
            print(board);
            return true;
        }
        for(int col = 0; col<n; col++){
            if( isSafe(board, row, col) ){
                board[row][col] = 1;
                solveUtil(board, row+1);
                board[row][col] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int[][] board, int row, int col) {
        int N = board.length;
        for (int i = 0; i < row; i++) 
            if (board[i][col] == 1) 
                return false; 

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) 
            if (board[i][j] == 1) 
                return false; 
  
        for (int i = row, j = col; j >= 0 && i < N; i++, j--) 
            if (board[i][j] == 1) 
                return false; 

        for (int i = row, j = col; i < N && j < N; i++, j++) 
            if (board[i][j] == 1) 
                return false; 
  
        for (int i = row, j = col; j < N && i >= 0; i--, j++) 
            if (board[i][j] == 1) 
                return false; 

        return true;
    }

    public void print(int[][] board){
        List<String> r = new ArrayList<>();
        int row = board.length;
        for(int i = 0; i< row; i++){
            String a = "";
            for(int j = 0; j<row; j++ ){
                if( board[i][j] == 0 ){
                    a += ".";
                }else{
                    a += "Q";
                }
            }
            r.add(a);
        }
        ans.add(r);
    }
    
}