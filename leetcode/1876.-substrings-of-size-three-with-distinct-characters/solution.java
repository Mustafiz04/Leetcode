class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int count = 0;
        for(int i = 0; i<n-2; i++) {
            if( s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2) ) {
                count++;
            }
        }
        return count;
    }
}