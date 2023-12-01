

//User function Template for Java

class Solution {
    int median(int matrix[][], int r, int c) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, k = r*c/2+1;
        for(int i = 0; i<r; i++){
            min = Math.min(min, matrix[i][0]);
            max = Math.max(max, matrix[i][c-1]);
        }
        while( min <= max ){
            int mid = min + (max - min)/2;
            int count = 0;
            for(int i = 0; i<r; i++){
                int start = 0, end = c - 1;
                while( start <= end ){
                    int m = start + (end - start)/2;
                    if( matrix[i][m] <= mid ){
                        count += m - start + 1;
                        start = m + 1;
                    }else{
                        end = m - 1;
                    }
                }
            }
            if( count < k ){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return min;
    }
}