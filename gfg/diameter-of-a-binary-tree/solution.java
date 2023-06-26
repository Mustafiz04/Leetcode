//{...} Driver Code Ends
// User function Template for Java
/*class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}*/
class Height {
    int h;
}
class Solution {
    int diameter(Node root) {
        Height height = new Height();
        return diameter(root, height);
    }
    
    int diameter(Node root, Height height) {
        Height lh = new Height();
        Height rh = new Height();
        
        if( root == null ) {
            height.h = 0;
            return 0;
        }
        
        int ld = diameter(root.left, lh);
        int rd = diameter(root.right, rh);
        height.h = 1 + Math.max(lh.h, rh.h);
        
        return Math.max(lh.h + rh.h + 1, Math.max(ld, rd) );
    }
}