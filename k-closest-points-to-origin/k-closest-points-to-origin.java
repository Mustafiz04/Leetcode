class Point implements Comparable<Point>{
    int x;
    int y;
    double dist;
    public Point(int x,int y, double dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
    public int compareTo(Point o){
        if(this.dist>o.dist){
            return 1;
        }else if(this.dist<o.dist){
            return -1;
        }else{
            return 0;
        }
    }
    public String toString(){
        return dist+"";
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        int[][] ans = new int[k][2];
        if( n == 0 || k == 0 ) return ans;
        
        PriorityQueue<Point> q = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            int x = points[i][0];
            int y = points[i][1];
            double dis = Math.pow(x, 2) + Math.pow(y, 2);
            q.add(new Point(x, y, dis));
        }
        int i = 0;
        while( i < k ){
            Point curr = q.remove();
            ans[i][0] = curr.x;
            ans[i][1] = curr.y;
            i++;
        }
        
        return ans;
    }
}