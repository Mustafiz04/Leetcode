class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length(), left = 0, right = n - 1;
        while( left < right ){
            if( s.charAt(left) != s.charAt(right) ){
                return isPalindrome(s, left, right - 1) || isPalindrome(s, left + 1, right);
            }
            left++;
            right--;
        }
        return true;
    }
    
    public boolean isPalindrome(String s, int i, int j){
        while( i < j ){
            if( s.charAt(i) != s.charAt(j) ){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}