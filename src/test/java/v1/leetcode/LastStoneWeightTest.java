package v1.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LastStoneWeightTest {

    @Test
    void lastStoneWeight() {
        LastStoneWeight stoneWeight = new LastStoneWeight();

        int[] arr = new int[]{2,7,4,1,8,1};
        int res = stoneWeight.lastStoneWeight(arr);
        Assertions.assertEquals(1, res);
    }

    @Test
    void lastStoneWeight0() {
        LastStoneWeight stoneWeight = new LastStoneWeight();

        int[] arr = new int[]{1,1};
        int res = stoneWeight.lastStoneWeight(arr);
        Assertions.assertEquals(0, res);
    }
}