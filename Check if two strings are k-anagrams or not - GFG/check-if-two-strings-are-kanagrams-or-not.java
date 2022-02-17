// { Driver Code Starts
//Initial template for JAVA

import java.util.*;
import java.lang.*;
class GFG {
    public static void main(String[] args)
    {   Scanner sc = new Scanner(System.in);
    	int t=sc.nextInt();
    	while(t-->0)
    	{
    		String str1=sc.next();
    		String str2=sc.next();
    		int k=sc.nextInt();
            Solution ob = new Solution();
    		if (ob.areKAnagrams(str1, str2, k) == true)
    			System.out.println("1");
    		else
    			System.out.println("0");
    	}
    }
}// } Driver Code Ends


class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        int n = s1.length(), m = s2.length();
        if( n != m ) return false;
        int[] count = new int[26];
        for(char c : s1.toCharArray()) count[c - 'a']++;
        int diff = 0;
        for(char c : s2.toCharArray()){
            if( count[c - 'a'] > 0 ){
                count[c - 'a']--;
            }else{
                diff++;
            }
        }
        return diff <= k;
    }
}