// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap; 
import java.util.Map; 
import java.util.Map.Entry; 


 // } Driver Code Ends
//User function Template for Java

class Solution{
    public static int[] sortA1ByA2(int A1[], int N, int A2[], int M){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : A1){
            map.put(i,  map.getOrDefault(i, 0) + 1 );
        }
        int[] ans = new int[N];
        int index = 0;
        for(int i : A2){
            if( map.containsKey(i) ){
                int count = map.get(i);
                while( count-- > 0 ){
                    ans[index++] = i;
                }
                map.remove(i);
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int x : map.keySet() ){
            for(int i = 0; i<map.get(x); i++){
                al.add(x);
            }
        }
        Collections.sort(al);
        for(int i : al){
            ans[index++] = i;
        }
        return ans;
    }
}



// { Driver Code Starts.
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    int a1[]=new int[n];
		    int a2[]=new int[m];
		    
		    for(int i=0;i<n;i++)
		    a1[i]=sc.nextInt();
		    
		    for(int i=0;i<m;i++)
		    a2[i]=sc.nextInt();
		    Solution ob=new Solution();
		    a1 = ob.sortA1ByA2(a1,n,a2,m);
		    for(int x:a1)
		    System.out.print(x+" ");
		    
		    System.out.println();
		}
	}
	

}


  // } Driver Code Ends