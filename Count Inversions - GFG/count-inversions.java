// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long inversionCount(long arr[], long N){
        return sort(arr, 0, (int)N-1 );
    }
    
    static long sort(long[] arr, int l, int r){
        long count = 0;
        if( l < r ){
            int mid = l + (r - l)/2;
            count += sort(arr, l, mid);
            count += sort(arr, mid + 1, r);
            count += merge(arr, l, r, mid);
        }
        return count;
    }
    
    static long merge(long[] arr, int l, int r, int mid){
        int n1 = mid - l + 1, n2 = r - mid;
        long[] left = new long[n1];
        long[] right = new long[n2];
        for(int i = 0; i<n1; i++) left[i] = arr[l+i];
        for(int i = 0; i<n2; i++) right[i] = arr[mid+1+i];
        int i = 0, j = 0, k = l;
        long count = 0;
        while( i < n1 && j < n2 ){
            if( left[i] <= right[j] ){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
                count += n1 - i;
            }
        }
        while( i < n1 ) arr[k++] = left[i++];
        while( j < n2 ) arr[k++] = right[j++];
        
        return count;
    }
}