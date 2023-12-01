

//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int rowWithMaxOne = -1, row = 0, col = m-1;
        while(row < n && col >= 0) {
            if( arr[row][col] == 1 ) {
                col--;
                rowWithMaxOne = row;
            } else {
                row++;
            }
        }
        
        return rowWithMaxOne;
    }
}