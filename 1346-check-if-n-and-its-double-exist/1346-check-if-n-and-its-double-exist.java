class Solution {
    boolean binarySearch(int arr[], int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return true;
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
    
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0; i<n; i++){
            if((arr[i]%2 == 0 && arr[i]<0)){
                if(binarySearch(arr, i+1, n-1, arr[i]/2)) return true;                
            }
            else if(binarySearch(arr, i+1, n-1, arr[i] * 2)) return true;
            
        }
        return false;
    }
}