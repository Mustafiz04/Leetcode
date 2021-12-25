/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> q = new LinkedList<>();
        if( root == null ) return null;
        q.add(root);
        LRP(q);
        return root;
    }
    
    public void LRP(Queue<Node> q){
        while( !q.isEmpty() ){
            int size = q.size();
            while( size > 0 ){
                Node currNode = q.poll();
                currNode.next = size == 1 ? null : q.peek();
                
                if( currNode.left != null ) q.add(currNode.left);
                if( currNode.right != null ) q.add(currNode.right);
                
                size--;
            }
        }
    }
}