package leetcode.arrayandstring;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @LEARNING : Simulation Method using 4 pointers - top, left, right & bottom
 *
 * Explanation here - https://www.techiedelight.com/print-matrix-spiral-order/
 *
 * https://leetcode.com/explore/learn/card/array-and-string/202/introduction-to-2d-array/1168/
 */
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();

		if(matrix == null || matrix.length==0) return list;

		int M = matrix.length;
		int N = matrix[0].length;

		// 4 POINTERS
		int top = 0;
		int left = 0;
		int right = N-1;
		int bottom = M-1;

		System.out.println("right: " + right);
		System.out.println("bottom: " + bottom);

		do{
			// process TOP
			for (int i=left; i<=right; i++)
				list.add(matrix[top][i]);
			top++;
			if(top > bottom) break;

			// process right
			for (int i=top; i<=bottom; i++){
				list.add(matrix[i][right]);
			}
			right--;
			if(left > right) break;

			// process bottom
			for (int i=right; i>=left; i--){
				list.add(matrix[bottom][i]);
			}
			bottom--;
			if(top>bottom) break;

			for (int i=bottom; i>=top; i--){
				list.add(matrix[i][left]);
			}
			left++;
			if(left>right) break;

		}while (true);

		return list;
	}
}
