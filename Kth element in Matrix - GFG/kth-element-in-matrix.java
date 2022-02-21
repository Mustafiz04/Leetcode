// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class KthSmallestElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.next());
		while(t>0)
		{
			int n=Integer.parseInt(sc.next());
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
    				a[i][j]=Integer.parseInt(sc.next());
    		
			int k=Integer.parseInt(sc.next());
		    Solution ob = new Solution();
		    System.out.println(ob.kthSmallest(a,n,k));
		    
		    t--;
		}
	}
}
// } Driver Code Ends



class Solution{
	public static int kthSmallest(int[][]mat,int n,int k){
        int min = mat[0][0], max = mat[n-1][n-1];
        while( min <= max ){
            int mid = min + (max - min)/2;
            int count = 0;
            for(int i = 0; i<n; i++){
                int start = 0, last = n-1;
                while( start <= last ){
                    int m = start + (last - start)/2;
                    if( mat[i][m] <= mid ){
                        count += m - start + 1;
                        start = m + 1;
                    }else{
                        last = m - 1;
                    }
                }
            }
            if( count < k ){
                min = mid + 1;
            }else{
                max = mid - 1;
            }
        }
        return min;
    }
}