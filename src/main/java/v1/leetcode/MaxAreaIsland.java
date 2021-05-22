package v1.leetcode;


import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/max-area-of-island/
 */
public class MaxAreaIsland {

	private int rows;

	private int cols;

	private int[][] dirs = {{0,1}, {1,0}, {0,-1},{-1,0}};

	private int counter = 0;

	public int maxAreaOfIsland(int[][] grid) {
		int maxArea = 0;

		rows = grid.length;

		if(rows == 0) return maxArea;

		cols = grid[0].length;

		Queue<int[]> queue = new LinkedList<>();
		boolean[][] visited = new boolean[rows][cols];

		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){

				if(grid[i][j]==1 && !visited[i][j]){
					visited[i][j]=true;
					queue.offer(new int[]{i,j});
					BFS(grid, queue, visited);
					if(counter > maxArea)
						maxArea = counter;
					// reset counter
					counter = 0;
				}

			}
		}

		return maxArea;

	}

	private void BFS(int[][] grid, Queue<int[]> queue, boolean[][] visited){

		while(!queue.isEmpty()){
			int[] current = queue.poll();
			counter++;

			for(int[] dir: dirs){
				int x = current[0] + dir[0];
				int y = current[1] + dir[1];

				if(x<0 || x>=rows|| y<0 || y>=cols || visited[x][y] || grid[x][y]!=1) continue;

				visited[x][y] = true;
				queue.offer(new int[]{x,y});

			}
		}
	}
}