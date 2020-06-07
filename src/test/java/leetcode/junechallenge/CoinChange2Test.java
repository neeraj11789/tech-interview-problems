package leetcode.junechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoinChange2Test {

	private CoinChange2 coinChange2;

	@BeforeEach
	void setUp() {
		coinChange2 = new CoinChange2();
	}

	@Test
	void test() {
		coinChange2.change(5, new int[]{1,2,5});
	}
}