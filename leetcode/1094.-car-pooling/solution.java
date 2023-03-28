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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> nodeVal = new ArrayList<>();
        while(head != null){
            nodeVal.add(head.val);
            head = head.next;
        }

        int[] ans = new int[nodeVal.size()];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i<nodeVal.size(); i++){
            while(!s.isEmpty() && nodeVal.get(s.peek()) < nodeVal.get(i) ) {
                ans[s.pop()] = nodeVal.get(i);
            }
            s.add(i);
        }

        return ans;
    }
}