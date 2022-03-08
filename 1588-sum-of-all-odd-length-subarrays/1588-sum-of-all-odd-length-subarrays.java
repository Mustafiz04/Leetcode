class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        sum += arr[0];
        for(int i = 1; i<n; i++){
            sum += arr[i];
            arr[i] += arr[i-1];
        }
        for(int i = 0; i<n; i++){
            for(int j = i+2; j<n; j+=2){
                sum += arr[j];
                if( i > 0 ){
                    sum -= arr[i-1];
                }
            }
        }
        
        return sum;
    }
}