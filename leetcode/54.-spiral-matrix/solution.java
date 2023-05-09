class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        int row = matrix.length;
        if(row == 0) return ans;
        int col = matrix[0].length;
        int direction = 0;
        int top = 0, down = row - 1, left = 0, right = col - 1;

        while( left <= right && top <= down ) {
            if( direction == 0 ) {
                for(int i = left; i<=right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;               
            } else if( direction == 1 ) {
                for(int i = top; i<= down; i++) {
                    ans.add(matrix[i][right]);
                }
                right--;
            } else if( direction == 2 ) {
                for(int i = right; i>=left ; i--) {
                    ans.add(matrix[down][i]);
                }
                down--;
            } else if( direction == 3 ) {
                for(int i = down; i>=top ; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;;
            }
            direction = (direction + 1) % 4;
        }
        return ans;
    }
}