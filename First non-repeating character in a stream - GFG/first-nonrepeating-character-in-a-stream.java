// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution{
    public String FirstNonRepeating(String A){
        int n = A.length();
        int[] vis = new int[26];
        Queue<Character> q = new LinkedList<>();
        String ans = "";
        for(char c : A.toCharArray() ){
            if( vis[c - 'a'] == 0 ) q.add(c);
            vis[c - 'a']++;
            while( !q.isEmpty() && vis[q.peek() - 'a'] != 1 ) q.poll();
            ans += q.isEmpty() ? "#" : q.peek();
        }
        return ans;
    }
}