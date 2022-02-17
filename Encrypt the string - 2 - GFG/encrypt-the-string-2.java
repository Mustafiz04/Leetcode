// { Driver Code Starts
//Initial Template for Java

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

            System.out.println(ob.encryptString(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String encryptString(String S){
        String ans = "";
        int n = S.length();
        String currChar = "";
        for(int i = 0; i<n; i++){
            int count = 0;
            char curr = S.charAt(i);
            while( i < n && curr == S.charAt(i) ){
                count++;
                i++;
            }
            ans += curr;
            ans += decitohexa(count);
            i--;
        }
        return reverse(ans);
    }
    
    static String reverse(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
    
    static char giveChar(int x){
        switch(x){
            case 10:return 'a';
            case 11:return 'b';
            case 12:return 'c';
            case 13:return 'd';
            case 14:return 'e';
            case 15:return 'f';
        }
        return (char)(x+'0');
    }
    
    static String decitohexa(int x){
        String hexa = "";
        while( x != 0 ){
            int rem = x%16;
            hexa += giveChar(rem);
            x /= 16;
        }
        return hexa;
    }
};

