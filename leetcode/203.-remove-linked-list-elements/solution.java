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
    public ListNode removeElements(ListNode head, int val) {
        // if(head == null) return null;
        // ListNode prev = new ListNode(0), curr = prev;
        // while(head != null && head.val == val){
        //     head = head.next;
        // }
        // while(head != null){
        //     if( head.val != val ){
        //         curr.next = head;
        //         curr = curr.next;
        //     }
        //     head = head.next;
        // }
        // curr.next = null;
        // return prev.next;
        if(head == null) return null;
        while( head != null && head.val == val ) {
            head = head.next;
        }
        ListNode curr = head;
        while( curr != null && curr.next != null ) {
            if( curr.next.val == val ) {
                curr.next = curr.next.next; 
            } else {
                curr = curr.next;
            }
        }
        return head;
    }
}