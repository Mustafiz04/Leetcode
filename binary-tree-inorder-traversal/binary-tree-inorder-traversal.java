class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        if(root == null ){
            return ans;
        }
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        
        while( !st.isEmpty() || curr != null ){
            while( curr != null ){
                st.add(curr);
                curr = curr.left;
            }
            while( curr == null && !st.isEmpty() ){
                TreeNode top = st.pop();
                ans.add(top.val);
                curr = top.right;
            }
        }
        return ans;
        
        // Recursive
        
        // inorderTraversal(root.left);
        // ans.add(root.val);
        // inorderTraversal(root.right);
    }
}