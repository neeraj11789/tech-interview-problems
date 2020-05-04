package leetcode.arrayandstring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatrixZigZag {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> list = new ArrayList<>();

		if(matrix == null || matrix.length == 0)
			return list;

		int M = matrix.length;
		int N = matrix[0].length;
		int flag = 1;

		List<Integer> intermediate = new ArrayList<>();

		for (int i=0; i<M; i++){
			intermediate.clear();
			for (int j=0; j<N; j++){
				intermediate.add(matrix[i][j]);
			}
			if (i%2!=0) Collections.reverse(intermediate);
			list.addAll(intermediate);
		}

		return list;
	}
}
