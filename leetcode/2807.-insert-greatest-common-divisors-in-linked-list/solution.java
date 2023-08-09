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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if( head == null ) return null;
        ListNode curr = head;
        while( curr != null && curr.next != null ) {
            int gcd = gcd(curr.val, curr.next.val);
            ListNode nextNode = curr.next;
            curr.next = new ListNode(gcd);
            curr.next.next = nextNode;
            curr = nextNode;
        }
        return head;
    }

    int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
}