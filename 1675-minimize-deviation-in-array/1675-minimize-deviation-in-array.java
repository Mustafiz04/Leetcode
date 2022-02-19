class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int num : nums) {
            if (isEven(num)) tree.add(num);
            else tree.add(num*2);
        }
        
        int min = tree.first();
        int max = tree.last();
        int result = max-min;
        
        while (!finished(min, max, result)) {
            tree.remove(max);
            tree.add(max/2);
            min = tree.first();
            max = tree.last();
            result = Math.min(result, max-min);
        }
        
        return result;
    }
    
    private boolean finished(int min, int max, int result) {
        return result == 0 || isOdd(max);
    }
    
    private boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}