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
    public ListNode mergeNodes(ListNode head) {
        if(head == null) return null;
        ListNode ans = new ListNode(0);
        ListNode curr = head.next, dummy = ans;
        int sum = 0;
        while( curr != null ) {
            if( curr.val == 0 ) {
                dummy.next = new ListNode(sum);
                sum = 0;
                dummy = dummy.next;
            } else {
                sum += curr.val;
            }
            curr = curr.next;
        }
        return ans.next;
    }
}