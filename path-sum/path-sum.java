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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> currSum = new Stack<>();
        stack.push(root);
        currSum.push(targetSum - root.val);
        return hasSum(stack, currSum);
    }
    public boolean hasSum(Stack<TreeNode> stack, Stack<Integer> sum){
        while( !stack.isEmpty() ){
            TreeNode root = stack.pop();
            int currSum = sum.pop();
            if( root.left == null && root.right == null && currSum == 0 ){
                return true;
            }
            if(root.left != null){
                stack.push(root.left);
                sum.push(currSum - root.left.val);
            }
            
            if(root.right != null){
                stack.push(root.right);
                sum.push(currSum - root.right.val);
            }
        }
        return false;
    }
}