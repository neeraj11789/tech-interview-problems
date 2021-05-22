package v1.leetcode.junechallenge;

import v1.datastructures.TreeNode;

/**
 * https://www.youtube.com/watch?v=_i0jqdVkObU
 *
 * @NOTE: Imagining this with recursion would automatically solve it.
 *  #recursion #binarytree #swap
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        swap(root);
        return root;
    }


    private void swap(TreeNode node){
        if(node == null) return;

        swap(node.left);
        swap(node.right);

        // Swap the pointers
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }
}
