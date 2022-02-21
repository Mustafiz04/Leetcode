class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(int i = 0; i<chars.length(); i++){
            freq[chars.charAt(i) - 'a']++;
        }
        
        int len = 0;
        for(String str : words){
            if( check(str, freq) ){
                len += str.length();
            }
        }
        return len;
    }
    
    public boolean check(String s, int[] freq){
        int[] count = new int[26];
        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i<26; i++){
            if( freq[i] - count[i] < 0 ){
                return false;
            }
        }
        return true;
    }
}