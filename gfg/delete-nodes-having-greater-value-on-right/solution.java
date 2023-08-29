

/*
class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution{
    Node compute(Node head){
        if(head == null) return null;
        head = reverse(head);
        Node newHead = head;
        Node prev = head, currNode = head.next;
        while( currNode != null ) {
            if( currNode.data >= prev.data ) {
                prev.next = currNode;
                prev = currNode;
            }
            currNode = currNode.next;
        }
        prev.next = null;
        return reverse(newHead);
    }
    
    Node reverse(Node head) {
        Node next = null, prev = null, curr = head;
        while( curr != null ) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
  