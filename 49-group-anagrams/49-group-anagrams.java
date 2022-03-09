class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();
        int n = strs.length;
        if(n == 0) return ans;
        
        for(int i = 0; i<n; i++){
            String curr = strs[i];
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            
            if( !hm.containsKey(sorted) ){
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(curr);
        }
        return new ArrayList(hm.values());
    }
    
    public boolean anagram(String a, String b){
        int la = a.length();
        int lb = b.length();
        if( la != lb ) return false;
        int[] count = new int[128];
        for(int i = 0; i<la; i++){
            count[a.charAt(i)]++;
            count[b.charAt(i)]--;
        }
        for(int i : count){
            if( i != 0 ) return false;
        }
        return true;
    }
}