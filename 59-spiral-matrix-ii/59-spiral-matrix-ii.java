class Solution {
    public int[][] generateMatrix(int n) {
        int dir = 0, startRow = 0, endRow = n - 1, startCol = 0, endCol = n-1, num = 1;
        int[][] matrix = new int[n][n];
        while( startRow <= endRow && startCol <= endCol ){
            if( dir == 0 ){
                for(int i = startCol; i<=endCol; i++){
                    matrix[startRow][i] = num++;
                }
                startRow++;
            }else if( dir == 1 ){
                for(int i = startRow; i<=endRow; i++){
                    matrix[i][endCol] = num++;
                }
                endCol--;
            }else if( dir == 2 ){
                for(int i = endCol; i>=startCol; i--){
                    matrix[endRow][i] = num++;
                }
                endRow--;
            }else if( dir == 3 ){
                for(int i = endRow; i>=startRow; i--){
                    matrix[i][startCol] = num++;
                }
                startCol++;
            }
            dir = (dir + 1) % 4;
        }
        return matrix;
    }
}