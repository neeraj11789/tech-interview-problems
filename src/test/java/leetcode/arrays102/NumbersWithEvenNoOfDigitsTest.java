package leetcode.arrays102;

import static org.junit.jupiter.api.Assertions.*;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author neerajgupta
 * @since 04/04/21
 */
class NumbersWithEvenNoOfDigitsTest {

    private NumbersWithEvenNoOfDigits program;

    @BeforeEach
    void setUp() {
        program = new NumbersWithEvenNoOfDigits();
    }

    @Test
    void test1() {
        final Integer integer = program.run();
        Assertions.assertEquals(2, integer);
    }

    @Test
    void test2() {
        program.setList(Lists.newArrayList(2, 12));
        final Integer integer = program.run();
        Assertions.assertEquals(1, integer);
    }

    @Test
    void test3() {
        program.setList(Lists.newArrayList());
        final Integer integer = program.run();
        Assertions.assertEquals(0, integer);
    }
}