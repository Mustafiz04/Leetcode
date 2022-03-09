class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        if( n == 0 ) return ans;
        for(int i = 0; i<n; i++){
            if( strs[i] != "#" ){
                List<String> anagramWords = new ArrayList<>();
                anagramWords.add(strs[i]);
                for(int j = i+1; j<n; j++){
                    if( anagram(strs[i], strs[j]) ){
                        anagramWords.add(strs[j]);
                        strs[j] = "#";
                    }
                }
                ans.add(anagramWords);
            }
        }
        return ans;
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