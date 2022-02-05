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
                   
                    int n = sc.nextInt();
                    int hi[] = new int[n];
                    int li[] = new int[n];
                    for(int i = 0;i<n;i++)
                        hi[i] = sc.nextInt();
                    for(int i = 0;i<n;i++)
                        li[i] = sc.nextInt();    
                    Solution ob = new Solution();
                    System.out.println(ob.maxAmt(n,hi,li));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution{
    public int maxAmt(int n , int hi[] , int li[]) { 
        int high = hi[0], low = li[0], noTask = 0;
        int ans = high;
        for(int i = 1; i<n; i++){
            int temp = Math.max(noTask + hi[i], Math.max(ans, ans + li[i]));
            noTask = ans;
            ans = temp;
        }
        return ans;
    } 
}

// h = 2, l = 1, nt = 2
// ans = 8

// temp = 3, 8, 
// np = 2
// ans = 8

