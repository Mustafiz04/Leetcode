// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.countSub(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public long countSub(String str) {
        int n = str.length();
        if( n == 0 ) return 0;
        int[] openingBracket = new int[n+1];
        int[] closingBracket = new int[n+1];
        for(int i = 1; i<=n; i++){
            if( str.charAt(i-1) == '(' ){
                openingBracket[i] = openingBracket[i-1] + 1;
            }else{
                openingBracket[i] = openingBracket[i-1];
            }
        }
        for(int i = n-1; i>=0; i--){
            if( str.charAt(i) == ')' ){
                closingBracket[i] = closingBracket[i+1] + 1;
            }else{
                closingBracket[i] = closingBracket[i+1];
            }
        }
        for(int i = 0; i<=n; i++){
            if( openingBracket[i] == closingBracket[i] ) return (long)i;
        }
        return -1;
    }
}

// 0 1 2 3 4 5 6 7
// 0 1 2 2 2 2 2 3
// 4 4 4 3 2 1 0 0

// 0 1 2
// 0 0 0
// 2 1 0