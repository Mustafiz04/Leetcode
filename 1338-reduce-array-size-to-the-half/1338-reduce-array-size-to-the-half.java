class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> m = new HashMap<>();
        
        for(int i : arr) {
            m.put(i, m.getOrDefault(i,0) + 1);
        }
        
        LinkedHashMap<Integer, Integer> reverseSortedMap = new LinkedHashMap<>();
        m.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) 
            .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue())); //sort the map entries with respect to decreasing order of the values
        int half = arr.length/2;
        int rem = arr.length;
        int res = 0;
        for (Map.Entry<Integer,Integer> entry : reverseSortedMap.entrySet()) {
            if(rem <= half) break;
            rem -= entry.getValue();
            res++;
        }
        return res;
    }
}