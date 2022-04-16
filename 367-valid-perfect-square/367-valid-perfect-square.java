class Solution {
    public boolean isPerfectSquare(int num) {
        return Math.floor(Math.sqrt(num)) == Math.ceil(Math.sqrt(num));
    }
}