...// } Driver Code Ends
//User function Template for Java
// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }
class Solution{
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList <Integer> boundary(Node node){
        if(node == null) return ans;
        ans.add(node.data);
        printLeftBoundary(node.left);
        
        printLeave(node.left);
        printLeave(node.right);
        
        printRightBoundary(node.right);
        
        return ans;
    }
    
    void printLeave(Node node) {
        if(node == null) return;
        printLeave(node.left);
        if( node.left == null && node.right == null ) {
            ans.add(node.data);
        }
        printLeave(node.right);
    }
    
    void printLeftBoundary(Node node) {
        if( node == null ) return;
        if( node.left != null ) {