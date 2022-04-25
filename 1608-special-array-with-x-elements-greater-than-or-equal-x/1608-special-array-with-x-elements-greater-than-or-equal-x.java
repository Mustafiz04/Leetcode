class Solution {
    public int specialArray(int[] nums) {
    int st=1;
        int ed=1000;
        while(st<=ed){
            int mid=st+(ed-st)/2;
            int sk=ckr(nums, mid);
            if(sk==mid)return mid;
            else if(sk<mid){
                ed=mid-1;
            }
            else if(sk>mid){
                st=mid+1;
            }
        }
        return -1;
    }
    public int ckr(int[] arr, int nm){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=nm)cnt++;
        }
        return cnt;
    }
}