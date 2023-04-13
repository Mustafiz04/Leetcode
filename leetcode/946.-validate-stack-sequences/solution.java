class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> s = new Stack<>();
        int j = 0;
        for(int i = 0; i<n; i++) {
            s.push(pushed[i]);
            while( !s.isEmpty() && j < n && s.peek() == popped[j] ){
                j++;
                s.pop();
            }
        }
        return s.isEmpty();
    }
}