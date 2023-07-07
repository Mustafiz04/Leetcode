class Solution {
    public int isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            return 1;
        return 0;
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        if(n == 0) return 0;
        int maxVol = 0, currVol = 0, start = 0, end = 0;
        while( end < n ) {
            if( end - start + 1 < k ) {
                currVol += isVowel(s.charAt(end++));
            } else {
                currVol += isVowel(s.charAt(end++));
                maxVol = Math.max(maxVol, currVol);
                currVol -= isVowel(s.charAt(start++));
            }
        }
        return maxVol;    
    }
}