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
    public List<TreeNode> generateTree(int start, int end){
        List<TreeNode> res = new ArrayList<>();
        
        if(start > end){
            res.add(null);
            return res;
        }
        
        for(int i=start; i<=end; i++){
            for(TreeNode left: generateTree(start, i-1)){
                for(TreeNode right: generateTree(i+1, end)){
                    TreeNode Tree = new TreeNode(i);
                    
                    Tree.left = left;
                    Tree.right = right;
                    res.add(Tree);
                }
            }
        }
        return res;
    }
    public List<TreeNode> generateTrees(int n) {
        if(n == 0)
            return generateTree(1, 0);
        
        return generateTree(1, n);
    }
}