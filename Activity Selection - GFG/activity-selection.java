// { Driver Code Starts
import java.io.*; 
import java.util.*; 
import java.lang.*;

class Main
{
    public static void main (String[] args) throws IOException  
    {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//testcases
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    //size of array
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    //adding elements to arrays start and end
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    //function call
		    System.out.println(new Solution().activitySelection(start, end, n));
		}
    }
}

// } Driver Code Ends


class Solution{
    static class Pair{
        int start, end;
        Pair(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int activitySelection(int start[], int end[], int n){
        Pair[] arr = new Pair[n];
        for(int i = 0; i<n; i++){
            arr[i] = new Pair(start[i], end[i]);
        }
        Arrays.sort(arr, (a, b) -> {
            return a.end - b.end;
            // return a.start - b.start;
        } );
        int count = 1;
        int limit = arr[0].end;
        for(int i = 1; i<n; i++){
            if( arr[i].start > limit ){
                count++;
                limit = arr[i].end;
            }
        }
        return count;
    }
}