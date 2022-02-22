// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            ArrayList<Long> arr = new ArrayList<Long>();
            for(int i = 0;i<n;i++)
                {
                    long x = sc.nextInt();
                    arr.add(x);
                }
            long m = sc.nextLong();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public long findMinDiff (ArrayList<Long> a, long n, long m){
        Collections.sort(a);
        long min = a.get(0);
        long max = a.get((int)m-1);
        long minDiff = max - min;
        for(int i = 1; i<(int)n-(int)m + 1; i++){
            minDiff = Math.min(minDiff, a.get(i + (int)m - 1) - a.get(i) );
        }
        return minDiff;
    }
}


// 1 3 4 7 9 9 12 56