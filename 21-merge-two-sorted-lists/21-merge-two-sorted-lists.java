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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if( l1 == null ) return l2;
        if( l2 == null ) return l1;
        
        ListNode result = null;
        if( l1.val < l2.val ){
            result = l1;
            result.next = mergeTwoLists(l1.next, l2);
        }else{
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }
        return result;
        
//         ListNode temp = new ListNode(0);
//         ListNode curr = temp, n1 = l1, n2 = l2;
        
//         while( n1 != null && n2 != null ){
//             if( n1.val < n2.val ){
//                 curr.next = n1;
//                 n1 = n1.next;
//             }else{
//                 curr.next = n2;
//                 n2 = n2.next;
//             }
//             curr = curr.next;
//         }
        
//         if( n1 != null ) {
//             curr.next = n1;
//         }
//         if( n2 != null ){
//             curr.next = n2;
//         }
        
//         return temp.next;
    }
}