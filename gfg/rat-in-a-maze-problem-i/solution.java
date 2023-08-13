

class Solution {
    static ArrayList<String> ans = new ArrayList<>();
    public static ArrayList<String> findPath(int[][] m, int n) {
        ans = new ArrayList<>();
        boolean[][] vis = new boolean[n][n];
        if( m[0][0] == 1) getAllPath(m, 0, 0, n, "", vis);
        return ans;
    }
    
    public static void getAllPath(int[][] grid, int r, int c, int n, String path, boolean[][] vis) {
        if( r == n-1 && c == n-1 ) {
            ans.add(path);
            return;
        }
        // DOWN
        if( r+1 < n && !vis[r+1][c] && grid[r+1][c] == 1 ) {
            vis[r][c] = true;
            getAllPath(grid, r + 1, c, n, path + "D", vis);
            vis[r][c] = false;
        }
        
        // LEFT
        if( c-1 >= 0 && !vis[r][c-1] && grid[r][c-1] == 1 ) {
            vis[r][c] = true;
            getAllPath(grid, r, c-1, n, path + "L", vis);
            vis[r][c] = false;
        }
        
        // RIGHT
        if( c+1 < n && !vis[r][c+1] && grid[r][c+1] == 1 ) {
            vis[r][c] = true;
            getAllPath(grid, r, c+1, n, path + "R", vis);
            vis[r][c] = false;
        }
        
        // UP
        if( r-1 >= 0 && !vis[r-1][c] && grid[r-1][c] == 1 ) {
            vis[r][c] = true;
            getAllPath(grid, r - 1, c, n, path + "U", vis);
            vis[r][c] = false;
        }
    }
}
