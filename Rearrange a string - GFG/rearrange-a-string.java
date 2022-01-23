// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public String arrangeString(String s){
        int n = s.length();
        if( n == 0 ) return "";
        String ans = "";
        int total = 0;
        int[] arr = new int[26];
        for(int i = 0; i<s.length(); i++ ){
            char c = s.charAt(i);
            if( Character.isDigit(c) ){
                total += Integer.parseInt(String.valueOf(c));
            }else{
                arr[c - 'A']++;
            }
        }
        for(int i = 0; i<26; i++){
            int count = arr[i];
            while(count-- > 0 ){
                ans += (char)('A' + i);
            }
        }
        return ans + String.valueOf(total);
    }
}
