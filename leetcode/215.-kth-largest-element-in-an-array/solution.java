class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i: nums) {
            pq.add(i);
            while( pq.size() > k ) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}

// 1 2 2 3 3 4 5 5 6