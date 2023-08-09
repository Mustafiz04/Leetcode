

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
class Node {
    int data;
    Node next, arb;

    Node(int d) 
    { 
        data = d;
        next = arb = null; 
        
    }
}*/

class Clone {
    Node copyList(Node head) {
        if( head == null ) return null;
        Node curr = head;
        while( curr != null ) {
            Node nextNode = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = nextNode;
            curr = nextNode;
        }
        curr = head;
        while( curr != null ) {
            curr.next.arb = curr.arb != null ? curr.arb.next : curr.arb;
            curr = curr.next.next;
        }
        Node original = head, copy = head.next, temp = copy;
        while( original != null && copy != null ) {
            original.next = original.next.next;
            copy.next = copy.next != null ? copy.next.next : copy.next;
            original = original.next;
            copy = copy.next;
        }
        return temp;
    }
}
