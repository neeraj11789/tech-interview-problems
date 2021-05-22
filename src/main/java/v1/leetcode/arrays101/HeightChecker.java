package v1.leetcode.arrays101;

/**
 * @NOTE: Redo to understand better
 *
 * @LEARNING : Read More about Counting Sort
 *
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3228/
 *
 */
public class HeightChecker {
	public int heightChecker(int[] heights) {
		int[] heightToFreq = new int[101];

		for (int height : heights) {
			heightToFreq[height]++;
		}

		int result = 0;
		int curHeight = 0;

		for (int i = 0; i < heights.length; i++) {
			while (heightToFreq[curHeight] == 0) {
				curHeight++;
			}

			if (curHeight != heights[i]) {
				result++;
			}
			heightToFreq[curHeight]--;
		}

		return result;
	}
}
