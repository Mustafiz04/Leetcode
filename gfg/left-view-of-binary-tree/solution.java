...// } Driver Code Ends
//User function Template for Java
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree{
    int maxLevel = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> leftView(Node root){
        getLeftView(root, 1);
        return ans;
    }
    
    void getLeftView(Node root, int level) {
        if( root == null ) return;
        if( maxLevel < level ) {
            ans.add(root.data);
            maxLevel = level;
        }
        getLeftView(root.left, level + 1);
        getLeftView(root.right, level + 1);
    }
}