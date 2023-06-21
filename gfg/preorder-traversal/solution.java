...// } Driver Code Ends
//User function Template for Java
// class Node{
//     int data;
//     Node left,right;
//     Node(int d){
//         data=d;
//         left=right=null;
//     }
// }
class BinaryTree{
    static ArrayList<Integer> preorder(Node root){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(root == null) return ans;
        getPreorder(root, ans);
        return ans;
    }
    
    static void getPreorder(Node root, ArrayList<Integer> ans) {
        if( root == null ) return;
        ans.add(root.data);
        getPreorder(root.left, ans);
        getPreorder(root.right, ans);
    }
}