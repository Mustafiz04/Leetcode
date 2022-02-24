// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    sc.nextLine();
		    Solution obj = new Solution();
		    String arr[]=sc.nextLine().split(" ");
		    System.out.println(obj.mostFrequentWord(arr, n));
		    
		}
	}
}

 // } Driver Code Ends
//User function Template for Java

class Pair{
    int freq, index;
    Pair(int freq, int index){
        this.freq = freq;
        this.index = index;
    }
    void increaseFreq(){
        this.freq++;
    }
}

class Solution{
    public String mostFrequentWord(String arr[],int n){
        HashMap<String, Pair> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            if( !map.containsKey(arr[i]) ){
                map.put(arr[i], new Pair(1, i));
            }else{
                map.get(arr[i]).increaseFreq();
            }
        }
        
        String ans = "";
        int freq = 0, index = 0;
        for(Map.Entry<String, Pair> e: map.entrySet()){
            String curr = e.getKey();
            Pair p = e.getValue();
            if( p.freq > freq ){
                freq = p.freq;
                ans = curr;
                index = p.index;
            }else if( p.freq == freq && p.index > index ){
                ans = curr;
                index = p.index;
            }
        }
        return ans;
    }
}


// a b b a

// { Driver Code Starts.  // } Driver Code Ends