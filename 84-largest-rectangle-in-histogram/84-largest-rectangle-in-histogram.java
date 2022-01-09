class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if( n == 0 ) return 0;
        int[] leftLimit = new int[n];
        int[] rightLimit = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        leftLimit[0] = 0;
        for(int i = 1; i<n; i++){
            while( !st.isEmpty() && heights[st.peek()] >= heights[i] ){
                st.pop();
            }
            leftLimit[i] = st.isEmpty() ? 0 : st.peek() + 1;
            st.push(i);
        }
        st.clear();
        st.push(n-1);
        rightLimit[n-1] = n-1;
        for(int i = n-2; i>=0; i--){
            while( !st.isEmpty() && heights[st.peek()] >= heights[i] ){
                st.pop();
            }
            rightLimit[i] = st.isEmpty() ? n-1 : st.peek() - 1;
            st.push(i);
        }
        
        int maxArea = 0;
        for(int i = 0; i<n; i++){
            int area = heights[i] * (rightLimit[i] - leftLimit[i] + 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}