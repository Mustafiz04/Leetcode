class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        String digits = "123456789";
        int sl = String.valueOf(low).length();
        int el = String.valueOf(high).length();
        
        for(int i = sl; i<= el; i++){
            for(int j = 0; j<10-i; j++){
                int num = Integer.parseInt(digits.substring(j, j+i) );
                if( num >= low && num <= high ) ans.add(num);
            }
        }
        return ans;
    }
}