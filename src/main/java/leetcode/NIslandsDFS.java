package leetcode;

/**
 * https://leetcode.com/problems/number-of-islands/submissions/
 */
public class NIslandsDFS {

	private int m;

	private int n;

	public int numIslands(char[][] grid) {
		int result = 0;

		n = grid.length;
		// edge case
		if (n==0) return 0;
		m = grid[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == '1'){
					DFSUtil(grid, i, j);
					++result;
				}
			}
		}

		return result;
	}

	private void DFSUtil(char[][] grid, int i, int j) {
		if (i<0 || i>=n || j<0 || j>=m || grid[i][j] != '1') return;

		// mark as visited
		grid[i][j] = '2';
		// top - right - down - left
		DFSUtil(grid, i, j+1);
		DFSUtil(grid, i+1, j);
		DFSUtil(grid, i, j-1);
		DFSUtil(grid, i-1, j);
	}

}
