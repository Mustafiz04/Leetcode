...// } Driver Code Ends
/*
Node is as follows:
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
//User function Template for Java
class Pair {
    int parent, height;
    Pair(int parent, int height) {
        this.parent = parent;
        this.height = height;
    }
}
class Solution {
    public boolean isCousins(Node root, int a, int b) {
        if( root.data == a || root.data == b ) return false;
        Pair xNode = findParentAndHeight(root, a, -1, 0);
        Pair yNode = findParentAndHeight(root, b, -1, 0);
        
        return xNode.parent != yNode.parent && xNode.height == yNode.height;
    }
    
    public Pair findParentAndHeight(Node node, int a, int parent, int height) {
        if( node == null ) return new Pair(-1, 0);
        if( node.data == a ) return new Pair(parent, height);
        Pair left = findParentAndHeight(node.left, a, node.data, height + 1);
        if( left.height != 0 ) return left;
        Pair right = findParentAndHeight(node.right, a, node.data, height + 1);
        return right;
    }
}