class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 1, prevMax = points[0][1];
        for(int i = 1; i<points.length; i++){
            if( prevMax < points[i][0] ){
                count++;
                prevMax = points[i][1];
            }else{
                prevMax = Math.min(prevMax, points[i][1]);
            }
        }
        return count;
    }
}

// count = 2, prevMax = 12
    
// 1 6
// 2 8
// 7 12
// 10 16