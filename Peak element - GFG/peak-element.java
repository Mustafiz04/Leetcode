// { Driver Code Starts
import java.util.*;
class PeakElement{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
		    int[] tmp=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
				tmp[i] = a[i];
			}
		    
		    int f=0;
			int A=(new Solution()).peakElement(tmp,n);
			
			if(A<0 && A>=n)
			    System.out.println(0);
			else
			{
    			if(n==1 && A==0)
    			    f=1;
    			else if(A==0 && a[0]>=a[1])
    			    f=1;
    			else if(A==n-1 && a[n-1]>=a[n-2])
    			    f=1;
    			else if(A >= 0 && A < n && a[A] >=a[A+1] && a[A]>= a[A-1])
    			    f=1;
    			else
    			    f=0;
			    System.out.println(f);
			}
		}
	}
}// } Driver Code Ends


/*Complete the function below*/

class Solution{
	public int peakElement(int[] arr,int n){
	    if( n == 1 ) return 0;
	    if( arr[0] > arr[1] ) return 0; 
        if( arr[n-1] > arr[n-2] ) return n-1;
        for(int i= 1; i<n-1; i++){
            if( arr[i] > arr[i-1] && arr[i] > arr[i+1] ) return i;
        }
        return -1;
    }
}