package v1.leetcode.junechallenge;

/**
 * A very interesting dp problem
 * #redo #revise #favourite
 *
 * @LEARNING: How to effectively use Tabulation Method
 *
 * https://www.youtube.com/watch?v=ruMqWViJ2_U
 * https://leetcode.com/problems/coin-change-2/
 */
public class CoinChange2 {
	/**
	 * @param amount
	 * @param coins
	 * @return
	 */
	public int change(int amount, int[] coins) {
		int COIN_ROWS = coins.length;
		int AMOUNT_COLS = amount;

		int[][] dp = new int[COIN_ROWS+1][AMOUNT_COLS+1];
		/**
		 * Fill the first row and first column of the DP table
		 */
		// For amount 0 - there is one way for all the combinations
		for (int i = 0; i <= COIN_ROWS; i++) {
			dp[i][0] = 1;
		}

		// With Zero coins taken - there are 0 ways
		for (int i = 1; i <= AMOUNT_COLS; i++) {
			dp[0][i] = 0;
		}

		// fill the DP Table
		for (int i = 1; i <= COIN_ROWS ; i++) {
			int current_coin = coins[i-1];
			for (int j = 1; j <= AMOUNT_COLS; j++) {
				if(j>=current_coin)
					dp[i][j] = dp[i][j-current_coin] + dp[i-1][j];
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		return dp[COIN_ROWS][AMOUNT_COLS];
	}
}
