class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> b.val-a.val);
        HashMap<Character,Integer> hm = new HashMap<>();
        char []c = s.toCharArray();
        for(int i=0;i<c.length;i++) {
            int count = hm.getOrDefault(c[i],0);
            hm.put(c[i],count+1);
        }
        for(Map.Entry<Character,Integer> entry: hm.entrySet()) {
            Pair pair = new Pair(entry.getKey(),entry.getValue());
            pq.add(pair);
        }
        StringBuilder sb = new StringBuilder("");
        while(!pq.isEmpty()) {
            Pair pair = pq.remove();
            int count = pair.val;
            char ch = pair.c;
            while(count--> 0) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public class Pair {
        int val;
        char c;
        public Pair(char c,int val) {
            this.c = c;
            this.val = val;
        }
    }
}