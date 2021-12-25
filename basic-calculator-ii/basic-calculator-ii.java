class Solution {
    public int calculate(String s) {
        int result = 0;
        if(s != null && s.length() > 0){
            Stack<Integer> nums = new Stack(); 
            char lastOperator = '+';
            int num = 0;
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(Character.isDigit(c)){
                    num = num*10 + c - '0';                    
                }
                if(isOperator(c) || i == s.length()-1){
                    if(lastOperator == '+'){
                        nums.push(num);
                    }
                    else if(lastOperator == '-'){
                        nums.push(-1*num);
                    }
                    else if(lastOperator == '*'){
                        nums.push(nums.pop()* num);
                    }else if(lastOperator == '/'){
                        nums.push(nums.pop()/ num);
                    }
                    num = 0;
                    lastOperator = c;
                } 
            }
            while(!nums.isEmpty()){
                result = result + nums.pop();
            }
        }
        return result;     
    }
    private boolean isOperator(char c){
        return c == '+' || c == '-' || c == '*' || c== '/';
    }
}