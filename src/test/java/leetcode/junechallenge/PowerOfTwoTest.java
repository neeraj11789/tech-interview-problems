package leetcode.junechallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PowerOfTwoTest {

	private PowerOfTwo obj;

	@BeforeEach
	void setUp() {
		obj = new PowerOfTwo();
	}

	@Test
	void test() {
		obj.isPowerOfTwo(536870912);
	}
}