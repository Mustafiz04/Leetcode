class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        getSubset(nums, 0, n, new ArrayList<>());
        return ans;
    }

    public void getSubset(int[] arr, int start, int n, ArrayList<Integer> currArr) {
        if( start == n ) {
            ans.add(new ArrayList<>(currArr));
            return;
        }
        getSubset(arr, start+1, n, currArr);
        currArr.add(arr[start]);
        getSubset(arr, start+1, n, currArr);
        currArr.remove(currArr.size() - 1);
    }
}