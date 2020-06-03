package leetcode.junechallenge;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3349/
 *
 * EXPLANATION
 * https://www.youtube.com/watch?v=vtNoP43hGJA
 */
public class TwoCityScheduling {
	/**
	 * @param costs
	 * @return
	 */
	public int twoCitySchedCost(int[][] costs) {
		int result = 0;
		// Create a max heap of the difference of the costs
		if(costs == null) return 0;

		Comparator<int[]> comparator = (int[] a, int[] b) -> Integer.compare(a[1]-a[0], b[1]-b[0]);

		int N = costs.length;
		Collections.sort(Arrays.asList(costs), comparator);

		int counter = 0;
		for (int[] cost : costs) {
			if(counter++ >= N/2)
				result+= cost[0];
			else
				result+= cost[1];
		}

		return result;
	}
}
