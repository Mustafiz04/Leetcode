class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        if( n == 0 && m == 0 ) return true;
        if( m == 0 ) return false;
        
        int a = 0, b = 0;
        while( a != n && b != m ){
            if( s.charAt(a) == t.charAt(b) ){
                a++;
            }
            b++;
        }
        return a == n;
    }
}