class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if( n == 0 ) return 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while( i < n ){
            char curr = s.charAt(i);
            while( set.contains(curr) ){
                set.remove( s.charAt(j) );
                j++;
            }
            set.add(curr);
            max = Math.max(max, i - j + 1);
            i++;
        }
        return max;
    }
}