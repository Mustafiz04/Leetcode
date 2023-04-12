class Solution {
    boolean found = false;
    public boolean validPath(int n, int[][] edges, int start, int end) {
        if(start == end) return  true;
        
        // Map<Integer,List<Integer>> graph = new HashMap();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];
        
        for(int i = 0 ; i < n ; i++) graph.add(new ArrayList());
        for(int[] edge : edges){
           graph.get(edge[0]).add(edge[1]);
           graph.get(edge[1]).add(edge[0]);
        }

        dfs(graph, visited, start, end);
        return found;
    }
    
    private void dfs(ArrayList<ArrayList<Integer>> graph,boolean[] visited, int start, int end){
        if(visited[start] || found) return;
        visited[start] = true;
        for(int nei : graph.get(start)){
            if(nei == end){
                found = true;
                break;
            }
            if(!visited[nei]){
                dfs(graph, visited, nei, end);
            }
        }
    }
}