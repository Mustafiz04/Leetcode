

//User function Template for Java


class Solution {

    public static int maxOnes(int a[], int n) {
        int maxo = 0, one = 0, temp = 0;
        for(int i = 0; i<n; i++){
            if(temp < 0) temp = 0;
            if(a[i] == 1){
                temp--;
                one++;
            } else {
                temp++;
            }
            maxo = Math.max(temp, maxo);
        }
        return maxo + one;
    }
}