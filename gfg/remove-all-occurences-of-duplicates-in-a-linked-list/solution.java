

//User function Template for Java

/* Linked List Node class

class Node
{
    int data;
    Node next;
}
    
*/

class Solution{
    public static Node removeAllDuplicates(Node head){
        if( head == null ) return null;
        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = head, prev = dummy;
        while( curr != null ) {
            if( curr.next != null && curr.data == curr.next.data ) {
                while( curr.next != null && curr.data == curr.next.data ) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}