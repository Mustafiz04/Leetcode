class Solution {
    public void rotate(int[] nums, int d) {
        int n = nums.length;
        d = d % n;
        if( d == 0 ) return;
        
        rotate(nums, 0, n-d-1);
        rotate(nums, n-d, n-1);
        rotate(nums, 0, n-1);
        
        // int gcd = gcd(n, d);
        // int i, j, k, temp;
        // for(i = 0; i<gcd; i++){
        //     temp = nums[i];
        //     j = i;
        //     while(true){
        //         k = j + d;
        //         if( k >= n ){
        //             k = k - n;
        //         }
        //         if( k == i ){
        //             break;
        //         }
        //         nums[j] = nums[k];
        //         j = k;
        //     }
        //     nums[j] = temp;
        // }
    }
    
    public void rotate(int[] arr, int i, int j){
        while( i <= j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    
    public int gcd(int a, int b){
        if( b == 0 ){
            return a;
        }
        return gcd(b, a%b);
    }
}

// [1,2,3,4,5,6,7]
// [4,3,2,1,5,6,7]
// [5,6,7,1,2,3,4]