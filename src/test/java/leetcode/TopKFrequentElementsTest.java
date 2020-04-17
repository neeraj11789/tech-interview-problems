package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
//        int[] arr = new int[]{1,1,1,2,2,3,5,6,2,6,3,4};
        int[] arr = new int[]{5,5,3,3,3,3,2,2,2,2,2,2,2,2,2,1,1,1,1,1,7,3,3};
        int k = 3;
        TopKFrequentElements elements = new TopKFrequentElements();
        List<Integer> res = elements.topKFrequent(arr,k);
        Assertions.assertEquals(res.size(),3);
        org.assertj.core.api.Assertions.assertThat(res.contains(3));
        org.assertj.core.api.Assertions.assertThat(res.contains(2));
        org.assertj.core.api.Assertions.assertThat(res.contains(1));

    }
}