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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        return reverseEven(head,1);
    }
    public ListNode reverseEven(ListNode head,int k){
        if(head==null || head.next==null)
            return head;
        ListNode temp = head;
        int size=1;
        for(int i=0;i<k-1;i++){
            if(temp.next!=null){
                size++;
                temp=temp.next;
            }
        }
        ListNode templist = temp.next;
        temp.next = null;
        if(size%2==0){
            head=reverse(head);
            temp = head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=reverseEven(templist,k+1);
        }
        else{
            temp.next=reverseEven(templist,k+1);
        }
        return head;
        
    }
    ListNode reverse(ListNode head){
        if(head==null || head.next==null)
            return head;
        ListNode ans = null;
        while(head!=null){
            ListNode next = head.next;
            head.next = ans;
            ans = head;
            head = next;
        }
        return ans;
    }
}