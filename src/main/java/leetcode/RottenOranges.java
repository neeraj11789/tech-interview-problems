package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	private int rows;

	private int cols;

	private int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};

	private int freshOrangesCount = 0;

	private int daysCount = -1;

	private Queue<int[]> rottenOrangesPositionQ = new LinkedList<>();

	public int orangesRotting(int[][] grid) {
		rows = grid.length;
		if(rows == 0) return daysCount;

		cols = grid[0].length;

		// Find the Positions for Rotten Oranges & Count Fresh Oranges
	    for (int i = 0; i < rows; i++) {
	      for (int j = 0; j< cols; j++) {
		      if(grid[i][j] == 2)
				rottenOrangesPositionQ.offer(new int[]{i,j});
		      else if(grid[i][j] == 1)
		      	freshOrangesCount++;
	      }
	    }

	    if(rottenOrangesPositionQ.isEmpty()) return -1;

	    // BFS for all the Rotten Oranges
	    while (!rottenOrangesPositionQ.isEmpty()){
		    int[] current = rottenOrangesPositionQ.poll();
		    BFS(grid, current);
	    }

		return daysCount;
	}

	private void BFS(int[][] grid, int[] current) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(current);

		while (!queue.isEmpty() && freshOrangesCount>0){
			current = queue.poll();

			for (int[] dir: dirs){
				int x = current[0] + dir[0];
				int y = current[1] + dir[1];

				if(x<0 || x>=rows || y<0 || y>=cols || grid[x][y]!=1) continue;

				freshOrangesCount--;
				queue.offer(new int[]{x,y});
			}
			daysCount++;
		}
	}
}
