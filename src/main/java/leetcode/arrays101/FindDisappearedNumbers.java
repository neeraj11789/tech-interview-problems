package leetcode.arrays101;

import java.util.ArrayList;
import java.util.List;

/**
 * @LEARNING - READ QUESTION for minor details which can be used.
 *
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3270/
 */
public class FindDisappearedNumbers {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ret = new ArrayList<Integer>();

		for(int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if(nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > 0) {
				ret.add(i+1);
			}
		}
		return ret;
	}
}
