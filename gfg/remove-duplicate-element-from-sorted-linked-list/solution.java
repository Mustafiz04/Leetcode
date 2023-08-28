

/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG{
    Node removeDuplicates(Node head){
	    if( head == null ) return head;
	    Node curr = head.next, prev = head;
	    while(curr != null) {
	        if( curr.data != prev.data ) {
	            prev.next = curr;
	            prev = curr;
	        }
	        curr = curr.next;
	    }
	    prev.next = null;
	    return head;
    }
}