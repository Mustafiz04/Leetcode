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
    public ListNode sortList(ListNode head) {
        if( head == null || head.next == null ) return head;
        ListNode slow = head, fast = head;
        while( fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode nextHalfHead = slow.next;
        slow.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(nextHalfHead);
        
        return merge(left, right);
    }
    
    public ListNode merge(ListNode a, ListNode b){
        if( a == null ) return b;
        if( b == null ) return a;
        ListNode result = null;
        if( a.val < b.val ){
            result = a;
            result.next = merge(a.next, b);
        }else{
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }
}