/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> list=new ArrayList<>();
    void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public int[] findMode(TreeNode root) {
        inorder(root);
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        List<Integer> ans=new ArrayList<>();
        for(int i:list){
            if(!map.containsKey(i))
                map.put(i,1);
            else
                map.put(i,map.get(i)+1);
            if(map.get(i)>max)
                max=map.get(i);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==max)
                ans.add(entry.getKey());
        }
        int a[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
            a[i]=ans.get(i);
        return a;
        
    }
}