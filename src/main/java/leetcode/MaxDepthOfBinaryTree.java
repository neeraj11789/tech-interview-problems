package leetcode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/
 */
public class MaxDepthOfBinaryTree {

    /**
     * Max Depth of Binary Tree
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return (1 + Math.max(left, right));
    }

    /**
     * TreeNode Definition
     */
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }
}
