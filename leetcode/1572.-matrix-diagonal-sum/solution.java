class Solution {
    public int diagonalSum(int[][] mat) {
        int row = mat.length;
        if(row == 0) return 0;
        int sum = 0;
        for(int i = 0; i<row; i++) {
            sum += mat[i][i] + mat[i][row-i-1];
        }
        if( row % 2 == 0 ) {
            return sum;
        }
        return sum - mat[row/2][row/2];
    }
}