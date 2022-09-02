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
    List<Double> ans = new LinkedList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        BFS(q);
        return ans;
    }
    
    public void BFS(Queue<TreeNode> q){
        while(!q.isEmpty()){
            int n = q.size();
            double sum = 0;
            for(int i = 0; i<n; i++){
                TreeNode curr = q.poll();
                sum += curr.val;
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            ans.add(sum / n);
        }
    }
}