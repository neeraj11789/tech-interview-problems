package v1.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreePreOrderTraversal {
	/**
	 * Pre Order Traversal - Non Recursive
	 * @param root
	 * @return
	 */
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		TreeNode current = root;

		while(current!=null || !stack.empty()){
			while(current!=null){
				// process
				list.add(current.val);

				stack.push(current);
				current = current.left;
			}

			// process
			current = stack.pop();
			current = current.right;
		}

		return list;
	}

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}