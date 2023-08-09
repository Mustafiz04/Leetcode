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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int top = 0, left = 0, right = n-1, bottom = m - 1, dir = 0;
        while( head != null || (top <= bottom && left <= right) ) {
            if( dir == 0 ) {
                for(int i = left; i <= right; i++) {
                    ans[top][i] = head != null ? head.val : -1;
                    head = head != null ? head.next : null;
                }
                top++;
            } else if( dir == 1 ) {
                for(int i = top; i <= bottom; i++) {
                    ans[i][right] = head != null ? head.val : -1;
                    head = head != null ? head.next : null;
                }
                right--;
            } else if( dir == 2 ) {
                for(int i = right; i >= left; i--) {
                    ans[bottom][i] = head != null ? head.val : -1;
                    head = head != null ? head.next : null;
                }
                bottom--;
            } else if( dir == 3 ) {
                for(int i = bottom; i >= top; i--) {
                    ans[i][left] = head != null ? head.val : -1;
                    head = head != null ? head.next : null;
                }
                left++;
            }
            dir = (dir + 1) % 4; 
        }
        return ans;
    }
}