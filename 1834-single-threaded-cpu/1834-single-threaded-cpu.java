class Solution {
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] result = new int[n];
        int[][] jobs = new int[n][3];
        for(int i = 0; i<n; i++) jobs[i] = new int[]{tasks[i][0], tasks[i][1], i};
        Arrays.sort(jobs, (a, b) -> a[0] - b[0] );
        PriorityQueue<int[]> pq = new PriorityQueue<>( (a, b) -> {
            if( a[1] == b[1] ){
                return a[2] - b[2];
            }
            return a[1] - b[1];
        });
        int i = 0, k = 0, time = 0;
        while( !pq.isEmpty() || i < n ){
            if( pq.isEmpty() ) time = Math.max(time, jobs[i][0]);
            while( i < n && time >= jobs[i][0] ){
                pq.add(jobs[i++]);
            }
            int[] curr = pq.poll();
            time += curr[1];
            result[k++] = curr[2];
        }
        return result;
    }
}