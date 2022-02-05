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
        int n = lists.length;
        ListNode result = null;
        for(int i = 0; i<n; i++){
            result = merge(lists[i], result);   
        }
        
        return result;
    }
    
    ListNode merge(ListNode l1, ListNode l2) {
        if( l1 == null ) return l2;
        if( l2 == null ) return l1;
        
        ListNode result = null;
        if( l1.val < l2.val ){
            result = l1;
            result.next = merge(l1.next, l2);
        }else{
            result = l2;
            result.next = merge(l1, l2.next);
        }
        return result;
    }
}