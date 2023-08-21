

//User function Template for Java

class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int count = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 1){
                    int currentZeroCount = 0;
                    if(i-1>=0 && matrix[i-1][j]==0){
                        currentZeroCount++;
                    }
                    if(j-1>=0 && matrix[i][j-1]==0){
                        currentZeroCount++;
                    }
                    if(j-1>=0 && i+1<m && matrix[i+1][j-1]==0){
                        currentZeroCount++;
                    }
                    if(i-1>=0 && j+1<n && matrix[i-1][j+1]==0){
                        currentZeroCount++;
                    }
                    if(i-1>=0 && j-1>=0 && matrix[i-1][j-1]==0){
                        currentZeroCount++;
                    }
                    if(j+1<n && matrix[i][j+1]==0){
                        currentZeroCount++;
                    }
                    if(i+1<m && matrix[i+1][j]==0){
                        currentZeroCount++;
                    }
                    if(i+1<m && j+1<n && matrix[i+1][j+1]==0){
                        currentZeroCount++;
                    }
                    if(currentZeroCount%2==0 && currentZeroCount!=0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}