

/*node class of the linked list is as:
class Node {
	int data;
     Node next;
     Node(int key)
     {
         data = key;
         next = null;
     }
}
*/
// Your task is to complete the function
// function should return the modular Node
// if no such node is present then return -1
class GfG{
    public static int moduarNode(Node head, int k){
        int ans = -1;
        while(head != null) {
            if( head.data % k == 0) {
                ans = head.data;
            }
            head = head.next;
        }
        return ans;
    }
}