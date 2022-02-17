// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        int a = A.length();
        int b = B.length();
        String S = A;
        int ans = 1;
        while( S.length() < b ){
            S += A;
            ans++;
        }
        if( isSubstring(S, B) ) return ans;
        if( isSubstring(S + A, B) ) return ans + 1;
        return -1;
    }
    
    static boolean isSubstring(String A, String B){
        int a = A.length();
        int b = B.length();
        for(int i = 0; i<=a - b; i++){
            int j;
            for(j = 0; j<b; j++){
                if( A.charAt(i+j) != B.charAt(j) ) break;
            }
            if( j == b ) return true;
        }
        return false;
    }
};