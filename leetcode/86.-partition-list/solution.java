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
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode lessThan = new ListNode(0);
        ListNode greaterThan = new ListNode(0);
        ListNode startNode = lessThan, secondHalf = greaterThan;
        while(head != null){
            if( head.val < x ) {
                lessThan.next = head;
                lessThan = lessThan.next;
            } else {
                greaterThan.next = head;
                greaterThan = greaterThan.next;
            }
            head = head.next;
        }
        greaterThan.next = null;
        lessThan.next = secondHalf.next;
        return startNode.next;
    }
}