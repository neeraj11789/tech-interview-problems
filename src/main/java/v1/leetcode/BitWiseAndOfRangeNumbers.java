package v1.leetcode;

/**
 *
 * https://leetcode.com/problems/bitwise-and-of-numbers-range
 *
 * Explanation here -
 * https://www.youtube.com/watch?v=-qrpJykY2gE
 */
public class BitWiseAndOfRangeNumbers {

	public int rangeBitwiseAnd(int m, int n) {
		int count = 0;

		while (m!=n){
			m>>=1;
			n>>=1;
			count++;
		}

		return m<<=count;
	}
}
