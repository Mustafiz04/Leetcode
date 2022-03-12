class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0, n = name.length(), m = typed.length();
        if( m < n ) return false;
        char prev = '-';
        while( i < n && j < m ){
            if( name.charAt(i) == typed.charAt(j) ){
                prev = name.charAt(i);
                i++;
            }
            if( typed.charAt(j) != prev ){
                return false;
            }
            j++;
        }
        while( j < m ) {
            System.out.println("HERER");
            if(typed.charAt(j++) != name.charAt(n-1)) return false;
        }
        return i == n ? true : false;
    }
}