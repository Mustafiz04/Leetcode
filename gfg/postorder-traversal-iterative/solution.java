...// } Driver Code Ends
// User function Template for Java
/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if( node == null ) return ans;
        Stack<Node> s = new Stack<>();
        Stack<Node> s1 = new Stack<>();
        s.push(node);
        while( !s.isEmpty() ) {
            Node currNode = s.pop();
            s1.push(currNode);
            if( currNode.left != null ) s.push(currNode.left);
            if( currNode.right != null ) s.push(currNode.right);
        }
        while( !s1.isEmpty() ) ans.add(s1.pop().data);
        return ans;
    }
}