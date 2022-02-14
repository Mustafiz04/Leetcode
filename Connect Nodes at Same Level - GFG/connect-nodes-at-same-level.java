// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
        nextRight = null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    public static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
    public static void printSpecial(Node root)
    {
       if (root == null)
         return;
    
       Node next_root=null;
    
       while (root != null)
       {
          System.out.print(root.data+" ");
    
          if( root.left!=null && next_root==null )
            next_root = root.left;
          else if( root.right!=null && next_root==null  )
            next_root = root.right;
    
          root = root.nextRight;
       }
       
       printSpecial(next_root);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
        	    Solution g = new Solution();
			    g.connect(root);
                printSpecial(root);
                System.out.println();
                printInorder(root);
                System.out.println();
                t--;
            
        }
    }
  
}// } Driver Code Ends


//User function Template for Java

 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class Solution{
    public void connect(Node root){
        // if( root == null ) return;
        // root.nextRight = null;
        // connectNode(root.left, root.right);
        Queue<Node> q = new LinkedList<>();
        if( root == null ){
            return;
        }
        q.add(root);
        BFS(q);
    }
    
    public static void BFS(Queue<Node> q){
        while( !q.isEmpty() ){
            int size = q.size();
            while( size > 0 ){
                Node curr = q.poll();
                if( size == 1 ){
                    curr.nextRight = null;
                }else{
                    curr.nextRight = q.peek();
                }
                if( curr.left != null ){
                    q.add(curr.left);
                }
                if( curr.right != null ){
                    q.add(curr.right);
                }
                size--;
            }
        }
    }
    
    public static void connectNode(Node left, Node right){
        if( left != null ){
            left.nextRight = right;
            connectNode( left.left, left.right );
        }
        if( right != null ){
            connectNode( left.right, right.left );
            connectNode( right.left, right.right );
        }
    }
}