class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        int low = 0;
        int high = arr.length - 1;
        while(high - low >= k){
            int distLow = Math.abs(arr[low] - x);
            int distHigh = Math.abs(arr[high] - x);
            if(distLow <= distHigh)
                high--; 
            else
                low++;
        }
        while(low <= high)
            list.add(arr[low++]);        
        return list;
    }
}