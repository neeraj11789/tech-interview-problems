package v1.leetcode.arrays101;

public class ReplaceElementWithLargestOnRightSide {

	public int[] replaceElements(int[] arr) {
		int N = arr.length;

		if (arr == null || arr.length<1) return arr;

		int MAX = arr[N-1];
		int current;

		for (int i = N-2; i>=0; i--){
			current = arr[i];
			arr[i] = MAX;
			MAX = Math.max(current, MAX);
		}

		// Replace the last element
		arr[N-1] = -1;

		return arr;
	}
}
