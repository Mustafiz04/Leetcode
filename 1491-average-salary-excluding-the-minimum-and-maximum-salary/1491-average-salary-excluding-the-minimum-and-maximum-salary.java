class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        double min = salary[0], max = salary[0], sum = salary[0];
        for(int i = 1; i<n; i++){
            sum += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        return (sum - min - max)/(n-2);
    }
}