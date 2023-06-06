class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i<n-1; i++){
            if( arr[i+1] - arr[i] != diff ){
                return false;
            }
        }
        return true;
    }
}