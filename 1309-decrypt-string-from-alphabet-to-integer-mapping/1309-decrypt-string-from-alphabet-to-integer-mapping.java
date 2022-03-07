class Solution {
    public String freqAlphabets(String s) {
        String ans="";
        for(int i = 0; i<s.length(); i++){
            String a = "";
            if( (i+2) < s.length() && s.charAt(i+2) == '#'){
                a += s.charAt(i);
                a += s.charAt(i+1);
                ans += (char)(Integer.parseInt(a)+'a'-1);
                i += 2;
            }else{
                a += s.charAt(i);
                ans += (char)(Integer.parseInt(a)+'a'-1);
           }
        }
        return ans;
    }
}