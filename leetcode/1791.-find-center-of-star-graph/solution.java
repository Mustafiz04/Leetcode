class Solution {
    public int findCenter(int[][] edges) {
        int e = edges.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] edge: edges) {
            map.put(edge[0], map.getOrDefault(edge[0], 0) + 1 );
            map.put(edge[1], map.getOrDefault(edge[1], 0) + 1 );
        }
        int n = map.size();
        for(int i = 1; i<=n; i++) {
            if( map.get(i) == n-1 ) return i;
        }
        return -1;
    }
}