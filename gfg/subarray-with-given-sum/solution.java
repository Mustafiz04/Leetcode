

class Solution{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(s == 0) {
            ans.add(-1);
            return ans;
        }
        int start = 0, last = 0, sum = 0;
        while(last < n) {
            sum += arr[last];
            while( sum > s ) {
                sum -= arr[start++];
            }
            if( sum == s ) {
                ans.add(start+1);
                ans.add(last+1);
                return ans;
            }
            last++;
        }
        ans.add(-1);
        return ans;
    }
}