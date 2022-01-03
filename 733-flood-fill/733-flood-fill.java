class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        if( image == null || row == 0 ) return null;
        int col = image[0].length;
        int color = image[sr][sc];
        if( color != newColor ){
            dfs(image, sr, sc, row, col, newColor, color);
        }
        return image;
    }
    
    public void dfs(int[][] image, int sr, int sc, int row, int col, int newColor, int currColor){
        if( sr < 0 || sr >= row || sc < 0 || sc >= col || image[sr][sc] != currColor ){
            return;
        }
        image[sr][sc] = newColor;
        dfs(image, sr+1, sc, row, col, newColor, currColor);
        dfs(image, sr-1, sc, row, col, newColor, currColor);
        dfs(image, sr, sc+1, row, col, newColor, currColor);
        dfs(image, sr, sc-1, row, col, newColor, currColor);
    }
}