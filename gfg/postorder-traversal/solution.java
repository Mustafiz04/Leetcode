...// } Driver Code Ends
//User function Template for Java
//User function Template for Java
/* A Binary Tree node
class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */
class Tree{
    ArrayList<Integer> postOrder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if( root == null ) return ans;
        Stack<Node> s = new Stack<>();
        Stack<Node> s1 = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
           Node currNode = s.pop();
           s1.push(currNode);
           if( currNode.left != null ) s.push(currNode.left);
           if( currNode.right != null ) s.push(currNode.right);
        }
        while(!s1.isEmpty()) ans.add(s1.pop().data);
        return ans;
    }
}