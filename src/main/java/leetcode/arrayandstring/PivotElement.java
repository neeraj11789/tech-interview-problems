package leetcode.arrayandstring;

public class PivotElement {
	public int pivotIndex(int[] nums) {
		int pivot = -1;
		int N = nums.length;

		int sums[] = new int[N];

		if (nums == null || N<1) return -1;

		int sum = 0;
		for (int i=0; i<N; i++){
			sum+=nums[i];
			sums[i]=sum;
			System.out.println("Element: " + sums[i]);
		}
		System.out.println("Sum: " + sum);

		// Find the Pivot
		for (int i=0; i<N; i++){
			int leftSum = sums[i] - nums[i];
			int rightSum = sum - sums[i];

			if(leftSum == rightSum) return i;
		}

		return pivot;
	}

}
