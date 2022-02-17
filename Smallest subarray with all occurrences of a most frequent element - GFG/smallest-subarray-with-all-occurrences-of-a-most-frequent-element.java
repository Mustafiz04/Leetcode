// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Info{
    int freq, start, end;
    Info(int freq, int start, int end){
        this.freq = freq;
        this.start = start;
        this.end = end;
    }
    void updateLastIndex(int index){
        this.end = index;
    }
    void increaseFreq(){
        this.freq++;
    }
}

class Solution{
    ArrayList<Integer> smallestSubsegment(int a[], int n){
        HashMap<Integer, Info> map = new HashMap<>();
        int startIndex = 0, lastIndex = 0, freq = 0;
        for(int i = 0; i<n; i++){
            if( !map.containsKey(a[i]) ){
                map.put( a[i], new Info(1, i, i) );
            }else{
                Info curr = map.get(a[i]);
                curr.increaseFreq();
                curr.updateLastIndex(i);
                if( freq < curr.freq ){
                    freq = curr.freq;
                    startIndex = curr.start;
                    lastIndex = curr.end;
                }else if( freq == curr.freq && curr.end - curr.start < lastIndex - startIndex ){
                    startIndex = curr.start;
                    lastIndex = curr.end;
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i = startIndex; i<= lastIndex; i++){
            ans.add(a[i]);
        }
        return ans;
    }
}


// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> res = new ArrayList<Integer>();
		    res = obj.smallestSubsegment(arr, sizeOfArray);
		    for(int i:res)
		        System.out.print(i + " ");
		    System.out.println();
		}
	}
}


            

  // } Driver Code Ends