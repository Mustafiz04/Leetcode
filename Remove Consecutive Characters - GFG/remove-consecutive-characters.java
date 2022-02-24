// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String removeConsecutiveCharacter(String S){
        String ans = "";
        char[] arr = S.toCharArray();
        ans += arr[0];
        char prev = arr[0];
        for(int i = 0; i<arr.length; i++){
            if( arr[i] != prev ){
                ans += arr[i];
                prev = arr[i];
            }
        }
        return ans;
    }
}