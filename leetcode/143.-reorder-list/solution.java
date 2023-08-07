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
    public void reorderList(ListNode head) {
        if( head == null ) return;
        ListNode slow = head, fast = head;
        while( slow != null && fast != null && fast.next != null ) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode firstNode = slow.next;
        slow.next = null;
        ListNode last = reverse(firstNode);
        merge(head, last);
    }

    public void merge(ListNode head, ListNode last){
        ListNode a = head, b = last;
        while( a != null && b != null ){
            ListNode l1 = a.next;
            ListNode l2 = b.next;
            a.next = b;
            b.next = l1;
            a = l1;
            b = l2;
        }
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null, next = null, curr = node;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}