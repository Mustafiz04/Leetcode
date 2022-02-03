// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str){
        return str.length() - longestPalinSubseq(str);
    }
    
    public static int longestPalinSubseq(String S) {
        int n = S.length();
        String T = reverse(S);
        int[][] dp = new int[n + 1][n + 1];
    
        for (int i = 1; i <= n; i++) {
          for (int j = 1; j <= n; j++) {
            if (S.charAt(i - 1) == T.charAt(j - 1)) {
              dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
              dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
          }
        }
        return dp[n][n];
    }

    public static String reverse(String s) {
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