// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];
        for(int i = 0; i< V; i++){
            if( vis[i] != 1 && isCyclicUtil(i, adj, vis) )
                return true;
        }
        return false;
    }
    
    public boolean isCyclicUtil(int src, ArrayList<ArrayList<Integer>> adj, int[] vis){
        if( vis[src] == 2 ){
            return true;
        }
        vis[src] = 2;
        for(int next : adj.get(src)){
            if( vis[next] != 1 && isCyclicUtil(next, adj, vis) ){
                return true;
            }
        }
        vis[src] = 1;
        return false;
    }
}