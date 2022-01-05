class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        if(n == 0) return 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if( st.isEmpty() ){
                st.push(c);       
            }else if( c == '(' ){
                st.push(c);
            }else {
                char top = st.peek();
                if( top == ')' ){
                    st.push(c);
                }else{
                    st.pop();
                }
            }
        }
        return st.size();
    }
}