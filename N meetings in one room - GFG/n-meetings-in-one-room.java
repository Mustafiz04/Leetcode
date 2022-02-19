// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class pair{
    int first, second;
    public pair(int start, int finish){
        this.first = start;
        this.second = finish;
    }
}

class Solution{  
    public static int maxMeetings(int start[], int end[], int n){
        pair [] x = new pair[n];
        for(int i = 0; i < n; i++){
            x[i]  = new pair(start[i],end[i]);
        }
        Arrays.sort(x, (a, b) -> a.second - b.second );
        int last = 0;
        int res = 0;
        for (int i = 0; i < n; i++){         
            if (x[i].first > last){
                res++;  
                last = x[i].second;
            }
        }        
        return res;
   }
}