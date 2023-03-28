class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] ans = new int[n1];
        if(n1 == 0) return ans;
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i<n2; i++){
            while(!s.isEmpty() && nums2[s.peek()] < nums2[i] ){
                hm.put( nums2[s.pop()], nums2[i] );
            }
            s.add(i);
        }

        for(int i = 0; i<n1; i++){
            nums1[i] = hm.containsKey(nums1[i]) ? hm.get(nums1[i]) : -1;
        }

        return nums1;
    }
}