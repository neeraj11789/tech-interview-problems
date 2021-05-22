package v1.leetcode.junechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueueReconstructionByHeightTest {

	private QueueReconstructionByHeight obj;

	@BeforeEach
	void setUp() {
		obj = new QueueReconstructionByHeight();
	}

	@Test
	void reconstructQueue() {
		int[][] test = new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		obj.reconstructQueue(test);
	}
}