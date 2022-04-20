
class BSTIterator {
Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        addAllLeft(root);
    }
    public void addAllLeft(TreeNode root){
        while(root != null){
            st.push(root);
            root = root.left;
        }
    }
    public int next() {
        TreeNode topValue = st.pop();
        addAllLeft(topValue.right);
        return topValue.val;
    }
    
    public boolean hasNext() {
        return st.size() != 0;
    }
}