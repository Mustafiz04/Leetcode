class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length; 
        int start = 0, end = arr.length-1;
        int missing = count(arr[n-1], n);
        while(start <= end){
            int mid = start + (end - start)/2;
            missing = count(arr[mid], mid+1);
            
            if(missing >= k){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        if(end == -1) return k;
        return arr[end] + k - count(arr[end], end + 1);
    }
    
    int count(int actual, int expected){
        return actual - expected;
    }
}