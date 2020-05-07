package leetcode.interesting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * GREEDY PROBLEM
 *
 * @LEARNING: Half of the problem is just sorting it properly
 *
 * @NOTE: Algorithm
 *
 * <p>Sort in the ascending order by the start point. If two intervals share the same start point,
 * put the longer one to be the first.
 *
 * <p>Initiate the number of non-covered intervals: count = 0.
 *
 * <p>Iterate over sorted intervals and compare end points.
 *
 * <p>If the current interval is not covered by the previous one end > prev_end, increase the number
 * of non-covered intervals. Assign the current interval to be previous for the next step.
 *
 * <p>Otherwise, the current interval is covered by the previous one. Do nothing.
 *
 * <p>Return count
 *
 * <p>https://leetcode.com/problems/remove-covered-intervals/solution/
 */
public class RemovedCoveredIntervals {

	public int removeCoveredIntervals(int[][] intervals) {
		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// Sort by StartPoint
				// If StartPoint is same - SORT Larger to Smaller
				return (o1[0] == o2[0]) ? (o2[1] - o1[1]) : (o1[0] - o2[0]);
			}
		});

		List<Integer[]> removalList = new ArrayList<>();
		int result = 0;
		int prev_end = Integer.MIN_VALUE;
		int current_end;

		for (int[] curr : intervals){
			current_end = curr[1];

			// Just compare the previous end the check if it is already covered
			if(prev_end < current_end){
				result++;
				prev_end = current_end;
			}else
                System.out.println("Removing the Interval " + curr[0] + "," + curr[1]);
		}

		return result;

	}

}
