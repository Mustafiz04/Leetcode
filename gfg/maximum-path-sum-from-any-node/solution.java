...// } Driver Code Ends
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution{
    int maxSum = Integer.MIN_VALUE;
    int findMaxSum(Node node){
        helper(node);
        return maxSum;
    }
    
    int helper(Node node) {
        if( node == null ) return 0;
        int leftTree = helper(node.left);
        int rightTree = helper(node.right);
        maxSum = Math.max(maxSum, node.data + Math.max(leftTree, 0) + Math.max(rightTree, 0));
        return node.data + Math.max(0, Math.max(leftTree, rightTree));
    }
}