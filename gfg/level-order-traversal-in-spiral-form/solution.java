//User function Template for Java
/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Spiral{
    ArrayList<Integer> findSpiral(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();
        s1.add(root);
        while( !s1.isEmpty() || !s2.isEmpty() ) {
            while( !s1.isEmpty() ) {
                Node currNode = s1.pop();
                ans.add(currNode.data);
                if( currNode.right != null ) s2.push(currNode.right);
                if( currNode.left != null ) s2.push(currNode.left);
            }
            while( !s2.isEmpty() ) {
                Node currNode = s2.pop();
                ans.add(currNode.data);
                if( currNode.left != null ) s1.push(currNode.left);
                if( currNode.right != null ) s1.push(currNode.right);
            }
        }
        return ans;
    }
}