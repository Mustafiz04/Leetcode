// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    Stack<Integer> minS = new Stack<>();
	public void push(int a, Stack<Integer> s){
	    if( s.isEmpty() ){
	        minS.push(a);
	    }else{
	        int y = minS.peek();
	        if( y < a ){
	            minS.push(y);
	        }else{
	            minS.push(a);
	        }
	    }
	    s.push(a);
	}
	public int pop(Stack<Integer> s){
        s.pop();
        return minS.pop();
	}
	public int min(Stack<Integer> s){
        return minS.peek();
	}
	public boolean isFull(Stack<Integer>s, int n){
        return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s){
        return s.size() == 0;
	}
}