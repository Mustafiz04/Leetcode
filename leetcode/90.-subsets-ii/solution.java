class Solution {
    List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        getSubset(nums, 0, nums.length, new ArrayList());
        return ans;
    }
    
    void getSubset(int nums[], int start, int n, List<Integer> currArr){
        ans.add(new ArrayList(currArr));
        for(int i = start; i < n; i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            currArr.add(nums[i]);
            getSubset(nums, i+1, n, currArr);
            currArr.remove(currArr.size() - 1);
        }
    }
}