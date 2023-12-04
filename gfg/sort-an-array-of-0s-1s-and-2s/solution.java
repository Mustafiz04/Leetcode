//User function template for Java

class Solution{
    public static void sort012(int arr[], int n){
        // int[] count = new int[3];
        // for(int i: arr){
        //     count[i]++;
        // }
        // int curr = 0;
        // for(int i = 0; i<n; i++){
        //     if(count[curr] == 0){
        //         curr++;
        //     }
        //     arr[i] = curr;
        //     count[curr]--;
        // }
        
        int start = 0, mid = 0, end = n-1;
        
        while(mid <= end){
            switch( arr[mid] ){
                case 0:
                    swap(arr, start++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, end--);
                    break;
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}