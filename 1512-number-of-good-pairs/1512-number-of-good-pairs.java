class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int total = 0;
        for(int num : nums){
            if( !map.containsKey(num) ){
                map.put(num, 1);
            }else{
                int val = map.get(num);
                total += val;
                map.put(num, val+1);
            }
        }
        return total;
    }
}