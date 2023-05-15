class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }
        
        ArrayList<ArrayList<Integer>> graph = buildingGraph(n , connections);
        
        int count = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                count++;
                DFS(i, graph, visited );
            }
        }
        return count - 1;
    }
    
    public static void DFS(int src , ArrayList<ArrayList<Integer>> graph , boolean[] visited){
        visited[src] = true;
        for(int element : graph.get(src)){
            if(visited[element] == false){
                DFS(element , graph , visited );
            }
        }
    }
    
    public static ArrayList<ArrayList<Integer>> buildingGraph(int n , int[][] connections){
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] row: connections){
            int u = row[0];
            int v = row[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        return graph;
    }
}