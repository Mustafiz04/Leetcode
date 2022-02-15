// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Check obj = new Check();
		    
		    System.out.println(obj.firstNonRepeating(arr,n));
		        
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java
class Pair{
    int repeat, index;
    Pair(int repeat, int index){
        this.repeat = repeat;
        this.index = index;
    }
    void increase(){
        this.repeat++;
    }
}

class Check{
    public int firstNonRepeating(int arr[], int n) { 
        HashMap<Integer, Pair> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if( map.containsKey(arr[i]) ){
                map.get(arr[i]).increase();
            }else{
                map.put(arr[i], new Pair(1, i));
            }
        }
        int min = Integer.MAX_VALUE, element = 0;
        for(Map.Entry<Integer, Pair> e : map.entrySet()){
            Pair curr = e.getValue();
            if( curr.repeat == 1 ) {
                if( curr.index < min ){
                    min = curr.index;
                    element = e.getKey();
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : element;
    }  
    
}

