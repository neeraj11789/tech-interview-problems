package v1.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/
 *
 * Details Here - https://www.youtube.com/watch?v=K2E5fMMAf5U
 *
 * @Note : How to leverage the given information
 * If we start from the end then we can
 * achieve the same result in M+N Complexity
 */
public class LeftmostColumnWithAtleastAOne {
	public int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
		int result = -1;

		List<Integer> dimension = binaryMatrix.dimensions();
		int rows = dimension.get(0);
		int cols = dimension.get(1);

		int r = rows - 1;
		int c = cols - 1;

		while (r>=0 && c>=0){
			int current = binaryMatrix.get(r,c);
			if(current == 1){
				result = c;
				c--;
			}else{
				r--;
			}
		}


		System.out.println(r);
		System.out.println(c);

		return result;
	}

	/**
	 * Sample Code
	 */
	private class BinaryMatrix {
		public List<Integer> dimensions() {
			List<Integer> result = new ArrayList<>();
			return result;
		}

		public int get(int r, int c) {
			return 0;
		}
	}
}
