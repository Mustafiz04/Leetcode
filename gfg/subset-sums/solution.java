

//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> ans = new ArrayList<>();
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        getSubsetSum(arr, 0, N, 0);
        return ans;
    }
    
    void getSubsetSum(ArrayList<Integer> arr, int index, int n, int sum) {
        if( index >= n ) {
            ans.add(sum);
            return;
        }
        sum += arr.get(index);
        getSubsetSum(arr, index + 1, n, sum);
        sum -= arr.get(index);
        getSubsetSum(arr, index + 1, n, sum);
    }
}