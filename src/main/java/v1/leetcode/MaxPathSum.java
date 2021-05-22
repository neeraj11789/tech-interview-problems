package v1.leetcode;

import v1.datastructures.TreeNode;

/**
 * https://leetcode.com/problems/binary-tree-maximum-path-sum
 *
 * Explanation here - https://www.youtube.com/watch?v=TO5zsKtc1Ic
 *
 */
public class MaxPathSum {

	private int result = Integer.MIN_VALUE;

	public int maxPathSum(TreeNode root) {
		dfsUtil(root);
		return result;
	}

	/**
	 * @NOTE:
	 *
	 * At Every Point we have 4 choices -
	 * 1. Consider only Root
	 * 2. Consider Root + Left Child
	 * 3. Consider Root + Right Child
	 * 4. Consider Root + Left + Right
	 *
	 * Also, we need to keep track if the max as there might be
	 * a possibility that in all these 4 cases, we are actually reducing the
	 * overall sum - in that case ignore all the 4 cases
	 *
	 * @param node
	 */
	private int dfsUtil(TreeNode node) {

		if (node == null) return 0;

		int leftVal = dfsUtil(node.left);
		int rightVal = dfsUtil(node.right);
		int current = node.val;


		int max1 = Math.max(current + Math.max(leftVal, rightVal), current);
		int max2 = Math.max(max1, leftVal + rightVal + current);

		// update result
		result = Math.max(result, max2);

		return max1;
	}
}
