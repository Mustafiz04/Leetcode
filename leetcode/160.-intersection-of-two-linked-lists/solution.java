/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = lenghtOfLL(headA);
        int len2 = lenghtOfLL(headB);
        int diff = len1 - len2;
        ListNode ans = null;
        if(diff > 0){
            ans = intesection(headA, headB, diff);
        } else {
            ans = intesection(headB, headA, -diff);
        }
        return ans;
    }

    public ListNode intesection(ListNode a, ListNode b, int d) {
        for(int i = 0; i<d; i++){
            if( a == null ) return null;
            a = a.next;
        }
        while(a != null && b != null){
            if(a == b){
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }

    public int lenghtOfLL(ListNode head){
        if(head == null) return 0;
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}