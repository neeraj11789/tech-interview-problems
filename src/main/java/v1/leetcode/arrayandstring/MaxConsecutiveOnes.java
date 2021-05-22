package v1.leetcode.arrayandstring;

/**
 *
 * @NOTE: Do take care of the edge cases
 *
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1301/
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		int counter = 0;
		int res = 0;

		if (nums == null || nums.length == 0)
			return 0;

		for (int i=0; i< nums.length; i++){
			if (nums[i] != 1){
				res = Math.max(res, counter);
				counter = 0;
			}
			else
				counter++;
		}

		return Math.max(res, counter);
	}
}
