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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstCriticalPoint = -1, secondCriticalPoint = -1, currIndex = 0;
        int minDis = Integer.MAX_VALUE, maxDis = Integer.MIN_VALUE;
        ListNode curr = null, prev = null ;
        if( head.next != null ) {
            curr = head.next;
            prev = head;
            currIndex++;
        }
        while(curr.next != null) {
            if( (curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val) ) {
                if( firstCriticalPoint == -1 ) {
                    firstCriticalPoint = currIndex;
                } else {
                    if( secondCriticalPoint == -1 ) {
                        minDis = currIndex - firstCriticalPoint; 
                        maxDis = currIndex - firstCriticalPoint;
                    } else {
                        minDis = Math.min(minDis, currIndex - secondCriticalPoint);
                        maxDis = Math.max(maxDis, currIndex - firstCriticalPoint);
                    }
                    secondCriticalPoint = currIndex;
                }
            }
            currIndex++;
            prev = curr;
            curr = curr.next;
        }
        if( secondCriticalPoint == -1 ) {
            return new int[]{-1, -1};
        }
        return new int[]{minDis, maxDis};
    }
}

// 1 3 4 7