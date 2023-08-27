

//User function Template for Java


class Reverse{
    public static String reverseWord(String str){
        String ans = "";
        for(int i = str.length() - 1; i>= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
}