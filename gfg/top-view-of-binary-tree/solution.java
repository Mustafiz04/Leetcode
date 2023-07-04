    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair {
    int dis;
    Node node;
    Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}
class Solution{
    static ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int currDis = curr.dis;
            Node currNode = curr.node;
            if( !map.containsKey(currDis) ) {
                map.put(currDis, currNode.data);
            }
            if( currNode.left != null ) q.add(new Pair(currNode.left, currDis - 1));
            if( currNode.right != null ) q.add(new Pair(currNode.right, currDis + 1));
        }
        
        for(Map.Entry<Integer, Integer> e: map.entrySet()) {
            ans.add(e.getValue());
        }
        return ans;
    }
}