// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int majorityElement(int arr[], int n){
        int majorityIndex = 0, count = 1;
        for(int i = 1; i<n; i++){
            if( arr[majorityIndex] == arr[i] ){
                count++;
            }else{
                count--;
                if( count == 0 ){
                    majorityIndex = i;
                    count = 1;
                }
            }
        }
        count = 0;
        int majority = arr[majorityIndex];
        for(int i : arr){
            if( i == majority ) count++;
        }
        if( count > n/2 ) return majority;
        return -1;
//         if( n == 1) return arr[0];
//         HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
// 		for(int i = 0; i<n; i++){
// 		    if( hm.containsKey(arr[i]) ){
// 		        int val = hm.get(arr[i])+1;
// 		        if(val > n/2){
// 		            return arr[i];
// 		        }else{
// 		            hm.put(arr[i], val);
// 		        }
// 		    }else{
// 		        hm.put(arr[i], 1);
// 		    }
// 		}
// 		return -1;
    }
}