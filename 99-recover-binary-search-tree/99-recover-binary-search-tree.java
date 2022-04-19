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
public class Solution {

	TreeNode start = null;
	TreeNode end = null;
	TreeNode prev = null;

	public void recoverTree(TreeNode root) {
		prev = new TreeNode(Integer.MIN_VALUE);
		inorder(root);
		int temp = start.val;
		//case where last node itself needed to be swapped
		if (end == null) {
			end = prev;
		}
		start.val = end.val;
		end.val = temp;
	}

	private void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			if (start == null && prev.val > root.val) {
				start = prev;
			} else if (start != null && start.val < root.val) {
				end = prev;
				return;
			}
			prev = root;
			inorder(root.right);
		}
	}
}