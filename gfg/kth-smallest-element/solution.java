

//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        // Arrays.sort(arr);
        // return arr[k-1];
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        while(l <= r){
            q.add(arr[l++]);
            if(q.size() > k){
                q.poll();
            }
        }
        return q.poll();
    } 
}