class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int invalid = 0;
        Arrays.sort(arr2);
        for (int a: arr1) {            
            if (isInvalid(arr2, a, d)) 
                invalid++;
        }
        return arr1.length - invalid;
    }


	private boolean isInvalid(int[] arr, int num, int d) {
		int left = 0, right = arr.length-1;
		while (left <= right) {
			int mid = left + (right-left)/2;
			int distance = arr[mid] - num;
			if (Math.abs(distance) <= d) 
				return true;
			else if (distance < 0)
				left = mid+1;
			else
				right = mid-1;
		}
		return false;
	}
}