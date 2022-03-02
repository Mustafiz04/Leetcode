class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        Arrays.sort(coordinates,(a,b)->Integer.compare(a[0],b[0]));
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        if(x1 == x2){
            for(int i=2; i<coordinates.length; i++){
                int a1 = coordinates[i][0];
                if(a1 != x1)
                    return false;
            }
            return true;
        }
        
        if(y1 == y2){
            for(int i=2; i<coordinates.length; i++){
                int a1 = coordinates[i][1];
                if(a1 != y1)
                    return false;
            }
            return true;
        }
        double m = (double)Math.abs(y2-y1)/(double)Math.abs(x2-x1);
        
        for(int i=2; i<coordinates.length; i++){
            int a1 = coordinates[i][0], b1 = coordinates[i][1];
            if(a1-x2==0)
                return false;
            double m1 = (double)Math.abs(y2-b1)/(double)Math.abs(x2-a1);
            if(m1!=m)
            return false;
            
            x2 = a1;
            y2 = b1;
        }
        return true;
    }
}