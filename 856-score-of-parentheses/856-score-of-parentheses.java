class Solution {
    public int scoreOfParentheses(String s) {
        int n = s.length();
        int score = 0, bal = 0;
        for(int i = 0; i<n; i++){
            char c = s.charAt(i);
            if( c == '(' ){
                bal++;
            }else{
                bal--;
                if( s.charAt(i-1) == '(' ){
                    score += 1 << bal;
                }    
            }
        }
        return score;
    }
}