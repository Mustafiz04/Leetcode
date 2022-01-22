class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if( n > m ) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : ransomNote.toCharArray() ){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(char c : magazine.toCharArray()){
            if( map.containsKey(c) ){
                int val = map.get(c);
                if( val == 1 ){
                    map.remove(c);
                }else{
                    map.put(c, val-1);
                }
            }
        }
        
        return map.size() == 0;
    }
}