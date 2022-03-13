// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int mod = 1000000007;
    public int FindWays(int n, int m, int[][] blocked_cells){
        int[][] grid = new int[n][m];
        int len = blocked_cells.length;
        for(int i = 0; i<len; i++){
            int row = blocked_cells[i][0], col = blocked_cells[i][1];
            grid[row-1][col-1] = 1;
        }
        int[][] path = new int[n+1][m+1];
        return getWays(path, grid, n-1, m-1);
    }
    
    public int getWays(int[][] path, int[][] grid, int n, int m){
        if( n < 0 || m < 0 || grid[n][m] == 1 ) return 0;
        if( n == 0 && m == 0 ) return 1;
        if( path[n][m] != 0 ) return path[n][m];
        return path[n][m] += (getWays(path, grid, n-1, m)%mod + getWays(path, grid, n, m-1)%mod)%mod;
    }
}