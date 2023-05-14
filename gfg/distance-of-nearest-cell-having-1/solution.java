        this.step = step;
    }
}
class Solution{
    public int[][] nearest(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<Node> q = new LinkedList<>();
        boolean[][] vis = new boolean[row][col];
        
        for(int i = 0; i<row; i++) {
            for(int j = 0; j<col; j++) {
                if( grid[i][j] == 1 ) {
                    vis[i][j] = true;
                    q.add(new Node(i, j, 0));
                }
            }
        }
        
        int[] xDir = {1, -1, 0, 0};
        int[] yDir = {0, 0, -1, 1};
        
        while( !q.isEmpty() ) {
            Node curr = q.poll();
            int x = curr.x;
            int y = curr.y;
            int step = curr.step;
            grid[x][y] = step;
            
            for(int i = 0; i<4; i++) {
                int newX = x + xDir[i];
                int newY = y + yDir[i];
                if( newX >= 0 && newX < row && newY >= 0 && newY < col && vis[newX][newY] == false ) {
                    vis[newX][newY] = true;
                    q.add(new Node(newX, newY, step+1));
                }
            }
        }
        
        return grid;
    }
}