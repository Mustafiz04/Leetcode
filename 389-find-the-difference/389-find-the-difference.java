class Solution {
    public char findTheDifference(String s, String t) {
        int n = s.length();
        if(n == 0) return t.charAt(0);
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum += (int)t.charAt(i);
            sum -= (int)s.charAt(i);
        }
        return (char)(sum + t.charAt(t.length() - 1));
    }
}