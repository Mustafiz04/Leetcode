class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        map.put(0, -1);
        for(int i = 0; i<n; i++){
            int curr = nums[i] == 0 ? -1 : 1;
            sum += curr;
            if( map.containsKey(sum) ){
                maxLen = Math.max( maxLen, i - map.get(sum) );
            }else{
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}


// -1 1 -1
    
// -1 0
// 0 1
// -1 2