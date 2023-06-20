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
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0; i<inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if( ps > pe || is > ie ) return null;
        TreeNode root = new TreeNode(preorder[ps]);
        int nodeIndex = map.get(preorder[ps]);
        int left = nodeIndex - is;
        root.left = buildTree(preorder, ps+1, pe+left, inorder, is, nodeIndex-1);
        root.right = buildTree(preorder, ps+left+1, pe, inorder, nodeIndex + 1, ie);
        return root;
    }    
}