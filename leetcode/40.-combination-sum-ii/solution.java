class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n = candidates.length;
        Arrays.sort(candidates);
        getCombination(candidates, 0, n, target, new ArrayList<>());
        return ans;
    }

    public void getCombination(int[] arr, int start, int n, int k, ArrayList<Integer> currArr) {
        if( k == 0 ) {
            ans.add(new ArrayList(currArr));
            return;
        } else {
            for(int i = start; i<n; i++) {
                if( i > start && arr[i] == arr[i - 1] ) continue;
                if( arr[i] > k ) break;
                currArr.add(arr[i]);
                getCombination(arr, i+1, n, k - arr[i], currArr);
                currArr.remove(currArr.size() - 1);
            }
        }
    }
}