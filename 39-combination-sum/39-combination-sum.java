class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;
        List<Integer> path = new ArrayList<>();
        sum(candidates, 0, n, target, path);
        return ans;
    }
    
    public void sum(int[] cand, int start, int end, int target, List<Integer> path){
        if( target < 0 || start >= end ){
            return;
        }
        if( target == 0 ){
            ans.add(new ArrayList(path));
            return;
        }
        path.add(cand[start]);
        sum(cand, start, end, target - cand[start], path);
        path.remove(path.size() - 1);
        sum(cand, start+1, end, target, path);
    }
}