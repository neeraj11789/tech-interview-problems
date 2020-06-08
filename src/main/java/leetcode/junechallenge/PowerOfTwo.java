package leetcode.junechallenge;

import java.util.HashSet;
import java.util.Set;

/**
 * https://www.youtube.com/watch?v=4cqHahxFTYw
 *
 * https://leetcode.com/problems/power-of-two
 *
 * #bitwise #hashset #set
 */
public class PowerOfTwo {
	/**
	 * Method 1 - Using Set
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo2(int n) {
		if(n==0) return false;
		Set<Integer> set = new HashSet<>();

		int i = 1;
		while (true){
			set.add(i);
			if(i > Integer.MAX_VALUE / 2) break;
			i = i*2;
		}

		return set.contains(n);
	}

	/**
	 * Method 2 - Using BitWise
	 * @param n
	 * @return
	 */
	public boolean isPowerOfTwo(int n) {
		if (n==0)
			return false;

		while (n>1 && (n&1)==0)
			n>>=1;

		return n == 1;
	}

	public boolean isPowerOfTwo1(int n) {
		if(n==0) return false;

		return Math.floor(log2(n)) == Math.ceil(log2(n));
	}

	private double log2(int n) {
		return Math.log(n) / Math.log(2);
	}

}