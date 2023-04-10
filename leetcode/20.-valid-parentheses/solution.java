class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            char currChar = s.charAt(i);
            if(currChar == '(' || currChar == '{' || currChar == '['){
                st.push(currChar);
            } else {
                if(st.isEmpty()) return false;
                char prevChar = st.pop();
                if( prevChar == '(' && currChar != ')' ){
                    return false;
                } else if( prevChar == '{' && currChar != '}' ) {
                    return false;
                } else if(prevChar == '[' && currChar != ']') {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}