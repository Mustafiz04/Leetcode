class Solution {
    public String reverseVowels(String s) {
        int len = s.length();
        if(len == 0){
            return "";
        }
        char[] arr = s.toCharArray();
        int i = 0, j = len-1;
        while(i <= j){
            boolean isVowelLeft = vowel(arr[i]);
            boolean isVowelRight = vowel(arr[j]);
            if( isVowelLeft && isVowelRight ){
                char a = arr[i];
                arr[i] = arr[j];
                arr[j] = a;
                i++;
                j--;
            }else if( !isVowelLeft ){
                i++;
            }else if( !isVowelRight ){
                j--;
            }
        }
        String ans = "";
        for(char z : arr){
            ans += Character.toString(z);
        }
        return ans;
    }
    public boolean vowel(char a){
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U';
    }
}