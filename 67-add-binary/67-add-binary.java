class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        int currA = 0, currB = 0, carry = 0;
        String ans = "";
        while( lenA >= 0 || lenB >= 0 ){
            currA = lenA >= 0 ? a.charAt(lenA--) - '0' : 0;
            currB = lenB >= 0 ? b.charAt(lenB--) - '0' : 0;
            int sum = currA + currB + carry;
            carry = sum / 2;
            ans = sum % 2 + ans;
        }
        if( carry != 0 ){
            ans = carry + ans;
        }
        return ans;
    }
}