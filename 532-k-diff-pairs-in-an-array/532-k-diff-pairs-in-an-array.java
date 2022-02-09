class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0, n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        for(int e : map.keySet()){
            if( k > 0 && map.containsKey(e + k) || k == 0 && map.get(e) > 1 ) count++;
        }
        return count;
    }
}