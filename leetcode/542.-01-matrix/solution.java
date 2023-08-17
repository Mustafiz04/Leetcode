class Node {
    int x, y, step;
    Node(int x, int y, int step) {
        this.x = x;
        this.y = y;
        this.step = step;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        boolean[][] vis = new boolean[row][col];
        Queue<Node> q = new LinkedList<>();

        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if( mat[i][j] == 0 ) {
                    vis[i][j] = true;
                    q.add(new Node(i, j, 0));
                }
            }
        }

        int[] xdir = {1, -1, 0, 0};
        int[] ydir = {0, 0, 1, -1};

        while( !q.isEmpty() ) {
            Node curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            int step = curr.step;
            mat[x][y] = step;

            for(int i = 0; i<4; i++) {
                int newX = x + xdir[i];
                int newY = y + ydir[i];
                if( newX >= 0 && newX < row && newY >= 0 && newY < col && vis[newX][newY] == false ) {
                    vis[newX][newY] = true;
                    q.add(new Node(newX, newY, step+1));
                }
            }
        }

        return mat;
    }
}