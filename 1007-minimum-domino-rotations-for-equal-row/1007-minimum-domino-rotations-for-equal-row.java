class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int len = tops.length;
        int[][] dp = new int[6][3];
        for(int i=0; i<len; i++){
            if(tops[i]==bottoms[i]){
                dp[tops[i]-1][0]++;
                dp[tops[i]-1][1]++;
                dp[tops[i]-1][2]++;
            }else{
                dp[tops[i]-1][0]++;
                dp[tops[i]-1][1]++;
                dp[bottoms[i]-1][0]++;
                dp[bottoms[i]-1][2]++;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<6; i++){
            if(dp[i][0]==len){
                min = Math.min(min, Math.min(len-dp[i][1], len-dp[i][2]));
            }
        }
        if(min<len)
            return min;
        return -1;
    }
}