class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;

        if( k == 0 ) return nums;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int radius = 2*k + 1;
        if(radius > n) return ans;

        long sum = 0;
        for(int i = 0; i< radius; i++) {
            sum += nums[i];
        }
        ans[k] = (int) (sum /radius);

        for(int i = radius; i<n; i++) {
            sum = sum - nums[i - radius] + nums[i];
            ans[i - k] = (int) (sum / radius);
        }

        // long[] prefix = new long[n+1];
        // for(int i = 0; i<n; i++) {
        //     prefix[i + 1] = prefix[i] + nums[i];
        // }

        // for(int i = k; i<(n-k); i++) {
        //     int left = i -k, right = i + k;
        //     long subArraySum = prefix[right + 1] - prefix[left];
        //     int average = (int) (subArraySum) / radius;
        //     ans[i] = average;
        // }
        return ans;
    }
}