    int node, parent;
    Node(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}
class Solution {
    // DFS
    public boolean checkCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[node] = true;
        
        for(int n: adj.get(node)) {
            if( !vis[n] ) {
                if( checkCycle(n, node, adj, vis) ) return true;
            } else if( n != parent ) {
                return true;
            }
        }
        return false;
    }
    
    // BFS
    // public boolean checkCycle(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {...// }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i<V; i++) {
            if( !vis[i] ) {
                // BFS
                // if(checkCycle(i, adj, vis) ) {
                //     return true;
                // }
                
                // DFS
                if( checkCycle(i, -1, adj, vis) ) return true;
            }
        }
        
        return false;
    }
}