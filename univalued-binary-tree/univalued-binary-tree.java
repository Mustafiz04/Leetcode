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
    boolean flag = true;
    public boolean isUnivalTree(TreeNode root) {
        if( root == null ) return true;
        int k = root.val;
        isUT(root, k);
        return flag;
    }
    
    public void isUT(TreeNode root, int k){
        if(root == null){
            return;
        }
        if( root.val != k ){
            flag = false;
            return;
        }
        isUT(root.left, k);
        isUT(root.right, k);
    }
}