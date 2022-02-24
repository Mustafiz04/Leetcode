// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args)throws IOException
	{

// 		Scanner in = new Scanner(System.in);
        
// 		int t = in.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
         //testcases
        int t = Integer.parseInt(read.readLine());
		
		while(t-- >0)
		{
		    //size of array
		    int n = Integer.parseInt(read.readLine());
		    long[] arr= new long[n];
		    
		    String str[] = read.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0;i<n;i++)
		        arr[i] = Long.parseLong(str[i]);
		    
		    // StringBuffer sb = new StringBuffer();
		    
		    Solution ob = new Solution();
		    
		    //calling rearrange() function
		    ob.rearrange(arr, n);
		    StringBuffer sb = new StringBuffer();
		    
		    //appending and printing the elements
		    for(int i =0; i < n; i++)
		     sb.append(arr[i] + " ");
		    System.out.println(sb);
		}
	}
}



// } Driver Code Ends


class Solution{
    public static void rearrange(long arr[], int n){
        int min = 0, max = n-1;
        long maxNum = arr[max] + 1;
        for(int i = 0; i<n; i++){
            if( i % 2 == 0 ){
                arr[i] += arr[max--] % maxNum * maxNum;
            }else{
                arr[i] += arr[min++] % maxNum * maxNum;
            }
        }
        for(int i = 0; i<n; i++){
            arr[i] /= maxNum;
        }
    }
}


