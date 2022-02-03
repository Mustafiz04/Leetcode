// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int N){
        String ans = "";
        if( N <= 26 ){
            ans += (char)(N-1 + 'A');
            return ans;
        }
        while( N != 0 ){
            int mod = N % 26;
            if( mod == 0 ){
                ans = 'Z'+ ans;
                N--;
            } else {
                ans = (char)((mod-1) + 'A') + ans;
            }
            N /= 26;
        }
        return ans;
    }
}


// 52 -> 26+26 19 -> BS