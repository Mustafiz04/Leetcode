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
    int firstSmaller = Integer.MAX_VALUE;
    long secondSmaller = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        if( root == null ) return -1;
        firstSmaller = root.val;
        dfs(root);
        return secondSmaller == Long.MAX_VALUE ? -1 : (int)secondSmaller;
    }
    
    public void dfs(TreeNode root){
        if( root == null){
            return;
        }
        if( root.val > firstSmaller && root.val < secondSmaller ){
            secondSmaller = root.val;
        }
        dfs(root.left);
        dfs(root.right);
    }
}