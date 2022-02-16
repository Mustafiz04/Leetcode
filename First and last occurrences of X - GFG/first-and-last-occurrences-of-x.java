// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            


// } Driver Code Ends


//User function Template for Java
class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int index = search(arr, 0, n-1, x);
        if( index == -1 ){
            ans.add(-1);
            return ans;
        }
        int firstIndex = index, lastIndex = index;
        while( firstIndex >= 0 && arr[firstIndex] == x ){
            firstIndex--;
        }
        while( lastIndex < n && arr[lastIndex] == x ){
            lastIndex++;
        };
        ans.add(firstIndex+1);
        ans.add(lastIndex-1);
        return ans;
    }
    
    public int search(int[] arr, int l, int r, int x){
        while( l <= r ){
            int mid = l + (r-l)/2;
            if( arr[mid] == x ){
                return mid;
            }else if( arr[mid] > x ){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        
        return -1;
    }
}
