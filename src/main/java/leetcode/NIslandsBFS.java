package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-islands/discuss/56338/Java-DFS-and-BFS-solution
 */
public class NIslandsBFS {

	private int rows;

	private int cols;

	private int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};

	public int numIslands(char[][] grid) {
		int count = 0;

		if (grid.length == 0) return 0;

		rows = grid.length;
		cols = grid[0].length;

		boolean[][] visited = new boolean[rows][cols];
		Queue<int[]> queue = new LinkedList<>();

		for (int i=0; i<rows; i++){
			for (int j=0; j<cols; j++){

				// BFS for the Islands
				if(grid[i][j] == '1' && !visited[i][j]){

					queue.offer(new int[]{i, j});
					visited[i][j] = true;
					BFS(grid, queue, visited);
					count++;

				}
			}
		}

		return count;
	}

	private void BFS(char[][] grid, Queue<int[]> queue, boolean[][] visited) {

		while (!queue.isEmpty()){

			int[] current = queue.poll();
			// Move in all the directions
			for (int[] dir : dirs){
				int x = dir[0] + current[0];
				int y = dir[1] + current[1];

				// Ignore invalid or already visited or non island
				if (x < 0 || x >=rows || y < 0 || y>=cols || visited[x][y] || grid[x][y] != '1') continue;

				// mark visited
				visited[x][y] = true;

				// add to queue
				queue.offer(new int[]{x,y});
			}
		}
	}
}
