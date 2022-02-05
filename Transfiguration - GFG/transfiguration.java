// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int transfigure (String A, String B){
        int n = A.length();
        int m = B.length();
        if( n != m ) return -1;
        
    	int sum = 0;
    	for(int i = 0; i<n; i++){
    	    sum += (int)A.charAt(i);
    	    sum -= (int)B.charAt(i);
    	}
    	
    	if( sum != 0 ) return -1;
    	n--;
    	m--;
    	int ans = 0;
    	while( n >= 0 && m >= 0 ){
    	    if( A.charAt(n) == B.charAt(m) ){
    	        n--;
    	        m--;
    	    }else{
    	        n--;
    	        ans++;
    	    }
    	}
    	return ans;
    }
}