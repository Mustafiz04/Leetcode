// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.increasingNumbers(N);
            for(int num : ans){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> increasingNumbers(int N){
      ArrayList<Integer> nums = new ArrayList<>();
      if(N==1){
        for(int i=0; i<10; i++)
          nums.add(i);
      }
      
      if(N>1)formNums(0, 0, N, nums);
      return nums;
    }
    
    static void formNums(int num, int nodsf, int n, ArrayList<Integer> nums){
        if(nodsf==n){
            nums.add(num);
            return;
        }
      
        for(int i=(num%10+1); i<10; i++)
            formNums(num*10+i, nodsf+1, n, nums); 
    }
}