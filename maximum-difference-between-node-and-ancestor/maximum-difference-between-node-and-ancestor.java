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
class Pair{
    int max, min;
    Pair(int min, int max){
        this.max = max;
        this.min = min;
    }
}
class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if( root == null ){
            return 0;
        }
        return maxDiff( root, root.val, root.val );
    }
    
    public int maxDiff(TreeNode root, int min, int max){
        if( root == null ){
            return max - min;
        }
        
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        
        int left = maxDiff( root.left, min, max );
        int right = maxDiff(root.right, min, max);
        
        return Math.max(left, right);
    }
    
//     int ans = Integer.MIN_VALUE;
//     public int maxAncestorDiff(TreeNode root) {
//         maxDiff(root, root.val);
//         return ans;
//     }
    
//     public Pair maxDiff(TreeNode root, int val){
//         if( root == null ){
//             return new Pair( val, val );
//         }
        
//         Pair left = maxDiff(root.left, val);
//         Pair right = maxDiff(root.right, val);
        
//         int min = Math.min(left.min, right.min);
//         int max = Math.min(left.max, right.max);
//         ans = Math.max( ans, Math.max(Math.abs(root.val - min), Math.abs(root.val - max)) );
            
//         return new Pair( Math.min(root.val, min ), Math.max(root.val, max) ); 
//     }
}