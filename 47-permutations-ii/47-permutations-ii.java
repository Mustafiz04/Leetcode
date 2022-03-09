class Solution {
    HashSet<String> set = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        if( n == 1 ){
            ans.add(Arrays.asList(nums[0]));
            return ans;
        }
        int start = 0, end = n-1;
        permutation(nums, start, end, ans);
        return ans;
    }
    
    public void permutation(int[] nums, int start, int end, List<List<Integer>> ans){
        if( start == end ){
            List<Integer> res = new ArrayList<>();
            String num = "";
            for(int i : nums){
                res.add(i);
                num += String.valueOf(i);
            }
            if( !set.contains(num) ){
                set.add(num);
                ans.add(res);
            }
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