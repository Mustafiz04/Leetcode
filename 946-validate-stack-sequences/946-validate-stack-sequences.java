class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> st = new Stack<>();
        int j = 0;
        for(int i : pushed){
            st.push(i);
            while(!st.isEmpty() && j < n && st.peek() == popped[j] ){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
}