/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;
        Node curr = head;
        while(curr != null){
            Node nextNode = curr.next;
            curr.next = new Node(curr.val);
            curr.next.next = nextNode;
            curr = nextNode;
        }
        curr = head;
        while(curr != null){
            curr.next.random = curr.random != null ? curr.random.next : curr.random;
            curr = curr.next.next;
        }
        Node original = head, copy = head.next, temp = copy;
        while(original != null && copy != null){
            original.next = original.next.next;
            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}