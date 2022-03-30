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
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    void rearrange(int arr[], int n) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for(int i : arr){
            if( i >= 0 ) positive.add(i);
            else negative.add(i);
        }
        int i = 0, j = 0, k = 0;
        while( i < positive.size() && j < negative.size() ){
            arr[k++] = positive.get(i++);
            arr[k++] = negative.get(j++);
        }
        while( i < positive.size()){
            arr[k++] = positive.get(i++);
        }
        while( j < negative.size() ){
            arr[k++] = negative.get(j++);
        }
    }
}