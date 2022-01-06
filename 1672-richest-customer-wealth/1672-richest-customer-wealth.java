class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        if( row == 0 ) return 0;
        int col = accounts[0].length;
        
        int maxWealth = Integer.MIN_VALUE;
        for(int i = 0; i<row; i++){
            int total = 0;
            for(int j = 0; j<col; j++){
                total += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, total);
        }
        return maxWealth;
    }
}