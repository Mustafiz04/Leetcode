class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] count = new int[26];
        int n = s1.length(), swap = 0;
        for(int i = 0; i<n; i++){
            if( s1.charAt(i) != s2.charAt(i) ){
                swap++;
            }
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int i : count){
            if( i != 0 ) return false;
        }
        if( (swap+1)/2 > 1 ) return false;
        return true;
    }
}