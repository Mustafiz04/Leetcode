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
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    int targetSum = 0;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this.targetSum = targetSum;
        pathSum(root);
        return ans;
    }
    public void pathSum(TreeNode root){
        if( root == null ) return;
        targetSum -= root.val;
        curr.add(root.val);
        if( targetSum ==0 && root.left == null && root.right == null ){
            ans.add(new ArrayList(curr));
        }
        pathSum(root.left);
        pathSum(root.right);
        
        targetSum += root.val;
        curr.remove(curr.size() - 1);
    } 
}