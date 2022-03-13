class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if( n == 0 ) return true;
        Stack<Character> stack = new Stack<>();
        
        if(n % 2 == 1) return false;
        
        for(int i = 0; i<n; i++){
            char curr = s.charAt(i);
            if( curr == '(' || curr == '[' || curr == '{' ){
                stack.push(curr);
            }
            
            if( stack.isEmpty() ){
                return false;
            }
            
            switch(curr){
                case ')':
                    curr = stack.pop();
                    if( curr == '[' || curr == '{' ){
                        return false;
                    }
                    break;
                    
                case ']':
                    curr = stack.pop();
                    if( curr == '(' || curr == '{' ){
                        return false;
                    }
                    break;
                    
                case '}':
                    curr = stack.pop();
                    if( curr == '[' || curr == '(' ){
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}