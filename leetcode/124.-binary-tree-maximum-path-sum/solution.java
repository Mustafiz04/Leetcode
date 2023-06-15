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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        oneSideMaxSum(root);
        return maxSum;
    }

    // preserve the max sum of one side of node "root",
    // includig "root" node
    private int oneSideMaxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = oneSideMaxSum(root.left);
        int r = oneSideMaxSum(root.right);
        maxSum = Math.max(maxSum, root.val + Math.max(l, 0) + Math.max(r, 0));
        return root.val + Math.max(0, Math.max(l, r));
    }
}