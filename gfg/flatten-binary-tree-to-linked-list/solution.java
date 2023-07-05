...// } Driver Code Ends
//User function Template for Java
class Solution{
    public static void flatten(Node root){
        if( root == null ) return;
        Node leftTree = root.left;
        Node rightTree = root.right;
        
        root.left = null;
        flatten(leftTree);
        flatten(rightTree);
        
        root.right = leftTree;
        Node curr = root;
        while(curr.right != null) {
            curr = curr.right;
        }
        curr.right = rightTree;
    }
}