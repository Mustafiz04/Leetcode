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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        int fromBeg = k, fromEnd = len - k;
        temp = head;
        while( fromBeg > 1 ) {
            temp = temp.next;
            fromBeg--;
        }
        ListNode fromBegNode = temp;
        temp = head;
        while( fromEnd > 0 ) {
            temp = temp.next;
            fromEnd--;
        }
        int a = temp.val;
        temp.val = fromBegNode.val;
        fromBegNode.val = a;

        return head;
    }
}