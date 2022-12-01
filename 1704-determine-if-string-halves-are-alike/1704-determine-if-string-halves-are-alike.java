class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        if( n == 0 ) return true;
        int left = 0, right = n-1;
        int v1 = 0, v2 = 0;
        while( left < right ){
            if( isVowel(s.charAt(left++)) ){
                v1++;
            }
            if( isVowel(s.charAt(right--)) ){
                v2++;
            }
        }
        return v1 == v2;
    }
    public boolean isVowel(char c){
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}