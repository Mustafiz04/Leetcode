class Solution {
    public int findJudge(int n, int[][] trust) {
        if( n == 0 ) return -1;
        int[] arr = new int[n+1];
        for(int[] r: trust){
            arr[r[0]]--;
            arr[r[1]]++;
        }
        for(int i = 1; i<=n; i++){
            if( arr[i] == n-1 ) return i;
        }
        return -1;
    }
}