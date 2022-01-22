class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<n; i++){
            int currPrice = prices[i];
            if( currPrice < minPrice ){
                minPrice = currPrice;
            }else{
                maxProfit = Math.max(maxProfit, (currPrice - minPrice));
            }
        }
        return maxProfit;
    }
}