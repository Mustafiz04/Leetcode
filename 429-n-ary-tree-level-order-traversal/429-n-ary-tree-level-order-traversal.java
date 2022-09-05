/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(Node root) {
        
        result=new ArrayList<>();
        if(root==null)
            return result;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> ans=new ArrayList<>();
            while(size>0){
                Node currentNode=q.remove();
                ans.add(currentNode.val);
                for(Node child : currentNode.children)
                    q.add(child);
                size--;
            }
            result.add(ans);
        }
        return result;
    }
}