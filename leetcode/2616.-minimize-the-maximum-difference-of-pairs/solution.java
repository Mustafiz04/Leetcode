class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int left = 0, right = nums[n - 1] - nums[0];

        while( left < right ) {
            int mid = left + (right - left) / 2;
            if( countPair(nums, mid) >= p ) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int countPair(int[] arr, int threshold) {
        int count = 0, index = 0;
        while(index < arr.length - 1) {
            if( arr[index + 1] - arr[index] <= threshold  ) {
                count++;
                index++;
            }
            index++;
        } 
        return count;
    }
}