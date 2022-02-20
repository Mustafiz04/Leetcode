class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]));
        int count = 0, curr = 0;
        for(int i[] : intervals ){
            if( curr < i[1] ){
                curr = i[1];
                count++;
            }
        }
        return count;
    }
}