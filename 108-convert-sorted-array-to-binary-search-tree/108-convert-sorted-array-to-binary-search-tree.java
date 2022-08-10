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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;
        if( n == 0 ) return null;
        return toBST(nums, 0, n-1);
    }
    
    public TreeNode toBST(int[] arr, int l, int r){
        if( l > r ) return null;
        int mid = l + (r -l)/2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = toBST(arr, l, mid-1);
        root.right = toBST(arr, mid+1, r);
        
        return root;
    }
}