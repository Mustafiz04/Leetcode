// { Driver Code Starts
import java.util.*;


class Remove_Duplicate_From_String
{
	public static void main(String args[])
	{
		Scanner sc  = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T>0)
		{
			String str1 = sc.nextLine();
			String arr[] = str1.split(" ");
			//String str1 = sc.nextLine();
			//sc.skip("\\s*");
			String str = arr[arr.length-2];
			int K = Integer.parseInt(arr[arr.length-1]);
			
			//int K = Integer.parseInt( sc )
			//sc.nextLine();
			//sc.nextInt();
			
			
			//GfG g = new GfG();
			//System.out.println(str);
			//System.out.println(K);
			//System.out.println(new GfG().is_k_palin(str, K));

                       boolean b = new GfG().is_k_palin(str, K);
			if(b == true)
				System.out.println(1);
			else
				System.out.println(0);
			
			
		T--;
		}
	}
}// } Driver Code Ends


class GfG{
    boolean is_k_palin(String str, int k){
        int n = str.length();
        String t = reverse(str);
	    int lps = lps(str, t, n);
	    int diff = n - lps;
	    if( diff <= k ) return true;
	    return false;
    }
    
    int lps(String s, String t, int n){
        int[][] dp = new int[n+1][n+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if( s.charAt(i-1) == t.charAt(j-1) ){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max( dp[i][j-1], dp[i-1][j] );
                }
            }
        }
        return dp[n][n];
    }
    
    String reverse(String s){
        char[] arr = s.toCharArray();
        int l = 0, r = s.length() - 1;
        while( l < r ){
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        String ans = "";
        for(char c : arr) ans += c;
        return ans;
    }
}
