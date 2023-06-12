class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        if( n == 0 ) return ans;
        int start = nums[0], end = nums[0];
        for(int i = 1; i<n; i++) {
            if( nums[i] == end + 1 ) {
                end = nums[i];
            } else {
                String range = start == end ? String.valueOf(start): start + "->" + end;
                ans.add(range);
                start = nums[i];
                end = nums[i];
            }
        } 
        String range = start == end ? String.valueOf(start): start + "->" + end;
        ans.add(range);
        return ans;
    }
}