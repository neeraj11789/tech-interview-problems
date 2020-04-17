package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class KthLargestTest {

//    KthLargest obj;
    KthLargestOptimized obj;

    @BeforeEach
    void setUp() {
        int k = 3;
        int[] nums = new int[]{4,5,8,2};
//        obj = new KthLargest(k, nums);
        obj = new KthLargestOptimized(k, nums);
    }


    @Test
    void add() {
        obj.add(3);
        obj.add(5);
        obj.add(10);
        obj.add(9);
        int x = obj.add(4);
        Assertions.assertThat(x == 10);
    }
}