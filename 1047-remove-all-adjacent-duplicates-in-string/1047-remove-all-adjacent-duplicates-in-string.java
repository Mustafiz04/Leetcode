class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char[] arr = s.toCharArray();
        for(char i : arr){
            if(st.isEmpty() || i != st.peek()){
                st.push(i);
            }else{
                st.pop();
            }
        }
        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }
        return ans;
    }
}