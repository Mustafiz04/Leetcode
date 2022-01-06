class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] cap = new int[1001];
        for(int[] trip : trips){
            cap[trip[1]] += trip[0];
            cap[trip[2]] -= trip[0];
        }
        
        int totalCap = 0;
        for(int currCap : cap){
            totalCap += currCap;
            if( totalCap > capacity ) return false;
        }
        return true;
    }
}