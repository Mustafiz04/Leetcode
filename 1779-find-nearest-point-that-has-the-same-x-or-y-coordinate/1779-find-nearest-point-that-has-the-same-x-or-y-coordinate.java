class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n = points.length;
        int index = -1, dis = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int currX = points[i][0];
            int currY = points[i][1];
            if( x == currX || y == currY ){
                int currDis = Math.abs(x - currX) + Math.abs(y - currY);
                if( currDis < dis ){
                    dis = currDis;
                    index = i;
                }
            }
        }
        return index;
    }
}