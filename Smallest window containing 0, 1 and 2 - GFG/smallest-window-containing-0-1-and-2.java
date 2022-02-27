// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        int[] countArr = new int[3];
        int n = S.length(), start = 0, end = 0, count = 0;
        int minWindow = Integer.MAX_VALUE;
        while( end < n ){
            char curr = S.charAt(end);
            if( countArr[curr - '0'] == 0 ) count++;
            countArr[curr - '0']++;
            end++;
            while( count == 3 ){
                minWindow = Math.min(minWindow, end - start);
                if( countArr[S.charAt(start) - '0'] == 1 ) count--;
                countArr[S.charAt(start) - '0']--;
                start++;
            }
        }
        return minWindow == Integer.MAX_VALUE ? -1 : minWindow;
    }
};
