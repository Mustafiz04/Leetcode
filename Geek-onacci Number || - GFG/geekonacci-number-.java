/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    long MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    long a = sc.nextInt();
		    long b = sc.nextInt();
		    long c = sc.nextInt();
		    long n = sc.nextInt();
		    long[] dp = new long[(int)n+1];
    		dp[1] = a;
    		dp[2] = b;
    		dp[3] = c;
    		for(int i = 4; i<=n; i++){
    		    dp[i] = (dp[i-1]%MOD + dp[i-2]%MOD + dp[i-3]%MOD)%MOD;
    		}
    		System.out.println(dp[(int)n]);
    // 		return dp[n];
		}
	}
}