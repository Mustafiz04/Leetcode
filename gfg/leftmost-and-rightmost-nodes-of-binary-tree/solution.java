

//User function Template for Java

/* Node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class Tree{
    public static void printCorner(Node node){
        if(node == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i<size; i++) {
                Node curr = q.poll();
                if( i == 0 || i == size - 1 ) {
                    System.out.print(curr.data + " ");
                }
                if( curr.left != null ) q.add(curr.left);
                if( curr.right != null ) q.add(curr.right);
            }
        }
    }
}