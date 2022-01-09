// { Driver Code Starts
import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int arr[] = new int[n];
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i = 0;i<n;i++)
                        {
                            arr[i] = sc.nextInt();
                        }
                    
                    Solution obj = new Solution();
                    
                    res = obj.findPairs(arr, n);
                    if(res.size()!=0)
                        {
                            for(int i = 0;i<res.size();i++)
                               System.out.print(res.get(i) + " ");
                            System.out.println();   
                        }
                    else
                        System.out.println(0);   
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    public static ArrayList<Integer>findPairs(int arr[], int n) { 
    	ArrayList<Integer> al = new ArrayList<>();
    	if( n == 0 ) return al;
    	HashSet<Integer> hs = new HashSet<>();
    	for(int i = 0; i<n; i++){
    	    if (hs.contains(Math.abs(arr[i]))) {
                if (arr[i] < 0) {
                    al.add(arr[i]);
                    al.add(Math.abs(arr[i]));
                } else {
                    al.add(-arr[i]);
                    al.add(Math.abs(arr[i]));
                }
           }
           hs.add(Math.abs(arr[i]));
    	}
    	return al;
    }
}