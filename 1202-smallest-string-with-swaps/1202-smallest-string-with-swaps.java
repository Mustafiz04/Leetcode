class Solution {
    final static int N = 100001;
    boolean[] visited = new boolean[N];
    List<Integer>[] adj = new ArrayList[N]; 
    
    private void DFS(String s, int vertex, List<Character> characters, List<Integer> indices) {
        characters.add(s.charAt(vertex));
        indices.add(vertex);
        
        visited[vertex] = true;
        
        for (int adjacent : adj[vertex]) {
            if (!visited[adjacent]) {
                DFS(s, adjacent, characters, indices);
            }
        }
    }
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
         for (int i = 0; i < s.length(); i++) {
            adj[i] = new ArrayList<Integer>();
        }
        
        for (List<Integer> edge : pairs) {
            int source = edge.get(0);
            int destination = edge.get(1);
            
            adj[source].add(destination);
            adj[destination].add(source);
        }
        
        char[] answer = new char[s.length()];
        for (int vertex = 0; vertex < s.length(); vertex++) {
            if (!visited[vertex]) {
                List<Character> characters = new ArrayList<>();
                List<Integer> indices = new ArrayList<>();
                
                DFS(s, vertex, characters, indices);
                Collections.sort(characters);
                Collections.sort(indices);

                for (int index = 0; index < characters.size(); index++) {
                    answer[indices.get(index)] = characters.get(index);
                }
            }
        }
        return new String(answer);
    }
}