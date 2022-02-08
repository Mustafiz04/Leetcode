class Solution {
    public int addDigits(int num) {
        if( num < 10 ) return num;
        int sum = num;
        while( sum > 9 ){
            int curr = sum;
            sum = 0;
            while( curr != 0 ){
                sum += curr%10;
                curr /= 10;
            }
            curr = sum;
        }
        return sum;
    }
}