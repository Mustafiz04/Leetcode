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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if( head == null ) return null;
        int len = lengthOfLL(head);
        int nodeFromStart = len - n;
        if( nodeFromStart == 0 ) {
            return head.next;
        }
        ListNode curr = head;
        while( nodeFromStart-- > 1 ) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return head;
    }

    public int lengthOfLL(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}