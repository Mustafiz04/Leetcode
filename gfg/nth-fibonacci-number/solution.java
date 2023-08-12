

//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int num){
        int[] f = new int[num+2];
	    f[0] = 0;
	    f[1] = 1;
	    int i;
	    for( i= 2; i<=num; i++){
	        f[i] = (f[i-1] + f[i-2])%1000000007;
	    }
	    return f[num];
    }
}