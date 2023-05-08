...// } Driver Code Ends
class Solution {
    ArrayList<Integer> ans = new ArrayList<Integer>();
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        dfs(0, adj, vis);
        return ans;
    }
    
    public void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[v] = true;
        ans.add(v);
        for(int neigh: adj.get(v)) {
            if( !vis[neigh] ) {
                dfs(neigh, adj, vis);
            }
        }
    }
}