package leetcode.arrayandstring;

/**
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1147/
 */
public class LargestNumberTwiceOfOthers {

	public int dominantIndex(int[] nums) {
		int N = nums.length;
		int maxElement = Integer.MIN_VALUE;
		int maxIndex = 0;

		for (int i=0; i<N; i++) {
			if(nums[i] > maxElement){
				maxElement = nums[i];
				maxIndex = i;
			}
		}

		System.out.println("MaxElement: " + maxElement);
		System.out.println("MaxIndex: " + maxIndex);

		for (int i=0; i<N; i++) {
			if(i == maxIndex) continue;
			if(2*nums[i]>maxElement) return -1;
		}

		return maxIndex;

	}

}
