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
    public ListNode swapPairs(ListNode head) {
        int k = 2;
        return reverseInTwo(head, k);
    }

    public ListNode reverseInTwo(ListNode head, int k){
        ListNode prev = null, next = null, curr = head;
        while( curr != null && k != 0 ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        if( next != null ){
            head.next = reverseInTwo(next, 2);
        }
        return prev;
    }
}