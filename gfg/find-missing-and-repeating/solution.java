

// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int duplicate = -1, missing = -1;
        for(int i = 0; i<n; i++) {
            if( arr[Math.abs(arr[i]) - 1] < 0 ) {
                duplicate = Math.abs(arr[i]);
            } else {
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
            }
        }
        for(int i = 0; i<n; i++) {
            if( arr[i] > 0 ) missing = i+1;
        }
        return new int[]{duplicate, missing};
    }
}