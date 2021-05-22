package v1.leetcode.arrayandstring;

import java.util.Arrays;

/**
 * @NOTE: Sort and just use 1 elements out the two elements
 *
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1154/
 */
public class ArrayPartition1 {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}
}
