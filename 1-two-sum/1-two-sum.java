class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int curr = nums[i];
            if( map.containsKey(target - curr) ){
                return new int[]{i, map.get(target - curr)};
            }
            map.put(curr, i);
        }
        return new int[]{};
    }
}