package leetcode;

import java.util.Stack;

/**
 * @NOTE: Classic InOrder Traversal Problem
 * Just use the idea that while inorder traversal
 * the previous element has to be less than the current
 * element
 *
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class isValidBST {
	public boolean isValidBST(TreeNode root) {
		TreeNode current = root;
		TreeNode prev = null;
		Stack<TreeNode> stack = new Stack<>();

		while (!stack.isEmpty() || current!=null){
			while (current!=null){
				stack.push(current);
				current = current.left;
			}

            // process
			current = stack.pop();
            System.out.println(current.val);
			if(prev!=null){
				if (prev.val >= current.val)
					return false;
			}
			prev = current;

			current = current.right;
		}


		return true;
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}
}
