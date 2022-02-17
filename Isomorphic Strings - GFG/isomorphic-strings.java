// { Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}
// } Driver Code Ends


class Solution{
    public static boolean areIsomorphic(String str1,String str2){
        int n = str1.length(), m = str2.length();
        if( n != m ) return false;
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        for(int i = 0; i<n; i++){
            int c1 = str1.charAt(i), c2 = str2.charAt(i);
            if( arr1[c1] != arr2[c2] ) return false;
            arr1[c1] = i + 1;
            arr2[c2] = i + 1;
        }
        return true;
    }
}