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
    int count = 0;
    public int goodNodes(TreeNode root) {
        findGoodNode(root, root.val);
        return count;
    }
    public void findGoodNode(TreeNode root, int pathMax) {
        if(root == null) return;
        if(pathMax <= root.val) count++;
        pathMax = pathMax > root.val ? pathMax : root.val;
        findGoodNode(root.left, pathMax);
        findGoodNode(root.right, pathMax);
    }
}