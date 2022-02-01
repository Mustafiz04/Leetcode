/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        int parent, height;
        Pair(int parent, int height){
            this.parent = parent;
            this.height = height;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        if( root.val == x || root.val == y ) return false;
        int xParent = -1;
        Pair xNode = helper(root, x, xParent, 0);
        
        int yParent = -1;
        Pair yNode = helper(root, y, yParent, 0);
        
        return xNode.parent != yNode.parent && xNode.height == yNode.height;
    }
    
    public Pair helper(TreeNode root, int x, int parent, int height){
        if( root == null ) return new Pair(-1, 0);
        if( root.val == x ) return new Pair(parent, height);
        Pair left = helper(root.left, x, root.val, height+1);
        if( left.height != 0 ) return left;
        
        Pair right = helper(root.right, x, root.val, height+1);
        return right;
    }
}