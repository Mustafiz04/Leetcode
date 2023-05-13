class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] dp = new int[high + 1];
        dp[0] = 1;
        int mod = 1000000007;

        for(int i = 1; i<= high; i++) {
            if( i >= zero ) {
                dp[i] += dp[i - zero];
            }
            if( i >= one ) {
                dp[i] += dp[i - one];
            }

            dp[i] %= mod;
        }

        int ans = 0;
        for(int i = low; i<=high; i++) {
            ans += dp[i];
            ans %= mod;
        }

        return ans;
    }
}


// String zero = "0"
// String one = "11"

// low = 1, high = 3

// len = 1
// 0

// len = 2
// 00
// 11

// len = 3
// 000
// 110
// 011