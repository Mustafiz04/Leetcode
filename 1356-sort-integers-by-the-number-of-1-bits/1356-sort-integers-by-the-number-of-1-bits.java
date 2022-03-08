class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            arr[i] = setBitCount(arr[i])*10001 + arr[i];
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            arr[i] = arr[i]%10001;
        }
        return arr;
    }
    
    public int setBitCount(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}