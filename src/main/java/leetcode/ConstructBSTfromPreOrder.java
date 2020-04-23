package leetcode;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class ConstructBSTfromPreOrder {
	public void addToTree(TreeNode n, int val) {
		if (val < n.val) {
			if (n.left == null) {
				n.left = new TreeNode(val);
			} else {
				addToTree(n.left, val);
			}
		} else {
			if (n.right == null) {
				n.right = new TreeNode(val);
			} else {
				addToTree(n.right, val);
			}
		}
	}

	public TreeNode bstFromPreorder(int[] preorder) {
		if (preorder == null || preorder.length == 0) { return null; }

		TreeNode root = new TreeNode(preorder[0]);
		for (int i = 1; i < preorder.length; i++) {
			addToTree(root, preorder[i]);
		}

		return root;
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
