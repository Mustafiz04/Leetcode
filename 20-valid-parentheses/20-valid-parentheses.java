class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if( n % 2 != 0 ) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++){
            char curr = s.charAt(i);
            if( curr == '(' || curr == '{' || curr == '[' ){
                st.push(curr);
            }
            if( st.isEmpty() ) return false;
            switch(curr){
                case ')':
                    curr = st.pop();
                    if( curr == '{' || curr == '[' ){
                        return false;
                    }
                    break;
                case '}':
                    curr = st.pop();
                    if( curr == '(' || curr == '[' ){
                        return false;
                    }
                    break;
                case ']':
                    curr = st.pop();
                    if( curr == '{' || curr == '(' ){
                        return false;
                    }
                    break;
            }
        }
        return st.isEmpty();
    }
}