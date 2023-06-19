class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        if(n == 0) return 0;
        int height = 0, currHeight = 0;
        for(int i: gain) {
            currHeight += i;
            height = Math.max(height, currHeight);
        }
        return Math.max(height, 0);
    }
}