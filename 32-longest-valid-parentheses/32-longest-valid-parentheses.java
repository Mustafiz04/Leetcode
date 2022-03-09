class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        if( n == 0 ) return 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int result = 0;
        for(int i = 0; i<n; i++){
            char curr = s.charAt(i);
            if( curr == '(' ){
                st.push(i);
            }else{
                if( !st.isEmpty() ){
                    st.pop();
                }
                if( !st.isEmpty() ){
                    result = Math.max( result, i - st.peek() );
                }else{
                    st.push(i);
                }
            }
        }
        return result;
    }
}