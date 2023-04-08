/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    HashMap<Integer, Node> map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Node copy = new Node(node.val);
        dfs(node, copy);
        return copy;
    }
    
    public void dfs(Node node, Node copy){
        map.put(copy.val, copy);
        for(Node neighbour : node.neighbors){
            if( !map.containsKey(neighbour.val) ){
                Node newCopy = new Node(neighbour.val);
                copy.neighbors.add(newCopy);
                dfs(neighbour, newCopy);
            }else{
                copy.neighbors.add(map.get(neighbour.val));
            }
        }
    }
}

