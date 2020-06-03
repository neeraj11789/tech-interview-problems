package leetcode.junechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoCitySchedulingTest {

	private TwoCityScheduling obj;

	@BeforeEach
	void setUp() {
		obj = new TwoCityScheduling();
	}

	@Test
	void twoCitySchedCost() {
		int[][] arr = new int[][]{{10,20}, {30,200}, {400,50}, {30,20}};
		obj.twoCitySchedCost(arr);
	}
}