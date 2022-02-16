// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int totalIslands = 0;
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if( grid[i][j] == '1' ){
                    isIsland(grid, i, j, row, col);
                    totalIslands++;
                }
            }
        }
        return totalIslands;
    }
    
    public void isIsland(char[][] grid, int x, int y, int r, int c){
        if( x < 0 || y < 0 || x >= r || y >= c || grid[x][y] != '1' ) return;
        grid[x][y] = '2';
        isIsland(grid, x+1, y, r, c);
        isIsland(grid, x+1, y+1, r, c);
        isIsland(grid, x+1, y-1, r, c);
        isIsland(grid, x-1, y, r, c);
        isIsland(grid, x-1, y+1, r, c);
        isIsland(grid, x-1, y-1, r, c);
        isIsland(grid, x, y+1, r, c);
        isIsland(grid, x, y-1, r, c);
    }
}