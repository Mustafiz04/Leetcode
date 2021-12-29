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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if( root == null ){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        Boolean leftToRight = true;
        
        while( !q.isEmpty() ){
            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for(int i = 0; i<size; i++){
                TreeNode curr = q.poll();
                level.add(curr.val);
                
                if( curr.left != null ) q.add(curr.left);
                if( curr.right != null ) q.add(curr.right);
                
            }
            if( !leftToRight ){
                Collections.reverse(level);
            }
            result.add(level);
            leftToRight = !leftToRight;
        }
        return result;
    }
}