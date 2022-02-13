class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return ans;
        List<Integer> l = new ArrayList<>();
        subset(nums, 0, n, l);
        return ans;
    }
    
    public void subset(int[] nums, int start, int n, List<Integer> l){
        if( start >= n ){
            ans.add(new ArrayList(l));
            return;
        }
        l.add(nums[start]);
        subset(nums, start+1, n, l);
        l.remove(l.size()-1);
        
        subset(nums, start+1, n, l);
    }
}