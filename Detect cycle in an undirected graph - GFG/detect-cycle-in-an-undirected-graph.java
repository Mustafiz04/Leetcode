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
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


class Node{
    int node, parent;
    Node(int node, int parent){
        this.node = node;
        this.parent = parent;
    }
}

class Solution {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        for(int i = 0; i< V; i++){
            // BFS
            // if( !vis[i] && isCycleBFS(i, adj, vis) ){
            //     return true;
            // }
            // DFS
            if( !vis[i] && isCycleDFS(i, -1, adj, vis) ){
                return true;
            }
        }
        return false;
    }
    
    public boolean isCycleDFS(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[node] = true;
        for(int next : adj.get(node)){
            if( !vis[next] ){
                if( isCycleDFS(next, node, adj, vis) ){
                    return true;   
                }
            }else if( next != parent ) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isCycleBFS(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis ){
        vis[node] = true;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(node, -1) );
        while(!q.isEmpty()){
            Node curr = q.poll();
            int currNode = curr.node;
            int parent = curr.parent;
            for(int next: adj.get(currNode) ){
                if( !vis[next] ){
                    vis[next] = true;
                    q.add(new Node(next, currNode));
                }else{
                    if( parent != next ) return true;
                }
            }
        }
        return false;
    }
}