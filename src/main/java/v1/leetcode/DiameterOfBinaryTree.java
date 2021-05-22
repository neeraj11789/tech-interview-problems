package v1.leetcode;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 */
public class DiameterOfBinaryTree {
    private int diameter;

    /**
     * Uses the following logic -
     * https://www.geeksforgeeks.org/diameter-of-a-binary-tree-in-on-a-new-method/
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        diameter = Integer.MIN_VALUE;
        height(root);
        return diameter-1;
    }

    /**
     * Height of A Binary Tree
     * @param node
     * @return
     */
    private int height(TreeNode node){
        if(node == null)
            return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        diameter = Math.max(diameter, 1 + leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
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
