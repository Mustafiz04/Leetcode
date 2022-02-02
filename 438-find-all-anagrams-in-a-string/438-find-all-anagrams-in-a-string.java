class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        if( m > n ) return ans;
        int[] freq = new int[26];
        for(int i = 0; i<m; i++){
            freq[p.charAt(i) - 'a' ]++;
            freq[s.charAt(i) - 'a' ]--;
        }
        int i = 0;
        for(i = 0; i< n-m; i++ ){
            if( checkAnagram(freq) ) ans.add(i);
            freq[s.charAt(i) - 'a' ]++;
            freq[s.charAt(i + m) - 'a' ]--;
        }
        
        if( checkAnagram(freq) ) ans.add(i);
        return ans;
    }
    
    public boolean checkAnagram(int[] freq){
        for(int i : freq){
            if( i != 0 ) return false;
        }
        return true;
    }
}