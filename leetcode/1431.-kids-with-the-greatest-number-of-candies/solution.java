class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> ans = new LinkedList<Boolean>();
        if (n == 0) return ans;
        int maxValue = candies[0];
        for(int i = 1; i<n; i++) {
            maxValue = Math.max(maxValue, candies[i]);
        }

        for(int i : candies) {
            if( i + extraCandies >= maxValue ) {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }

        return ans;
    }
}