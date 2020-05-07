package leetcode.interesting;

/**
 *
 * @LEARNING: Iterate 2 times to get the maxima of the both sides
 * then calculate the trapping water
 *
 * Explanation here - https://www.programcreek.com/2014/06/leetcode-trapping-rain-water-java/
 *
 * #redo #revise #tryotherapproach
 *
 * https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

	public int trap(int[] height) {
		int result = 0;
		int N = height.length;

		// edge case
		if (height == null || height.length<2) return result;

		int left_max[] = new int[N];
		int right_max[] = new int[N];

		// init first Bar
		left_max[0] = height[0];
		// Iterate from Left to Right to the max Left Height for each cell
		for (int i = 1; i < N; i++) {
			left_max[i] = Math.max(height[i], left_max[i - 1]);
		}

		// init last bar
		right_max[N-1] = height[N-1];
		// Iterate from Left to Right to the max Left Height for each cell
		for (int i = N-2; i >= 0; i--) {
			right_max[i] = Math.max(height[i], right_max[i + 1]);
		}

		//calculate total
		for(int i=1; i<N-1; i++){
			result+= Math.min(left_max[i],right_max[i]) - height[i];
		}

		return result;
	}
}
