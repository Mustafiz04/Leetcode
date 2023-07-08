...// } Driver Code Ends
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution{
    Node lca(Node root, int n1,int n2){
        if(root == null) return null;
        if( root.data == n1 || root.data == n2 ) return root;
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);
        if( left != null && right != null ) return root;
        return left != null ? left : right;
    }
}