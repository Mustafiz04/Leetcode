class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] count = new int[10001];
        for (int x: nums) count[x]++;
        int include = 0, exclude = 0;

        for (int i = 0; i <= 10000; i++){
            int ni = exclude + count[i]*i;
            int nex = Math.max(exclude, include);
            
            exclude = nex;
            include = ni;
        }
        return Math.max(include, exclude);
    }
}