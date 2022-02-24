// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str).length());
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public String findSubString( String str) {
        int n = str.length();
        int[] count = new int[256];
        int unique = 0;
        for(int i = 0; i<n; i++){
            if( count[str.charAt(i)] == 0 ) unique++;
            count[str.charAt(i)]++;
        }
        Arrays.fill(count, 0);
        count[str.charAt(0)]++;
        int c = 1, i = 0, j = 1, minWindow = Integer.MAX_VALUE;
        while( i <= j && j < n ){
            if( c < unique ){
                if( count[str.charAt(j)] == 0 ) c++;
                count[str.charAt(j)]++;
                j++;
            }else if( c == unique ){
                minWindow = Math.min(minWindow, j - i);
                if( count[str.charAt(i)] == 1 ) c--;
                count[str.charAt(i)]--;
                i++;
            }  
        }
        while( c == unique ){
            minWindow = Math.min(minWindow, j - i);
            if( count[str.charAt(i)] == 1 ) c--;
            count[str.charAt(i)]--;
            i++;
        }
        String ans = "";
        int start = 0;
        --i;
        while( start < minWindow ){
            ans += str.charAt(i++);
            start++;
        }
        return ans;
    }
}