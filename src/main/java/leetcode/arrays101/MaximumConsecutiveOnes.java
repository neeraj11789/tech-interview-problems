package leetcode.arrays101;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
 */
public class MaximumConsecutiveOnes {
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
