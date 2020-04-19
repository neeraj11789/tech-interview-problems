package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicallySmallestStringTest {

    LexicographicallySmallestString obj;

    @BeforeEach
    void setUp() {
        obj = new LexicographicallySmallestString();
    }

    @Test
    void test1() {
        String res = obj.getSmallString("abczd");
	    Assertions.assertThat(res.compareTo("abcd"));
    }

	@Test
	void test2() {
		String res = obj.getSmallString("abcde");
		Assertions.assertThat(res.compareTo("abcd"));
	}

	@Test
	void test3() {
		String res = obj.getSmallString("abcda");
		Assertions.assertThat(res.compareTo("abca"));
	}
}