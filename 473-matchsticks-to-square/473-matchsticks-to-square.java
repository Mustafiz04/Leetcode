import java.util.HashMap;

class Solution {
    public HashMap<Pair<Integer, Integer>, Boolean> memo;
    public int[] nums;
    public int possibleSquareSide;
    public Solution() {
        this.memo = new HashMap<Pair<Integer, Integer>, Boolean>();
    }

    // Main DP function.
    public boolean recurse(Integer mask, Integer sidesDone) {
        int total = 0;
        int L = this.nums.length;

        Pair<Integer, Integer> memoKey = new Pair(mask, sidesDone);

        for(int i = L - 1; i >= 0; i--) {
            if ((mask&(1 << i)) == 0) {
                total += this.nums[L - 1 - i];
            }
        }
        if (total > 0 && total % this.possibleSquareSide == 0) {
            sidesDone++;
        }
        if (sidesDone == 3) {
            return true;
        }
        if (this.memo.containsKey(memoKey)) {
            return this.memo.get(memoKey);
        }

        boolean ans = false;
        int c = total / this.possibleSquareSide;
        int rem = this.possibleSquareSide * (c + 1) - total;

        for(int i = L - 1; i >= 0; i--) {
            if (this.nums[L - 1 - i] <= rem && (mask&(1 << i)) > 0) {
                if (this.recurse(mask ^ (1 << i), sidesDone)) {
                    ans = true;
                    break;
                }
            }
        }
        this.memo.put(memoKey, ans);
        return ans;
    }

    public boolean makesquare(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int L = nums.length;
        int perimeter = 0;
        for(int i = 0; i < L; i++) {
            perimeter += nums[i];
        }

        int possibleSquareSide =  perimeter / 4;
        if (possibleSquareSide * 4 != perimeter) {
            return false;
        }

        this.nums = nums;
        this.possibleSquareSide = possibleSquareSide;
        return this.recurse((1 << L) - 1, 0);
    }
}