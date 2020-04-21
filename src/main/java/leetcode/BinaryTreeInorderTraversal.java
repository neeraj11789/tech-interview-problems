package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/submissions/
 */
class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();
		TreeNode current = root;

		while(current!=null || !stack.empty()){
			while(current!=null){
				stack.push(current);
				current = current.left;
			}

			// process
			current = stack.pop();
			res.add(current.val);

			current = current.right;
		}

		return res;
	}

	/**
	 * Definition for a binary tree node.
	 */
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}