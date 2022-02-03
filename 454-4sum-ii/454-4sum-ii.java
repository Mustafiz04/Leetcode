class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        for(int i = 0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                int sum = nums1[i] + nums2[j];
                m1.put(sum, m1.getOrDefault(sum, 0) + 1 );
            }
        }
        
        for(int i = 0; i<nums3.length; i++){
            for(int j = 0; j<nums4.length; j++){
                int sum = nums3[i] + nums4[j];
                m2.put(sum, m2.getOrDefault(sum, 0) + 1 );
            }
        }
        
        for(Map.Entry<Integer, Integer> e : m1.entrySet() ){
            int curr = e.getKey();
            if( m2.containsKey(-curr) ){
                count += e.getValue() * m2.get(-curr);
            }
        }
        
        return count;
    }
}