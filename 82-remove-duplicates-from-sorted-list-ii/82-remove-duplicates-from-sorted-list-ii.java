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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head, prev = dummy;
        while( curr != null ){
            if( curr.next != null && curr.val == curr.next.val ){
                while( curr.next != null && curr.val == curr.next.val ){
                    curr = curr.next;
                }
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
        
// 		Set<Integer> dup = new HashSet<>();
// 		ListNode ll = head;
// 		while(ll.next != null){
// 			if(ll.val == ll.next.val)
//                 dup.add(ll.val);
// 			ll = ll.next;
// 		}
        
// 		ListNode dummy = new ListNode(0);
// 		dummy.next = head;
// 		ListNode ret = dummy;
        
// 		while(head != null){
// 			if( !dup.contains(head.val) ){
// 				dummy.next = head;
// 				dummy = dummy.next;
// 			}
// 			head = head.next;
// 		}
        
// 		dummy.next = null;
// 		return ret.next;
    }
}