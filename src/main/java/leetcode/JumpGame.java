package leetcode;

/**
 *
 * Explanation Here - https://www.youtube.com/watch?v=muDPTDrpS28&t=27s
 *
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/
 */
public class JumpGame {
	public boolean canJump(int[] nums) {
		int reachable = 0;

		if(nums == null || nums.length == 0)
			return false;

		if(nums.length > 1 && nums[0] == 0) return false;

		for (int i=0; i<nums.length; i++){
			if (reachable < i) return false;
			reachable = Math.max(reachable, i+nums[i]);
		}

		return true;
	}
}
