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
    public int getDecimalValue(ListNode head) {
        String str = "";
        ListNode curr = head;
        
        while(curr != null){
            str += curr.val;
            curr = curr.next;
        }
        return Integer.parseInt(str, 2);
    }
}