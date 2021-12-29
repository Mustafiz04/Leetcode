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
    int index = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        if( n == 0 ){
            return null;
        }
        return buildTree(preorder, inorder, 0, n-1);
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder, int left, int right){
        if( left > right ){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index++]);
        int i;
        for(i = left; i <= right; i++ ){
            if( inorder[i] == root.val ){
                break;
            }
        }
        root.left = buildTree(preorder, inorder, left, i-1);
        root.right = buildTree(preorder, inorder, i + 1, right);
        
        return root;
    }
}