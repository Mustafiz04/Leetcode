

//User function Template for Java

class Solution{
    public long findMinDiff (ArrayList<Integer> a, int n, int m){
        Collections.sort(a);
        int minDiff = a.get(m-1) - a.get(0);
        for(int i = 1; i<=n-m; i++) {
            minDiff = Math.min(a.get(m-1+i)- a.get(i), minDiff);
        }
        return minDiff;
    }
}