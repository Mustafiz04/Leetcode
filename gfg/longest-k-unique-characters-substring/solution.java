

// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int n = s.length();
        if(n == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, maxLen = 0, count = 0;
        while(start < n && end < n) {
            char curr = s.charAt(end);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            count++;
            if( map.size() == k ) {
                maxLen = Math.max(maxLen, count);
            }
            while( start < n && map.size() > k ) {
                char currr = s.charAt(start);
                map.replace(currr, map.get(currr) - 1);
                if( map.get(currr) == 0 ) map.remove(currr);
                count--;
                start++;
            }
            end++;
        }
        if( maxLen == 0 ) return -1;
        return maxLen;
    }
}