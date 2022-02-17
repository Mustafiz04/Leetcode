// { Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			System.out.println(obj.atoi(str));
		t--;
		}
	}
}// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution{
    int atoi(String str) {
	    int n = str.length();
	    int num = 0;
	    boolean isNegative = false;
	    for(char c : str.toCharArray()){
	        if( c == '-' ){
	            isNegative = true;
	            continue;
	        }
	        if( !Character.isDigit(c) ) return -1;
	       // System.out.println(num);
	        num = num * 10 + (c+1 - '1');
	    }
	    return isNegative ? -1 * num : num;
    }
}
