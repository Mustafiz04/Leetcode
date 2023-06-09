class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int targetNum = target - 'a' + 1;
        int left = 0, right = n;
        while( left < right ) {
            int mid = left + (right - left)/2;
            int midNum = letters[mid] - 'a';
            if( midNum < targetNum ) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return letters[left % n];
    }
}