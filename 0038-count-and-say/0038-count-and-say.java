class Solution {
    public String countAndSay(int n) {
        if( n == 1) return "1";
        if( n == 2) return "11";
        String str = "11";
        for(int i = 3; i<=n; i++){
            String curr = "";
            str += "$";
            int count = 1;
            for(int j = 1; j<str.length(); j++){
                if( str.charAt(j) != str.charAt(j-1) ){
                    curr += count;
                    curr += str.charAt(j-1);
                    count = 1;
                }else{
                    count++;   
                }
            }
            str = curr;
        }
        return str;
    }
}