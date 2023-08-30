

/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG{
    Node deleteNode(Node head, int n){
        if( head == null ) return null;
        if( n == 1 ) {
            head = head.next;
            return head;
        }
        Node curr = head;
	    for(int i = 0; i<n - 2; i++) {
	        curr = curr.next;
	    }
	    curr.next = curr.next.next;
	    return head;
    }
}