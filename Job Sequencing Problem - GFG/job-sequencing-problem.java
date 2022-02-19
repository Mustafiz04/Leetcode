// { Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}

class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            
            //size of array
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            
            //adding id, deadline, profit
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            
            Solution ob = new Solution();
            
            //function call
            int[] res = ob.JobScheduling(arr, n);
            System.out.println (res[0] + " " + res[1]);
        }
    }
}// } Driver Code Ends



class Solution{
    int[] JobScheduling(Job arr[], int n){
        Arrays.sort(arr, (a, b) -> b.profit - a.profit );
        int maxDeadline = -1;
        for(int i = 0; i<n; i++){
            maxDeadline = Math.max(maxDeadline, arr[i].deadline);
        }
        int total = 0, totalProfit = 0;
        int[] days = new int[maxDeadline+1];
        Arrays.fill(days, -1);
        for(int i = 0; i<n; i++){
            int j = arr[i].deadline;
            while( j > 0 && days[j] != -1 ){
                j--;
            }
            if( j > 0 && days[j] == -1 ){
                days[j] = arr[i].id;
                total++;
                totalProfit += arr[i].profit;
            }
        }
        int[] ans = new int[2];
        ans[0] = total;
        ans[1] = totalProfit;
        return ans;
    }
}