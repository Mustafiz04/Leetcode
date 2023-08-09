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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if( l1 == null & l2 == null ) return null;
        if( l1 == null ) return l2;
        if( l2 == null ) return l1;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;
        while( l1 != null || l2 != null ){
            int val1 = l1 != null ? l1.val : 0;
            int val2 = l2 != null ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if( l1 != null ) l1 = l1.next;
            if( l2 != null ) l2 = l2.next;
        }
        if(carry != 0 ) curr.next = new ListNode(carry);
        return dummy.next;
    }
}