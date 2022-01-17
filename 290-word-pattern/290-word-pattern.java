class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> map = new HashMap<>();
        int[] vis = new int[26];
        String[] words = s.split(" ");
        if( words.length > pattern.length() ) return false;
        int i = 0;
        String pat = "";
        for(String word : words){
            if( map.containsKey(word) ){
                pat += map.get(word);
            }else{
                char curr = pattern.charAt(i);
                if( vis[curr - 'a'] == 1 ) return false;
                map.put(word, curr);
                pat += pattern.charAt(i);
                vis[curr - 'a'] = 1;
            }
            i++;
        }
        return pattern.equals(pat);
    }
}