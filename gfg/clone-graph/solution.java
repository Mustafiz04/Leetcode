/*
    class Node{
        int val;
        ArrayList<Node> neighbors;
        public Node(){
            val = 0;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val){
            this.val = val;
            neighbors = new ArrayList<>();
        }
    
        public Node(int val, ArrayList<Node> neighbors){
            this.val = val;
            this.neighbors = neighbors;
        }
    }
*/
class Solution{
    HashMap<Integer, Node> map = new HashMap<>();
    Node cloneGraph(Node node){
        if(node == null) return null;
        Node copy = new Node(node.val);
        dfs(node, copy);
        return copy;
    }
    
    void dfs(Node node, Node copy) {
        map.put(node.val, copy);
        for(Node n: node.neighbors){
            if( !map.containsKey(n.val) ) {
                Node newCopy = new Node(n.val);
                copy.neighbors.add(newCopy);
                dfs(n, newCopy);
            } else {
                copy.neighbors.add(map.get(n.val));
            }
        }
    }
}