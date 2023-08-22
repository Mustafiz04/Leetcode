


class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i = 0; i<N; i++) {
            int sum = 0;
            int sum1 = 0;
            
            for(int j = 0; j<N; j++){
                sum += matrix[i][j];
                sum1 += matrix[j][i];
            }
            
            list.add(sum);
            list.add(sum1);
        }
        int max = Collections.max(list);
        int ans = 0;
        for(int i =0; i<list.size(); i++){
            ans += max - list.get(i);
        }
        return ans/2;
    }
}