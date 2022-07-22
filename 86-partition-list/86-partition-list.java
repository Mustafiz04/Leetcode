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
        if(head == null){
            return head;
        }
        ListNode low = new ListNode(0);
        ListNode high = new ListNode(0);
        ListNode tempLow = low;
        ListNode tempHigh = high;
        ListNode curr = head;
        
        while(curr != null){
            if( curr.val < x ){
                tempLow.next = curr;
                tempLow = tempLow.next;
            }else{
                tempHigh.next = curr;
                tempHigh = tempHigh.next;
            }
            curr = curr.next;
        }
        
        tempHigh.next = null;
        tempLow.next = high.next;
        return low.next;
    }
}