...// } Driver Code Ends
//User function Template for Java
class Pair {
    int dis;
    Node node;
    Pair(Node node, int dis ) {
        this.dis = dis;
        this.node = node;
    }
}
class Solution{
    public ArrayList <Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if( root == null ) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int dis = curr.dis;
            Node currNode = curr.node;
            map.put(dis, currNode.data);
            if( currNode.left != null ) q.add(new Pair(currNode.left, dis-1));
            if( currNode.right != null ) q.add(new Pair(currNode.right, dis+1));
        }
        
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
          ans.add(e.getValue());
        }
        return ans;
    }
}