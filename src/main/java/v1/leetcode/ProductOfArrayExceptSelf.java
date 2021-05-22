package v1.leetcode;

/**
 * Strategy Of Solution is important
 * https://leetcode.com/problems/product-of-array-except-self/submissions/
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] res = new int[len];
		int[] L = new int[len];
		int[] R = new int[len];

		L[0] = R[len-1] = 1;

		// Populate Left SubArray Product
		int product = 1;
		for(int i=1; i<len; i++){
			product = product * nums[i-1];
			L[i] = product;
			System.out.println("L" + i + ": " + L[i]);
		}

		// Populate Right SubArray Product
		product = 1;
		for(int i=len-2; i>=0; i--){
			product = product * nums[i+1];
			R[i] = product;
			System.out.println("R" + i + ": " + R[i]);
		}

		// Calculate Full Product
		for(int i=0; i<len; i++){
			res[i] = L[i] * R[i];
		}

		return res;
	}
}
