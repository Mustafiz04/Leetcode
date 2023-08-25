

//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        int n = S.length();
        int start = 0, end = n-1;
        while(start < end) {
            if( S.charAt(start++) != S.charAt(end--) ) return 0;
        }
        return 1;
    }
};