class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        if(n == 0){
            return ans;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            int num = nums[i];
            if(hm.containsKey(target - num)){
                int firstIndex = hm.get(target-num);
                return new int[]{firstIndex, i};
                // ans[0] = firstIndex;
                // ans[1] = i;
                // return ans;
            }
            hm.put(num, i);
        }
        return ans;
    }
}