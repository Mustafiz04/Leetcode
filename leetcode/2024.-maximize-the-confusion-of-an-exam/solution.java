class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int t = 0, f = 0, maxLen = k;
        for(int i = 0; i<k; i++) {
            if( answerKey.charAt(i) == 'T' ) {
                t++;
            } else {
                f++;
            }
        }
        int left = 0, right = k;
        while( right < answerKey.length() ) {
            if( answerKey.charAt(right) == 'T' ) {
                t++;
            } else {
                f++;
            }
            while( Math.min(t, f) > k ) {
                if( answerKey.charAt(left) == 'T' ) {
                    t--;
                } else {
                    f--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}