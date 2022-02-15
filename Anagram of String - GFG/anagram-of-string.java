// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
	public int remAnagrams(String s,String s1){
	    int n = s.length(), m = s1.length();
        int[] arr = new int[26];
        while( n > 0 || m > 0 ){
            if( n > 0 ){
                arr[s.charAt(n-1) - 'a']++;
                n--;
            } 
            if( m > 0 ){
                arr[s1.charAt(m-1) - 'a']--;
                m--;
            } 
        }
        int count = 0;
        for(int i : arr){
            if( i != 0 ) count += Math.abs(i);
        }
        return count;
    }
}