

/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG{
    Node flatten(Node root){
	    if( root == null || root.next == null ) return root;
	    return merge(root, flatten(root.next));
    }
    
    Node merge(Node a, Node b){
        if( a == null ) return b;
        if( b == null ) return a;
        Node res = null;
        if( a.data < b.data ){
            res = a;
            res.bottom = merge(a.bottom, b);
        }else{
            res = b;
            res.bottom = merge(a, b.bottom);
        }
        return res;
    }
}