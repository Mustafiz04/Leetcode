class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        if( n == 1 ){
            ans.add(Arrays.asList(nums[0]));
            return ans;
        }
        // int start = 0, end = n-1;
        // permutation(nums, start, end, ans);
        boolean[] freq = new boolean[n];
        getPermutation(nums, n, freq, new ArrayList<>());
        return ans;
    }

    public void getPermutation(int[] nums, int n, boolean[] freq, ArrayList<Integer> currArr) {
        if(currArr.size() == n) {
            ans.add(new ArrayList(currArr));
            return;
        }
        for(int i = 0; i<n; i++) {
            if( !freq[i] ) {
                currArr.add(nums[i]);
                freq[i] = true;
                getPermutation(nums, n, freq, currArr);
                currArr.remove(currArr.size() - 1);
                freq[i] = false;
            }
        }
    }
    
    public void permutation(int[] nums, int start, int end, List<List<Integer>> ans){
        if( start == end ){
            List<Integer> res = new ArrayList<>();
            for(int i : nums){
                res.add(i);
            }
            ans.add(res);
        }else{
            for(int i = start; i <= end; i++){
                nums = swap(nums, start, i);
                permutation(nums, start+1, end, ans);
                nums = swap(nums, start, i);
            }
        }
    }
    
    public int[] swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return nums;
    }
}