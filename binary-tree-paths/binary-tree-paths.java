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
    List<String> ans = new LinkedList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String path = "";
        path(root, path);
        return ans;
    }
    public void path(TreeNode root, String path){
        if( root == null ){
            return;
        }
        if( root.left == null && root.right == null ){
            path += root.val;
            ans.add(path);
            return;
        }
        path += root.val + "->";
        path(root.left, path);
        path(root.right, path);
        
    }
}