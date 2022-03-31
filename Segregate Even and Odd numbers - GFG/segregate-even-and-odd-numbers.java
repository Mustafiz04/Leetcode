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

            new Solution().segregateEvenOdd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends



class Solution {
    void segregateEvenOdd(int arr[], int n) {
        Arrays.sort(arr);
        int left = 0, right = n-1;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i : arr){
            if( i % 2 == 0 ) pos.add(i);
            else neg.add(i);
        }
        int k = 0, i = 0, j = 0;
        while(i < pos.size() ){
            arr[k++] = pos.get(i++);
        }
        while(j < neg.size() ){
            arr[k++] = neg.get(j++);
        }
    }
}