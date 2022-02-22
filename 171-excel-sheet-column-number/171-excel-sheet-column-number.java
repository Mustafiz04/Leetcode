class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int number = 0;
        for(int i = 0; i<n; i++){
            int curr = columnTitle.charAt(i) + 1 - 'A';
            number = 26*number + curr;
        }
        return number;
    }
}