class Solution {
    public int maxDistance(int[] firstInput, int[] secondInput) {
        int maximumDistance = 0;
        int size = Math.min(firstInput.length, secondInput.length);
        for (int i = 0; i < size; i++) {
            maximumDistance = Math.max(maximumDistance, binarySearchForCurrentMaximumDistace(i, firstInput[i], secondInput));
        }
        return maximumDistance;
    }

    private int binarySearchForCurrentMaximumDistace(int pivotIndex, int pivotValue, int[] secondInput) {
        int left = pivotIndex;
        int right = secondInput.length - 1;
        int currentMaximumDistace = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (pivotIndex <= mid && pivotValue <= secondInput[mid]) {
                currentMaximumDistace = mid - pivotIndex;
            }

            if (pivotValue <= secondInput[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return currentMaximumDistace;
    }
}