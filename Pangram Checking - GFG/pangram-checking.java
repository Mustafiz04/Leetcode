// { Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution{
    public static boolean checkPangram  (String str) {
        int[] count = new int[26];
        for(char c : str.toLowerCase().toCharArray()){
            if( c >= 97 && c <= 122 )
                count[c - 'a']++;
        }
        for(int c : count){
            if( c == 0 ) return false;
        }
        return true;
    }
}

// { Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}  // } Driver Code Ends