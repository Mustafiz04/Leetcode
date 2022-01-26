// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    ArrayList<Integer> arr = new ArrayList<Integer>();
                    ArrayList<Integer> res = new ArrayList<Integer>();
                    for(int i=0; i<n; i++)
                        {
                            int x = sc.nextInt();
                            arr.add(x);
                        }
                    int k = sc.nextInt();
                    
                    Solution obj = new Solution();
                    res = obj.TopK(arr,k);
                    
                    for(int i=0; i<res.size();i++)
                        {
                            System.out.print(res.get(i) + " ");
                        }
                    System.out.println();    
                    
                        
                }
        }
}// } Driver Code Ends


class Solution{
    class Pair{
        int dId, count;
        Pair(int dId, int count){
            this.dId = dId;
            this.count = count;
        }
    }
    ArrayList<Integer> TopK(ArrayList<Integer> array, int k){
        int n = array.size();
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>( (a,b) -> {
            if( a.count == b.count ) return b.dId - a.dId;
            return b.count - a.count;
        });
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : array){
            map.put(i, map.getOrDefault(i, 0) + 1 );
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet() ){
            pq.add(new Pair(e.getKey(), e.getValue() ) );
        }
        while( !pq.isEmpty() && k-- > 0 ) ans.add(pq.remove().dId );
        return ans;
    }
}
