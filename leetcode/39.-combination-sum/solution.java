class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        getCombinationSum(candidates, 0, n, target, new ArrayList<>() );
        return ans;
    }

    public void getCombinationSum(int[] arr, int index, int n, int k, ArrayList<Integer> s ) {
        if( index == n ) {
            if( k == 0 ) {
                ans.add(new ArrayList<>(s));
            }
            return;
        }

        if( arr[index] <= k ) {
            s.add(arr[index]);
            getCombinationSum(arr, index, n, k - arr[index], s);
            s.remove(s.size() - 1);
        }
        getCombinationSum(arr, index+1, n, k, s);
    }
}