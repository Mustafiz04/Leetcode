class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        if( numRows == 0 ) return pascal;
        List<Integer> row = new ArrayList<>();
        row.add(1);
        pascal.add(row);
        
        for(int i = 1; i<numRows; i++){
            List<Integer> lastRow = pascal.get(i-1);
            List<Integer> r = new ArrayList<>();
            
            r.add(1);
            
            for(int j = 1; j<i; j++){
                r.add( lastRow.get(j) + lastRow.get(j-1) );
            }
            
            r.add(1);
            pascal.add(r);
        }
        return pascal;
    }
}