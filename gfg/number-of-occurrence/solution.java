

//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int start = 0, end = n - 1, index = -1;
        boolean isFound = false;
        while( start < end ) {
            int mid = start + (end - start)/2;
            if( arr[mid] == x ) {
                isFound = true;
            }
            if( arr[mid] < x ) {
                start = mid+1;
            } else {
                index = mid;
                end = mid;
            }
        }
        if( !isFound ) return 0;
        int count = 0;
        while( index < n && arr[index] == x ) {
            count++;
            index++;
        }
        return count;
    }
}