...// } Driver Code Ends
/*Complete the given function
Node is as follows:
class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
}*/
class Tree {
    public void serialize(Node root, ArrayList<Integer> A) {
        if( root == null ) {
            A.add(-1);
            return;
        }
        A.add(root.data);
        serialize(root.left, A);
        serialize(root.right, A);
    }
    
    int count = 0;
    public Node deSerialize(ArrayList<Integer> A){
        if( count >= A.size() || A.get(count) == -1 ) {
            count++;
            return null;
        }
        Node node = new Node(A.get(count++));
        node.left = deSerialize(A);
        node.right = deSerialize(A);
        return node;
    }
};