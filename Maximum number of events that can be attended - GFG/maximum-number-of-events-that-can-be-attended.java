// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            int[] start = new int[N];
            int[] end = new int[N];
            
            for(int i=0; i<N; i++)
            {
                start[i] = Integer.parseInt(S1[i]);
                end[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxEvents(start,end,N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Pair {
    int start, end;
    Pair(int start, int end){
        this.start = start;
        this.end = end;
    }
}

// 10 14 18
// 20 15 19


class Solution {
    static int maxEvents(int[] start, int[] end, int N) {
        Pair[] arr = new Pair[N];
        for(int i = 0; i<N; i++){
            arr[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(arr, (a, b) -> a.start - b.start);
        // int count = 1, prev = arr[0].start;
        // for(int i = 1; i<N; i++){
        //     if( arr[i-1].end < arr[i].start ){
        //         count++;
        //     }else if(arr[i-1].end >= arr[i].start && arr[i-1].start < arr[i].start && prev != arr[i].start ) {
        //         count++;
        //         prev++;
        //     }
        // }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int i = 0, ans = 0, d = 0;
        while (!pq.isEmpty() || i < N) {
            if (pq.isEmpty())
                d = arr[i].start;
            while (i < N && arr[i].start <= d)
                pq.offer(arr[i++].end);
            pq.poll();
            ++ans; ++d;
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
        }
        return ans;
    }
};
