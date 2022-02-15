// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int firstRepeated(int[] arr, int n) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i : arr) map.put(i, map.getOrDefault(i, 0) + 1);
        // for(int i=0; i<n; i++){
        //     if( map.get(arr[i]) > 1 ) return i+ 1;
        // }
        // return -1;
        HashSet<Integer> set = new HashSet<>();
        int min = -1;
        for(int i = n-1; i>=0; i--){
            if( set.contains(arr[i]) ){
                min = i+1;
            }
            set.add(arr[i]);
        }
        return min;
    }
}
