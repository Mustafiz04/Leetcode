// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}



// } Driver Code Ends



class Solution { 
    static int dp[][] = new int[1001][1001];
    static int knapSack(int W, int wt[], int val[], int n) { 
        for(int i = 0; i<1001; i++)
            Arrays.fill(dp[i], -1);
        return knapsackUtil(W, wt, val, n);
    }
    
    static int knapsackUtil(int w, int wt[], int val[], int n){
        if( n == 0 || w == 0 ) return 0;
        if( dp[n][w] != -1 ) return dp[n][w];
        
        if( w < wt[n-1] ){
            return dp[n][w] = knapsackUtil(w, wt, val, n-1);
        }else{
            return dp[n][w] = Math.max(knapsackUtil(w, wt, val, n-1), val[n-1] + knapsackUtil(w-wt[n-1], wt, val, n-1) );
        }
    }
}
