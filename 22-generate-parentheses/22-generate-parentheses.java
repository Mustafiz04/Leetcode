class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        generate("", n, n);
        return ans;
    }
    
    public void generate(String str, int open, int close){
        if( open == 0 && close == 0 ){
            ans.add(str);
            return;
        }
        if( open > 0 ){
            generate(str + "(", open-1, close);
        }
        if( close > open ){
            generate(str + ")", open, close-1);
        }
    }
}