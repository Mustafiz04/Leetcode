
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return helper(root, 0);
    }
    
    public int helper(TreeNode root, int i) {
        if(root == null){
            return 0;
        }
        
        if(root.left == null && root.right == null){
            return 2*i + root.val;
        }
        
        return helper(root.left, 2*i + root.val) + helper(root.right, 2*i + root.val);
    }
}