// { Driver Code Starts
//Initial Template for Java

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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int k = 0;
    public int[] sortedArrayToBST(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        BST(nums, 0, n-1, ans);
        return ans;
    }
    
    public void BST(int[] arr, int l, int r, int[] ans){
        if( l > r ) return;
        int mid = l + (r-l)/2;
        ans[k++] = arr[mid];
        BST(arr, l, mid-1, ans);
        BST(arr, mid+1, r, ans);
    }
    
}