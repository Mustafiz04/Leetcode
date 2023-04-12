class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                if(i != j && isConnected[i][j] == 1) {
                    graph.get(i).add(j);
                }
            }
        }

        boolean[] vis = new boolean[n];
        int total = 0;
        for(int i = 0; i<n; i++) {
            if(!vis[i]) {
                total++;
                dfs(i, graph, vis);
            }   
        }
        return total;
    }

    public void dfs(int start, ArrayList<ArrayList<Integer>> graph, boolean[] vis){
        vis[start] = true;
        for(int neigh: graph.get(start)) {
            if(!vis[neigh]) {
                dfs(neigh, graph, vis);
            }
        }
    }
}