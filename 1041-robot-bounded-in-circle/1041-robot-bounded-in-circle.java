class Solution {
    public boolean isRobotBounded(String instructions) {
        int n = instructions.length();
        if( n == 0 ) return false;
        int dir[][] = {{0,1}, {-1, 0}, {0, -1}, {1,0}};
        int d = 0, x = 0, y = 0;
        for(int i = 0; i<n; i++){
            if( instructions.charAt(i) == 'L' ){
                d = (d + 1) % 4;
            }else if( instructions.charAt(i) == 'R' ){
                d = (d + 3) % 4;
            }else{
                x = x + dir[d][0];
                y = y + dir[d][1];
            }
        }
        return x == 0 && y == 0 || d != 0;
    }
}