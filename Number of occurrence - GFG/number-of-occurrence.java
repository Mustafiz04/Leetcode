// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        int l1 = 0, l2 = 0, h1 = n-1, h2 = n-1, index1 = -1, index2 = -1;
        while( l1 <= h1 ){
            int mid = l1 + (h1 - l1)/2;
            if( (int)arr[mid] == x ){
                index1 = mid;
                h1 = mid - 1;
            }else if( (int)arr[mid] < x ){
                l1 = mid + 1;
            }else{
                h1 = mid -1;
            }
        }
        
        if(index1 == -1) return 0;
        
        while( l2 <= h2 ){
            int mid = l2 + (h2 - l2)/2;
            if( (int)arr[mid] == x ){
                index2 = mid;
                l2 = mid + 1;
            }else if( (int)arr[mid] < x ){
                l2 = mid + 1;
            }else{
                h2 = mid -1;
            }
        }
        
        return index2 - index1 + 1;
    }
}