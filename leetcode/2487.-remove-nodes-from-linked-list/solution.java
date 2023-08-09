/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;
        ListNode last = reverse(head);
        ListNode curr = last.next, prev = last;
        while( curr != null ) {
            if( curr.val >= prev.val ) {
                prev.next = curr;
                prev = prev.next;
            }
            curr = curr.next;
        }
        prev.next = null;
        return reverse(last);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null, next = null, curr = head;
        while( curr != null ) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

// 8 3 13 2 5