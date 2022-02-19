// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static ArrayList<String> ans = new ArrayList<>();
    public static ArrayList<String> findPath(int[][] m, int n) {
        String path = "";
        ans.clear();
        dfs(m, 0, 0, n, path);
        Collections.sort(ans);
        return ans;
    }
    
    public static void dfs(int[][] m, int x, int y, int n, String path){
        if( x < 0 || x >= n || y < 0 || y >= n || m[x][y] != 1 ) return;
        if( x == n-1 && y == n-1 ){
            ans.add(path);
            m[x][y] = 1;
            return;
        }
        
        m[x][y] = 2;
        
        path += "U";
        dfs(m, x-1, y, n, path);
        path = path.substring(0, path.length() - 1);
        
        path += "L";
        dfs(m, x, y-1, n, path);
        path = path.substring(0, path.length() - 1);
        
        path += "R";
        dfs(m, x, y+1, n, path);
        path = path.substring(0, path.length() - 1);
        
        path += "D";
        dfs(m, x+1, y, n, path);
        path = path.substring(0, path.length() - 1);
        
        m[x][y] = 1;
        return;
    }
}