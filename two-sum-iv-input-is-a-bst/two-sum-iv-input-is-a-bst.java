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
    HashSet<Integer> set = new HashSet<>();
    boolean flag = false;
    public boolean findTarget(TreeNode root, int k) {
        if( root == null ){
            return false;
        }
        inorder(root, k);
        return flag;
    }
    
    public void inorder(TreeNode root, int k){
        if( root == null ) return;
        inorder(root.left, k);
        if( set.contains(k - root.val) ){
            flag = true;
            return;
        }else{
            set.add(root.val);
        }
        inorder(root.right, k);
    }
}