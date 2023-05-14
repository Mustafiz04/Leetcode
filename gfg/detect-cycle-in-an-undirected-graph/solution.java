...// } Driver Code Ends
class Node {
    int node, parent;
    Node(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}
class Solution {
    public boolean checkCycle(int i, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(i, -1));
        vis[i] = true;
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            int node = curr.node;
            int parent = curr.parent;
            
            for(int n: adj.get(node)) {
                if( !vis[n] ) {
                    q.add(new Node(n, node));
                    vis[n] = true;
                } else if( parent != n ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        
        for(int i = 0; i<V; i++) {
            if( !vis[i] ) {
                if(checkCycle(i, adj, vis) ) {
                    return true;
                }
            }
        }
        