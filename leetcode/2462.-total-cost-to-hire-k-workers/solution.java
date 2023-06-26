class Pair {
    int value, section;
    Pair(int value, int section) {
        this.value = value;
        this.section = section;
    }
}

class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if( a.value == b.value ) {
                return a.section - b.section;
            }
            return a.value - b.value;
        });

        for(int i = 0; i < candidates; i++ ) {
            pq.offer(new Pair(costs[i], 0));
        }

        for(int i = Math.max(candidates, n - candidates); i < n; i++) {
            pq.offer(new Pair(costs[i], 1));
        }

        long answer = 0;
        int nextHead = candidates;
        int nextTail = n - candidates - 1;
        for(int i = 0; i<k; i++) {
            Pair currCan = pq.poll();
            answer += currCan.value;
            int currSection = currCan.section;

            if( nextHead <= nextTail ) {
                if( currSection == 0 ) {
                    pq.offer(new Pair(costs[nextHead], currSection));
                    nextHead++;
                } else {
                    pq.offer(new Pair(costs[nextTail], currSection));
                    nextTail--;
                }
            }
        }

        return answer;
    }
}