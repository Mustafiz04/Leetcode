class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        if( n == 0 ) return 0; 
        int max = -1;
        for(int i : piles) max = Math.max(max, i);
        int left = 1, right = max;
        while( left <= right ){
            int mid = left + (right - left)/2;
            int time = timeToEat(piles, mid);
            if( time <= h ){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    
    public int timeToEat(int[] piles, int time){
        int count = 0;
        for(int banana: piles){
            count += banana / time;
            if( banana % time != 0 ) count++;
        } 
        return count;
    }
}