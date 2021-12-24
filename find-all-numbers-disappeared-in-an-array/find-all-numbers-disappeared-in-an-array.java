class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> answer = new LinkedList<>();
        
        if(n == 0) return answer;
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        
        for(int i = 1; i<=n ; i++){
            if( !set.contains(i) ) answer.add(i);
        }
        return answer;
    }
}