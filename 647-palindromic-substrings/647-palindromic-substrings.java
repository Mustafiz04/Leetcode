class Solution {
    public int countSubstrings(String s) {
        int length = s.length();
        int res=0;
        boolean[][] dp = new boolean[length][length];
        for(int subLength =1;subLength<=length;subLength++){
            for(int left=0, right=left+subLength-1;right<length;left++,right++){
                if(left==right) dp[left][right]=true;
                
                else if(subLength==2&&s.charAt(left)==s.charAt(right)) dp[left][right]=true;
                
                else if(s.charAt(left)==s.charAt(right)&&dp[left+1][right-1]) dp[left][right]=true;
                
                if(dp[left][right]) res++;
            }
        }
        return res;
    }
}