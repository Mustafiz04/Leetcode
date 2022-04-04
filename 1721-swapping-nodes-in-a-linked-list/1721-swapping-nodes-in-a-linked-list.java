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
        ListNode curr = head;
        int len = 0;
        while(curr != null){
            len++;
            curr = curr.next;
        }
        int fromStart = k, fromEnd = len - k;
        curr = head;
        while(fromStart > 1){
            curr = curr.next;
            fromStart--;
        }
        ListNode node1 = curr;
        curr = head;
        while(fromEnd > 0){
            curr = curr.next;
            fromEnd--;
        }
        int temp = node1.val;
        node1.val = curr.val;
        curr.val = temp;
        
        return head;
    }
}