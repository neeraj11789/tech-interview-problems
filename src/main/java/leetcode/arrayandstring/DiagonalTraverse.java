package leetcode.arrayandstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @LEARNING : Maths around the calculation of the head pointers for traversing the matrix
 *
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1167/
 */
public class DiagonalTraverse {
	public int[] findDiagonalOrder(int[][] matrix) {
		if(matrix == null || matrix.length == 0)
			return new int[0];

		int M = matrix.length;
		int N = matrix[0].length;

		int[] result = new int[M*N];
		int resCount = 0;
		List<Integer> intermediateList = new ArrayList<>();

		// We have to go over all the elements in the first
		// row and the last column to cover all possible diagonals
		for(int d=0; d<M+N-1; d++){
			// clear list for every call
			intermediateList.clear();

			// We need to figure out the "head" of this diagonal
			// The elements in the first row and the last column
			// are the respective heads.

			int row = d < N ? 0 : d - N + 1; // +1 for new row
			int col = d < N ? d : N - 1;

			while (row < M && col >=0){
				intermediateList.add(matrix[row][col]);
				row++;
				col--;
			}

			// Reverse even numbered diagonals. The
			// article says we have to reverse odd
			// numbered articles but here, the numbering
			// is starting from 0 :P
			if (d % 2 == 0) {
				Collections.reverse(intermediateList);
			}

			for (int i = 0; i < intermediateList.size(); i++) {
				result[resCount++] = intermediateList.get(i);
			}
		}

		return result;
	}
}
