public int[][] prefixSum(int N, int[][]grid){
	int[][]pfx = new int[grid.length][grid.length];
	for (int i = 1; i < N + 1; i++) {
		for (int j = 1; j < N + 1; j++) {
			pfx[i][j] = grid[i][j]+ pfx[i-1][j] + pfx[i][j-1]- pfx[i-1][j-1];
		}
	}
			
	return pfx;
 }
		
public int prefixSum2D(int x1, int y1, int x2, int y2, int[][]pfx) { return pfx[x2][y2] - pfx[x1-1][y2] - pfx[x2][y1-1] + pfx[x1-1][y1-1];}
