

class Solution{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        ArrayList<Integer> ans = new ArrayList<>();
        int top = 0, left = 0, right = c -1, bottom = r - 1;
        int dir = 0;
        while( top <= bottom && left <= right ) {
            if( dir == 0 ) {
                for(int i = left; i<=right; i++) {
                    ans.add(matrix[top][i]);
                }
                top++;
            } else if(dir == 1) {
                for(int i = top; i<=bottom; i++) {
                    ans.add(matrix[i][right]);
                }
                right--; 
            } else if(dir == 2) {
                for(int i = right; i>=left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            } else if(dir == 3) {
                for(int i = bottom; i>=top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        return ans;
    }
}