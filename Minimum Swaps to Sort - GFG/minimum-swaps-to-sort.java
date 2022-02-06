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
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution{
    public int minSwaps(int nums[]){
        int arr[] = new int[nums.length];
        int count = 0,j = 0, unCount = 0;
        
        for(int i : nums)
            arr[j++] = i;
        
        Arrays.sort(arr);
        int i = 0;
        while(!Arrays.equals(arr, nums)){
            if(i == nums.length)
                i = 0;
            if(nums[i] != arr[i]){
                int index = Arrays.binarySearch(arr, nums[i]);
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                count++;
            }
            i++;
        }
        return count;
    }
}