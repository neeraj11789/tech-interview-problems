package leetcode;

import datastructures.TreeNode;

import java.util.Stack;

public class KthSmallestInBST {

	public int kthSmallest(TreeNode root, int k) {
		if (root == null)
			return -1;

		int kth = root.val;

		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		int counter = 0;


		while (!stack.isEmpty() || current!=null){
			while (current!=null){
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			counter++;

			if(counter == k)
				return current.val;

			current = current.right;
		}

		return kth;
	}
}
