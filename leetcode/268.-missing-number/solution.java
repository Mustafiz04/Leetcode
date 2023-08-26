class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        int len = 1;
        int last = pairs[0][1];
        for(int i = 1; i<pairs.length; i++) {
            if( pairs[i][0] > last ) {
                len++;
                last = pairs[i][1];
            }
        }
        return len;
    }
}