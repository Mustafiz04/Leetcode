class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] newArr = new int[n];
        for(int i = 0; i<n; i++) newArr[i] = score[i];
        Arrays.sort(newArr);
        String[] ans = new String[n];
        int k = 0;
        for(int i : score){
            int index = binarySearch(newArr, 0, n-1, i);
            index = n - index;
            if( index == 1 ){
                ans[k++] = "Gold Medal";
            }else if( index == 2 ){
                ans[k++] = "Silver Medal";
            }else if( index == 3 ){
                ans[k++] = "Bronze Medal";
            }else{
                ans[k++] = String.valueOf(index);
            }
        }
        return ans;
    }
    
    public int binarySearch(int[] arr, int left, int right, int key){
        while( left <= right ){
            int mid = left + (right - left)/2;
            if( arr[mid] == key ){
                return mid;
            }else if( arr[mid] < key ){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
