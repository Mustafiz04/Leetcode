class Solution {
    int[] dx= {1, -1, 0, 0};
    int[] dy= {0, 0, 1, -1};
    class Pair{
        int row, col, price, dis;
        Pair(int row, int col, int price, int dis){
            this.row = row;
            this.col = col;
            this.dis = dis;
            this.price = price;
        }
    }
    
    class Cell{
        int row, col, dis;
        Cell(int row, int col, int dis){
            this.row = row;
            this.col = col;
            this.dis = dis;
        }
    }
    
    public List<List<Integer>> highestRankedKItems(int[][] grid, int[] pricing, int[] start, int k) {
        int row = grid.length;
        int col = grid[0].length;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>( (p1, p2) -> {
            if(p1.dis != p2.dis) return p1.dis - p2.dis;
            if(p1.price != p2.price) return p1.price - p2.price;
            if(p1.row != p2.row) return p1.row - p2.row;
            return p1.col - p2.col;
        });
        
        boolean[][] vis = new boolean[row][col];
        vis[start[0]][start[1]] = true;
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(start[0], start[1], 0));
        while( !q.isEmpty() ){
            Cell curr = q.poll();
            for(int i = 0; i<4; i++){
                int x1 = curr.row + dx[i];
                int y1 = curr.col + dy[i];
                if( x1 < 0 || x1 >= row || y1 < 0 || y1 >= col ) continue;
                if( grid[x1][y1] == 0 || vis[x1][y1] == true ) continue;
                vis[x1][y1] = true;
                q.add( new Cell(x1, y1, curr.dis + 1) );
            }
            
            if( grid[curr.row][curr.col] >= pricing[0] && grid[curr.row][curr.col] <= pricing[1] && grid[curr.row][curr.col]>= 1){
                pq.add(new Pair( curr.row, curr.col, grid[curr.row][curr.col], curr.dis ));
            }
        }
        
        List<List<Integer>> ans = new ArrayList<>();
        while( k > 0 && !pq.isEmpty() ){
            Pair p = pq.poll();
            List<Integer> al = new ArrayList<>();
            al.add(p.row);
            al.add(p.col);
            ans.add(al);
            k--;
        }
        
        return ans;
    }
}