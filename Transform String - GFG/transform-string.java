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
                    System.out.println(obj.transform (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int transform (String A, String B){
        int n = A.length(), m = B.length();
        if( n != m ) return -1;
        int[] count = new int[128];
        for(int i = 0; i<n; i++){
            count[(int)A.charAt(i)]++;
            count[(int)B.charAt(i)]--;
        }
        for(int i = 0; i<128; i++){
            if( count[i] != 0 ) return -1;
        }
        int res = 0, i = n-1, j = m-1;
        while( i >= 0 ){
            if( A.charAt(i) != B.charAt(j) ){
                res++;
            }else{
                j--;
            }
            i--;
        }
        return res;
    }
}