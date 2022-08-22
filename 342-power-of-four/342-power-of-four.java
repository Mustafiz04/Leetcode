class Solution {
     public boolean isPowerOfFour(int n) {
        // while( n % 4 == 0){
        //     n /= 4;
        // }
        // return n == 1 ? true : false;
        return (Math.log10(n) / Math.log10(4)) % 1 == 0;
    }
}