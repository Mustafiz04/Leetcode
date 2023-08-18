

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2; i>= 0; i--) {
            if( arr[i] >= max ) {
                ans.add(0, arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }
}