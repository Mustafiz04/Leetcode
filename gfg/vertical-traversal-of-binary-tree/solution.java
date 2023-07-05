...// } Driver Code Ends
//User function Template for Java
class Pair {
    int dis;
    Node node;
    Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}
class Solution{
    static ArrayList <Integer> verticalOrder(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while( !q.isEmpty() ) {
            Pair curr = q.poll();
            int currDis = curr.dis;
            Node currNode = curr.node;
            if( map.containsKey(currDis) ) {
                map.get(currDis).add(currNode.data);
            } else {
                map.put(currDis, new ArrayList<>());
                map.get(currDis).add(currNode.data);
            }
            if( currNode.left != null ) q.add(new Pair(currNode.left, currDis - 1));
            if( currNode.right != null ) q.add(new Pair(currNode.right, currDis + 1));
        }
        
        for(Map.Entry<Integer, ArrayList<Integer>> e: map.entrySet()) {
            for(int i: e.getValue()) ans.add(i);
        }
        return ans;
    }
}