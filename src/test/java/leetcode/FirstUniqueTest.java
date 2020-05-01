package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueTest {

	FirstUnique obj;

	@BeforeEach
	void setUp() {
		int[] arr = {7,7,7,7,7,7};
		obj = new FirstUnique(arr);
	}

	@Test
	void showFirstUnique() {
	    System.out.println(obj.showFirstUnique());
	    obj.add(7);
		obj.add(3);
		obj.add(3);
		obj.add(7);
		obj.add(17);
		System.out.println(obj.showFirstUnique());
	}
}