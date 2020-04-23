package leetcode;

import java.util.*;

/**
 * @Note : A simple problem on BFS
 * https://www.techiedelight.com/chess-knight-problem-find-shortest-path-source-destination/
 */
public class MinMovedSrcToDesGeneric {

	private static final int MAX_N = 8;

	// List of Valid Moves
	List<Move> moves = new ArrayList<>();

	/**
	 * Initiate the moves in the constructor
	 */
	public MinMovedSrcToDesGeneric() {
		initMoves();
	}

	/**
	 * Since we are doing BFS, when we get the least move element first - we return
	 * @param source
	 * @param destination
	 */
	public int BFS(Cell source, Cell destination){

		// To keep which ones have already been visited
		Set<Cell> isVisited = new HashSet<>();

		Queue<Cell> queue = new LinkedList<>();

		// add the source to the queue
		queue.offer(source);

		// Level Order Traversal of Tree
		while (!queue.isEmpty()) {

			Cell currentCell = queue.poll();

			// return if got the node
			if (currentCell.x == destination.x && currentCell.y == destination.y) {
				return currentCell.level;
			}

			if (isVisited.contains(currentCell)) continue;

			isVisited.add(currentCell);

			for (int i = 0; i < moves.size(); i++) {

				Cell nextMove = nextMove(i, currentCell);
				nextMove.setLevel(currentCell.level + 1);

				// If it is valid move, add this to the q
				if (nextMove.isValid()) {
					queue.offer(nextMove);
				}
			}
		}

		// -1 denotes cannot be reached
		return -1;

	}

	/**
	 * @NOTE: In case of any chess piece, we would initiate this
	 */
	private void initMoves(){
		Move move = new Move(2, -1);
		moves.add(move);
		move = new Move(2, 1);
		moves.add(move);
		move = new Move(-2, -1);
		moves.add(move);
		move = new Move(-2, 1);
		moves.add(move);
		move = new Move(1, 2);
		moves.add(move);
		move = new Move(1, -2);
		moves.add(move);
		move = new Move(-1, 2);
		moves.add(move);
		move = new Move(-1, -2);
		moves.add(move);
	}

	/**
	 * Get Next Move for the chess Player
	 * @param counter
	 * @param currentCell
	 * @return
	 */
	private Cell nextMove(int counter, Cell currentCell){
		Move next =  moves.get(counter);
		int x = currentCell.x + next.x;
		int y = currentCell.y + next.y;

		return new Cell(x, y);
	}


	/**
	 * Cell class representing the cell of the chess
	 */
	static class Cell{
		int x;
		int y;
		int level;

		/**
		 * Constructor
		 * @param x
		 * @param y
		 */
		public Cell(int x, int y) {
			this.x = x;
			this.y = y;
		}

		/**
		 * Cell Constructor
		 * @param x
		 * @param y
		 * @param level
		 */
		public Cell(int x, int y, int level) {
			this.x = x;
			this.y = y;
			this.level = level;
		}

		/**
		 * Set the Level
		 * @param level
		 */
		public void setLevel(int level) {
			this.level = level;
		}

		/**
		 * Is Valid Cell
		 * @return
		 */
		public boolean isValid(){
			if (x < 0 || y < 0 || x > MAX_N || y > MAX_N)
				return false;

			return true;
		}
	}

	/**
	 * Move Class, representing each move a piece can take
	 */
	static class Move{
		int x;
		int y;

		public Move(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
