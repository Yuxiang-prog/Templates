static char[][]grid;
static int N, M;
static boolean[][] visited;
static int currentSize = 0;


static void floodfill(int r, int c, char color){
        if(r < 0 || r >= M || c < 0 || c >= N) return;
        if(grid[r][c] != color) return;
        if(visited[r][c]) {
            return;
        }
        //out.println(r + " " + c);
        visited[r][c] = true;
        //currentSize ++;
        floodfill(r + 1, c-1, color);
        floodfill(r -1, c+1, color);
        floodfill(r+1, c + 1, color);
        floodfill(r -1, c-1, color);
        floodfill(r, c+1, color);
        floodfill(r, c-1, color);
        floodfill(r-1, c, color);
        floodfill(r+1, c, color);
}
