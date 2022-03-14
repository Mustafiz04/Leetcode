class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer,List<Integer>> m = new HashMap<>();
        int n = groupSizes.length;
        
        for(int i = 0; i<n; i++){
            if(m.containsKey(groupSizes[i])){
                List<Integer> l = m.get(groupSizes[i]);
                l.add(i);
                m.put(groupSizes[i],l);
            }else{
                List<Integer> l = new ArrayList<>();
                l.add(i);
                m.put(groupSizes[i],l);
            }
        }
        
        
        for(int k : m.keySet()){
            List<Integer> x = m.get(k);
            for(int i=0; i<x.size(); i=i+k){
                List<Integer> p = new ArrayList<>();
                for(int j = i; j<i+k; j++){
                    p.add(x.get(j));
                }
                res.add(p);
            }
        }
        return res;
    }
}