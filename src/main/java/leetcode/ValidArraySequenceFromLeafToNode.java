package leetcode;

import datastructures.TreeNode;

public class ValidArraySequenceFromLeafToNode {

	/**
	 *
	 * @param root
	 * @param arr
	 * @return
	 */
	public boolean isValidSequence(TreeNode root, int[] arr) {

		return checkPath(root, arr, 0);
	}

	/**
	 * @NOTE: Iterate and check the following -
	 *
	 * 1. FAIL - if we reach array boundary or NO more elements in the treee
	 * 2. PASS - Only if left and right are null, values are same & we have reached end of array
	 * 3. RECURSIVE STEP: For Each node check its own value and call recursively for LEFT & RIGHT
	 *
	 * @NOTE: We are keeping the value of level by passing it in every recursive call and incrementing it.
	 *
	 * @param root
	 * @param arr
	 * @param index
	 * @return
	 */
	private boolean checkPath(TreeNode root, int arr[], int index)
	{
		if(root == null || index == arr.length) return false;

		if(root.left == null && root.right == null && root.val == arr[index] && index == arr.length-1) return true;

		return root.val == arr[index] && (checkPath(root.left, arr, index+1) || checkPath(root.right, arr, index+1));

	}
}
