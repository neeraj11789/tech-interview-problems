package v1.leetcode;

public class MaximumSquares {

	public int maximalSquare(char[][] matrix) {

		if (matrix == null || matrix.length == 0) return 0;

		int rows = matrix.length;
		int cols = matrix[0].length;

		int[][] dp = new int[rows][cols];

		// Copy First Row and First Column
		for (int i=0; i<cols; i++)
			dp[0][i] = matrix[0][i];

		for (int i=0; i<rows; i++)
			dp[i][0] = matrix[i][0];

		int largest = 0;

		// Populate Rest of the rows
		for (int i=1; i<rows; i++){
			for (int j=1; j<cols; j++){

				if(matrix[i][j] == '1'){
					dp[i][j] = 1 + Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
				}

				if (largest < dp[i][j]) largest = dp[i][j];

			}
		}

		return largest * largest;

	}
}
