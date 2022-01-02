class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a = nums1.length;
        int b = nums2.length;
        int[] ans = new int[a];
        if( a == 0 ) return ans;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i<b; i++){
            if( st.isEmpty() ){
                st.push(i);
            }
            while( !st.isEmpty() && nums2[st.peek()] < nums2[i] ){
                map.put( nums2[st.pop()], nums2[i] );
            }
            st.push(i);
        }
        for(int i = 0; i<a; i++){
            ans[i] = map.containsKey(nums1[i]) ? map.get(nums1[i]) : -1;
        }
        
        return ans;
    }
}