class Solution {
    public String decodeString(String s) {
        int n = s.length();
        if(n == 0) return "";
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray() ){
            if( c != ']' ){
                st.push(c);
            }else{
                StringBuilder str = new StringBuilder();
                while( st.peek() != '[' ){
                    str.append(st.pop());
                }
                st.pop();
                int k = 0, base = 1;
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    k = (st.pop() - '0') * base + k;
                    base *= 10;
                }
                //put back the substring in stack k times
                while(k-- > 0){
                    for(int i = str.length() - 1; i >= 0; i--){
                        st.push(str.charAt(i));
                    }
                }
            }
        }
        while( !st.isEmpty() ){
            ans = st.pop() + ans;
        }
        return ans;
    }
}