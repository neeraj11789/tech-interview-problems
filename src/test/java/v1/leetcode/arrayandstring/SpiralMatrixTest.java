package v1.leetcode.arrayandstring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

	SpiralMatrix obj;

    @BeforeEach
    void setup() {
    	obj = new SpiralMatrix();
    }

    @Test
    void check() {
	    int[][] mat =
			    {
					    { 1,  2,  3,  4, 5},
					    {16, 17, 18, 19, 6},
					    {15, 24, 25, 20, 7},
					    {14, 23, 22, 21, 8},
					    {13, 12, 11, 10, 9}
			    };

	    obj.spiralOrder(mat);
    }
}