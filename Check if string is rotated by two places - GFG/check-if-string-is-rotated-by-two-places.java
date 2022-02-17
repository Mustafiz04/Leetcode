// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution{
    public static boolean isRotated(String str1, String str2){
        int n = str1.length(), m = str2.length();
        if( n != m ) return false;
        int k = 2;
        for(int i = 0; i<n; i++){
            if( str2.charAt(i) != str1.charAt((i+k)%n) && str2.charAt(i) != str1.charAt((i+n-k)%n) ){
                return false;
            }
        }
        return true;
    }
    
}