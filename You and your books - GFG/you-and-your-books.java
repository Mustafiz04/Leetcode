// { Driver Code Starts
import java.util.*;

class GFG 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
     
        while(T>0)
        {
             int N = sc.nextInt();
             int k = sc.nextInt();
             int ar[] = new int[N];
             //	int count = 0;
             for(int i = 0; i < N; i++)
            	ar[i] = sc.nextInt();
            		
            	System.out.println(new Solution().max_Books(ar,N,k));
            T--;
            }
        }
    }// } Driver Code Ends



class Solution{
    int max_Books(int a[], int n, int k){
        int[] dp = new int[n];
        dp[0] = a[0] <= k ? a[0] : 0;
        
        int max = dp[0];
        for(int i = 1; i<n; i++){
            if( a[i] <= k ){
                dp[i] = dp[i-1] + a[i];
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}