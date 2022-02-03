// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String X = sc.next();
                    String Y = sc.next();
                    int costX = sc.nextInt();
                    int costY = sc.nextInt();
                    
                   
                    Solution ob = new Solution();
                    System.out.println(ob.findMinCost(X,Y,costX,costY));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution{
	public int findMinCost(String X, String Y, int costX, int costY){
	    int lcs = LCS(X, Y);
		return (X.length() - lcs)*costX + (Y.length() - lcs)*costY;
	}
	
	public int LCS(String a, String b){
	    int n = a.length();
	    int m = b.length();
	    int[][] dp = new int[n+1][m+1];
	    
	    for(int i = 1; i<=n; i++){
	        for(int j = 1; j<=m; j++){
	            if( a.charAt(i-1) == b.charAt(j-1) ){
	                dp[i][j] = 1 + dp[i-1][j-1];
	            }else{
	                dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1] );
	            }
	        }
	    }
	    
	    return dp[n][m];
	}
}
