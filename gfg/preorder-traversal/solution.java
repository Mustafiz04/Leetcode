...// } Driver Code Ends
//User function Template for Java
// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }
class BinaryTree{
    static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if( root == null ) return ans;
        Stack<Node> s = new Stack<>();
        s.push(root);
        while( !s.isEmpty() ) {
            Node currNode = s.pop();
            ans.add(currNode.data);
            if( currNode.right != null ) s.push(currNode.right);
            if( currNode.left != null ) s.push(currNode.left);
        }
        return ans;
    }
}