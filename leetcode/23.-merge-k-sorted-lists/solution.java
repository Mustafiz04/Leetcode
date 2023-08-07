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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for(ListNode l : lists) {
            ans = merge(l, ans);
        } 
        return ans;
    }

    public ListNode merge(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode ans = null;
        if( l1.val < l2.val ) {
            ans = l1;
            ans.next = merge(l1.next, l2);
        } else {
            ans = l2;
            ans.next = merge(l1, l2.next);
        }

        return ans;
    }
}