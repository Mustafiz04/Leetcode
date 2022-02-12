// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] input = new String[2]; 
            input = br.readLine().split(" "); 
            int m = Integer.parseInt(input[0]); 
            int n = Integer.parseInt(input[1]); 
            Solution ob = new Solution();
            System.out.println(ob.numberOfPaths(m,n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    int MOD = 1000000007;
    long[][] dp = new long[101][101];
    long numberOfPaths(int m, int n){
        if( n == 1 || m == 1 ) return 1;
        if( dp[(int)m][(int)n] != 0 ) return dp[(int)m][(int)n];
        return dp[(int)m][(int)n] =  (numberOfPaths(m-1, n) + numberOfPaths(m, n-1))%MOD;
    }
}