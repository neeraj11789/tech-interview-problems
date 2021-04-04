package leetcode.arrays102;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author neerajgupta
 * @since 04/04/21
 */
class MaxConsecutiveOnesTest {

    private MaxConsecutiveOnes maxConsecutiveOnes;

    @BeforeEach
    void setUp() {
        maxConsecutiveOnes = new MaxConsecutiveOnes();
    }

    @Test
    void shouldReturn3ForDefaultList() {
        final int count = maxConsecutiveOnes.run();
        Assertions.assertEquals(3, count);
    }

    @Test
    void test2() {
        List<Integer> list = Lists.newArrayList(1);
        maxConsecutiveOnes.setList(list);
        final int count = maxConsecutiveOnes.run();
        Assertions.assertEquals(1, count);
    }

    @Test
    void test3() {
        List<Integer> list = Lists.newArrayList(0);
        maxConsecutiveOnes.setList(list);
        final int count = maxConsecutiveOnes.run();
        Assertions.assertEquals(0, count);
    }

    @Test
    void test4() {
        List<Integer> list = Lists.newArrayList(0, 1, 0,0,0,0,0);
        maxConsecutiveOnes.setList(list);
        final int count = maxConsecutiveOnes.run();
        Assertions.assertEquals(1, count);
    }
}