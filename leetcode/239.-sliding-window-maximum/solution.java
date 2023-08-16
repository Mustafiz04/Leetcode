class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        if( n == 0 ) return ans;
        
        Deque<Integer> st = new LinkedList<>();
        int index = 0;
        for(int i = 0; i<k; i++){
            while( !st.isEmpty() && nums[st.peekLast()] <= nums[i] ){
                st.removeLast();
            }
            st.addLast(i);
        }
        
        for(int i = k; i<n; i++){
            ans[index++] = nums[st.peek()];
            
            while( !st.isEmpty() && st.peek() <= i - k ){
                st.removeFirst();
            }
            while( !st.isEmpty() && nums[st.peekLast()] <= nums[i] ){
                st.removeLast();
            }
            st.addLast(i);
        }
        ans[index] = nums[st.peek()];
        return ans;
    }
}