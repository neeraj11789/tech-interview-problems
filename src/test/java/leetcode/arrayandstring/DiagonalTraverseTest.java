package leetcode.arrayandstring;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalTraverseTest {

	DiagonalTraverse obj;

    @BeforeEach
    void setUp() {
    	obj = new DiagonalTraverse();
    }

    @Test
    void check() {
		int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
	    int[] result = obj.findDiagonalOrder(matrix);
	    Assertions.assertThat(result).containsSequence(1,2,6,11,7,3);
    }
}