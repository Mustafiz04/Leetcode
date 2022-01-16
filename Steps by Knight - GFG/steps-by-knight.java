// { Driver Code Starts
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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution{
    class Pair{
        int x, y, dis;
        Pair(int x, int y, int dis){
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N){
        int x = KnightPos[0];
        int y = KnightPos[1];
        int m = TargetPos[0];
        int n = TargetPos[1];
        
        int[][] vis = new int[N+1][N+1];
        Queue<Pair> q = new LinkedList<>();
        vis[x][y] = 1;
        q.add(new Pair(x, y, 0) );
        int dx[] = { -2, -1, 1, 2, -2, -1, 1, 2 };
        int dy[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
        
        while( !q.isEmpty() ){
            Pair curr = q.poll();
            if( curr.x == m && curr.y == n ){
                return curr.dis;
            }
            for(int i = 0; i<8; i++){
                int newX = curr.x + dx[i];
                int newY = curr.y + dy[i];
                if( isValid(newX, newY, N) && vis[newX][newY] == 0 ){
                    vis[newX][newY] = 1;
                    q.add(new Pair(newX, newY, curr.dis + 1 ));
                }
            }
        }
        return -1;
    }
    
    public boolean isValid(int x, int y, int N){
        return x > 0 && x <= N && y > 0 && y <= N;
    }
}