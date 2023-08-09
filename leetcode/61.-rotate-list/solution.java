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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int len = lengthOfLL(head);
        k = k % len;
        if( k == 0 ) return head;
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        ListNode lastNode = curr;
        curr = head;
        for(int i = 0; i<len-k-1; i++){
            curr = curr.next;
        }
        lastNode.next = head;
        head = curr.next;
        curr.next = null;
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