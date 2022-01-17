// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String arr[] = new String[N];
            
            for(int i=0; i<N; i++)
                arr[i] = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.palindromepair(N,arr));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int palindromepair(int N, String arr[]) {
        Set<String> set = new HashSet<>();
        Arrays.sort(arr , (a,b)->(  a.length() - b.length()) );
        
        for(String str : arr){
            int n = str.length();
            for(int i=0; i < n ; i++ ){
                
                String sub1 = str.substring(0 , i);
                String sub2 = str.substring(i);
                
               // Case1 when prefix is palindrome and reverse of suffix is present
                if( isPal(sub1) && set.contains(sub2) ){
                    return 1;
                }
                // Case2 when suffix is palindrome and reverse of prefix is present
                if( isPal(sub2) && set.contains(sub1) ){
                    return 1;
                }
                
            }
            //storing the reverse of the string 
            set.add(reverse(str));
        }        
        
        
        return 0;
    }
    private static String reverse(String s){
        
        String rev="";
        for(int i=0; i< s.length() ;i++ ){
            rev = s.charAt(i) + rev;
        }
        return rev;
    } 
    
    private static boolean isPal(String s ){
        int i = 0 ,j = s.length()-1;
        while( i < j){
            if(s.charAt(i) != s.charAt(j) ) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
};