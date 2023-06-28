...// } Driver Code Ends
/*
class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
// complete this function
// return true/false if the is Symmetric or not
class GfG{
    public static boolean isSymmetric(Node root){
        if( root == null ) return true;
        return checkSymetric(root, root);
    }
    
    public static boolean checkSymetric(Node n1, Node n2) {
        if( n1 == null && n2 == null ) return true;
        if( n1 == null || n2 == null ) return false;
        return n1.data == n2.data && checkSymetric(n1.left, n2.right) && checkSymetric(n1.right, n2.left);
    }
}