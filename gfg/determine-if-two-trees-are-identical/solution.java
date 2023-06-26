...// } Driver Code Ends
//User function Template for Java
/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class Solution{
    boolean isIdentical(Node root1, Node root2){
        return check(root1, root2);
    }
    
    boolean check(Node r1, Node r2) {
        if( r1 == null && r2 == null ) return true;
        if( r1 == null || r2 == null ) return false;
        return r1.data == r2.data && check(r1.left, r2.left) && check(r1.right, r2.right);
    }
    
}