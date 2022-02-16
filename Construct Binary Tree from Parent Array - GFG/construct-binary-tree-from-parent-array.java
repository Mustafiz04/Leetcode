// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node 
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class CreateTree
{
    static ArrayList<Integer> result = new ArrayList<Integer>();
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextInt();
              
            Solution ob = new Solution();
            Node root = ob.createTree(arr, n);
            
            printLevelOrder(root);
            System.out.println();
        }
    }
    
    public static void printList(Node root)
    {
        while(root != null)
        {
            System.out.print(root.data + " ");
        }
    }
    
    public static void printLevelOrder(Node root)
    {
        int h = height(root);
        int i;
         for (i=1; i<=h; i++)
        {
        result.clear();
        printGivenLevel(root, i);
        Collections.sort(result);
        for(int j=0;j<result.size();j++)
            System.out.print(result.get(j) + " ");
        }
    }
    
    public static int height(Node root)
    {
        if(root == null)
          return 0;
          
        else
    {

        int lheight = height(root.left);
        int rheight = height(root.right);


        if (lheight > rheight)
            return(lheight+1);
        else return(rheight+1);
    }
    }
    
    public static void printGivenLevel(Node node, int level)
    {
        if (node == null)
             return;
    if (level == 1)
        result.add(node.data);
    else if (level > 1)
    {
        printGivenLevel(node.left, level-1);
        printGivenLevel(node.right, level-1);
    }
    }
}

// } Driver Code Ends


/*node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution{
    public static Node createTree(int parent[], int N){
        Node[] arr = new Node[N];
        for(int i = 0; i<N; i++){
            arr[i] = new Node(i);
        }
        Node head = null;
        for(int i = 0; i<N; i++){
            Node child = arr[i];
            if( parent[i] == -1 ){
                head = child;
                continue;
            }
            Node p = arr[parent[i]];
            if( p.left == null ){
                p.left = child;
            }else{
                p.right = child;
            }
        }
        
        return head;
    }
}

