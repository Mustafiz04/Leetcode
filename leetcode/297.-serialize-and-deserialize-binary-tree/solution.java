/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    int count = 0;
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if( root == null ) return "";
        StringBuffer s = new StringBuffer();
        serializeTree(root, s);
        return s.toString();
    }

    public void serializeTree(TreeNode root, StringBuffer s) {
        if( root == null ) {
            s.append(",");
            s.append("n");
            return;
        }
        if( s.length() == 0 ) {
            s.append(Integer.toString(root.val));
        } else {
            s.append("," + Integer.valueOf(root.val));
        }
        serializeTree(root.left, s);
        serializeTree(root.right, s);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if( data == "" ) return null;
        String[] treeVal = data.split(",");
        TreeNode root = convertToTree(treeVal, treeVal.length);
        return root;
    }

    TreeNode convertToTree(String[] treeVal, int n) {
        if( count >= n || treeVal[count].equals("n") ) {
            count++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(treeVal[count]));
        count++;
        root.left = convertToTree(treeVal, n);
        root.right = convertToTree(treeVal, n);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));