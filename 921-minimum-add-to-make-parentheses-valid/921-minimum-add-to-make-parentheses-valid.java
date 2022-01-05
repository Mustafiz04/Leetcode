class Solution {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        if(n == 0) return 0;
        int open = 0, close = 0;
        for(char c : s.toCharArray()){
            if( c == '(' ){
                open++;
            }else{
                if( open == 0 ){
                    close++;
                }else{
                    open--;
                }
            }
        }
        return open + close;
        // Stack<Character> st = new Stack<>();
        // for(char c : s.toCharArray()){
        //     if( st.isEmpty() ){
        //         st.push(c);       
        //     }else if( c == '(' ){
        //         st.push(c);
        //     }else {
        //         char top = st.peek();
        //         if( top == ')' ){
        //             st.push(c);
        //         }else{
        //             st.pop();
        //         }
        //     }
        // }
        // return st.size();
    }
}