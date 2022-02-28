class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> answer = new LinkedList<>();
        if(n == 0) return answer;
        int start = nums[0], end = nums[0];
        for(int i =1; i<n; i++){
            if( nums[i] == end + 1 ){
                end = nums[i];
            }else{
                String range = start == end ? String.valueOf(start) : start + "->" + end;
                answer.add(range);
                start = nums[i];
                end = nums[i];
            }
        }
        String range = start == end ? String.valueOf(start) : start + "->" + end;
        answer.add(range);
        return answer;
    }
}