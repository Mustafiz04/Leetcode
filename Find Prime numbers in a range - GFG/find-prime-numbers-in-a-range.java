// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int M = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.primeRange(M, N);
            for (int i : ans) System.out.print(i + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> primeRange(int M, int N) {
        Boolean[] arr = new Boolean[N+1];
        prime(arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = M; i<=N; i++){
            if( arr[i] ) ans.add(i);
        }
        return ans;
    }
    
    void prime(Boolean[] arr){
        Arrays.fill(arr, true);
        int n = arr.length;
        arr[1] = false;
        for(int i = 2; i*i< n; i++){
            for(int j = i*i; j < n; j+=i){
                arr[j] = false;
            }
        }
    }
    
}