// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String S) {
        int n = S.length();
        return n - LPS(S, reverse(S), n);
    }
    
    static int LPS(String s, String t, int n){
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if( s.charAt(i-1) == t.charAt(j-1) ){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j] );
                }
            }
        }
        return dp[n][n];
    }
    
    static public String reverse(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String ans = "";
        for (char c : arr)
            ans += c;
        return ans;
    }
}