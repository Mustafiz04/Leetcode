class Solution {
    public String removeStars(String s) {
        int n = s.length();
        if(n == 0) return "";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<n; i++) {
            char currChar = s.charAt(i);
            if(currChar != '*') {
                st.push(currChar);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
            }
        }
        String ans = "";
        while(!st.isEmpty()) {
            ans = String.valueOf(st.pop()) + ans;
        }
        return ans;
    }
}