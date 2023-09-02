

//User function Template for Java

/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
    public void solve(Node node, ArrayList<Integer> list, int l){
        if(node==null) return;
        if(node.left==null&&node.right==null){
            list.add(l);
            return;
        }
        solve(node.left,list,l+1);
        solve(node.right,list,l+1);
        return;
    }
    
    public int getCount(Node node, int bud)
    {
        //code here  
         ArrayList<Integer> list = new  ArrayList<>();
         solve(node,list,1);
         int count=0;
         Collections.sort(list);
         for(int i:list){
             if(i<=bud){
                 count++;
                 bud=bud-i;
             }
         }
         return count;
    }
}