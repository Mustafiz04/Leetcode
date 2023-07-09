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
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        getSum(root, "");
        return sum;
    }

    public void getSum(TreeNode root, String currSum) {
        if( root == null ) return;
        if( root.left == null && root.right == null ) {
            currSum = currSum + root.val;
            sum += Integer.parseInt(currSum, 2);
        }
        getSum(root.left, currSum + root.val);
        getSum(root.right, currSum + root.val);
    }
}