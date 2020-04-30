package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Problem - https://leetcode.com/problems/subarray-sum-equals-k
 *
 * Explanation Here - https://www.youtube.com/watch?v=HbbYPQc-Oo4&t=181s
 *
 * @NOTE: Kind Of Technique to learn. Check video for full Observation
 *
 * Check why 2 pointers will not work here -
 *
 * https://leetcode.com/problems/subarray-sum-equals-k/discuss/301242/General-summary-of-what-kind-of-problem-can-cannot-solved-by-Two-Pointers
 *
 *
 */
public class SubArraySumEqualsK {
	public int subarraySum(int[] nums, int k) {
		int count = 0;

		if (nums == null || nums.length == 0)
			return 0;

		Map<Integer, Integer> map = new HashMap<>();

		int currentSum = 0;

		for (int i=0; i<nums.length; i++){

			currentSum+= nums[i];

			if (currentSum==k) count++;

			if(map.containsKey(currentSum - k)){
				count += map.get(currentSum-k);
			}

			map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
		}

		return count;
	}
}
