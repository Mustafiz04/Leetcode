class Solution {
    public static class Trie{
        /* we kind of use binary tree concept of left & right
        X
       / \
    L 0   1 R
      */
        public class Node{
            Node left, right;
        }
        Node root;
        Trie(){
            root = new Node();
        }
        public void insert(int val){
            int bitIndex = 30; // 0 ---- 30 [31] bit's
            Node curr = root;
            
            while(bitIndex >= 0){
                int mask = 1<<bitIndex;
                int bit = (mask&val) > 0 ? 1 : 0;
                // Till now our root is empty,
                if(bit == 0){ // but if we get 0 we will add it to it's left
                    if(curr.left == null){
                        curr.left = new Node();
                    }
                    curr = curr.left;
                }
                else{ // if we get 1 we will add it to it's right 
                    if(curr.right == null){
                        curr.right = new Node();
                    }
                    curr = curr.right;
                }
                bitIndex--;
            }
        }
        public int query(int find){
            int bitIndex = 30; // 0 ---- 30 [31] bit's
            Node curr = root;
            int ans = 0;
            while(bitIndex >= 0){
                int mask = 1<<bitIndex;
                int bit = (find&mask) > 0 ? 1 : 0;
                
                if(bit == 0){
                    if(curr.left != null){
                        curr = curr.left;
                    }
                    else{
                        curr = curr.right;
                        ans |= mask;
                    }
                }
                else{
                    if(curr.right != null){
                        curr = curr.right;
                        ans |= mask;
                    }
                    else{
                        curr = curr.left;
                    }
                }
                
                bitIndex--;
            }
            return ans;
        } 
    }
    public int findMaximumXOR(int[] nums) {
        // Actuall logic
        Trie trie = new Trie();
        
        for(int val : nums){
            trie.insert(val);
        }
        
        int max = 0;
        for(int a : nums){
            int find = Integer.MAX_VALUE ^ a;
            int b = trie.query(find);
            max = Math.max(max, a ^ b);
        }
        return max;
    }
}