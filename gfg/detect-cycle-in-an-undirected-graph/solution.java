class Solution {
    class Node {
        int val, parent;
        Node(int val, int parent) {
            this.val = val;
            this.parent = parent;
        }
    }
    
    public boolean checkCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(src, -1));
        while(!q.isEmpty()) {
            Node currNode = q.poll();
            int currVal = currNode.val;
            int parent = currNode.parent;
            
            for(int adjNode: adj.get(currVal)) {
                if( !vis[adjNode] ) {
                    vis[adjNode] = true;
                    q.add(new Node(adjNode, currVal));
                } else if ( parent != adjNode ) {
                    return true;
                }
            }
        }
        return false;
    }
    
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V+1];
        for(int i = 0; i<V; i++) {
            if(!vis[i]) {
                if(checkCycle(i, adj, vis)) return true;
            }
        }
        
        return false;
    }
}