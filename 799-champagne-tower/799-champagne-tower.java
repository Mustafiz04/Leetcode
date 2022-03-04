class Solution {
    public double champagneTower(int poured, int queryRow, int queryGlass) {
        if (poured == 0)
            return 0;
        var prevRow = new ArrayList<>(List.of((double) poured));

        while (queryRow-- > 0) {
            var currentRow = new ArrayList<Double>();
            var champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2); 
            currentRow.add(champagneInEnds);

            for (var i = 1; i < prevRow.size(); i++)
                currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) +  Math.max(0, (prevRow.get(i) - 1) / 2)); 
            currentRow.add(champagneInEnds);
            prevRow = currentRow;
        }
        return Math.min(1, prevRow.get(queryGlass));
    }
}