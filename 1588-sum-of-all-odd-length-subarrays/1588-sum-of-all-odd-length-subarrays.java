class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int ans=arr[0];
        int sum[] = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
            ans += arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i+2; j<arr.length; j+=2){
                ans += sum[j];
                if(i > 0)
                    ans -= sum[i-1];
            }
        }
        return ans;
    }
}