

/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution{
    Node insertAtBeginning(Node head, int x){
        Node newNode = new Node(x);
        if( head == null ) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }
    
    Node insertAtEnd(Node head, int x){
        Node newNode = new Node(x);
        if( head == null ) {
            head = newNode;
            return head;
        }
        Node curr = head;
        while( curr.next != null ) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
}