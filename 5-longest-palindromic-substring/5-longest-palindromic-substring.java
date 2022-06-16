class Solution {
    public String longestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        if(n == 0){
            return "";
        }
        boolean[][] mat = new boolean[n][n];
        
        int startFrom = 0, maxLen = 1;
        for(int i = 0; i<n; i++){
            mat[i][i] = true;
        }
        for(int i = 0; i<n-1; i++){
            if( arr[i] == arr[i+1] ){
                mat[i][i+1] = true;
                startFrom = i;
                maxLen = 2;
            }
        }
        
        for(int i = 3; i<=n; i++){
            for(int start = 0; start<n-i+1; start++){
                int end = start + i -1;
                if( arr[start] == arr[end] && mat[start+1][end-1] ){
                    mat[start][end] = true;
                    
                    if(i > maxLen){
                        startFrom = start;
                        maxLen = i;
                    }
                }
            }
        }
        return s.substring(startFrom, startFrom + maxLen);
    }
}