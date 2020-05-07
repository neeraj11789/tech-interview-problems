package leetcode.binaryTree;

import datastructures.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * #redo #revise
 *
 * https://leetcode.com/problems/cousins-in-binary-tree/
 */
public class CousinInBinaryTree {
	public boolean isCousins(TreeNode root, int x, int y) {
		Queue<TreeNode> currQ = new LinkedList<>();
		Queue<TreeNode> nextQ = new LinkedList<>();

		TreeMap map = new TreeMap();

		if(root == null)
			return false;

		TreeNode curr = root;
		currQ.offer(root);

		boolean xFound = false;
		boolean yFound = false;

		while(!currQ.isEmpty()){
			curr = currQ.poll();

			// process
			if(curr.right!=null && curr.left!=null){
				if(curr.left.val == x && curr.right.val == y)
					return false;
				if(curr.left.val == y && curr.right.val == x)
					return false;
			}

			if(curr.left != null){
				nextQ.offer(curr.left);
				if(curr.left.val == x)
					xFound = true;
				if(curr.left.val == y)
					yFound = true;
			}
			if(curr.right != null){
				nextQ.offer(curr.right);
				if(curr.right.val == x)
					xFound = true;
				if(curr.right.val == y)
					yFound = true;
			}

			// Check if we found both
			if(xFound && yFound)
				return true;

			// update pointers
			if(currQ.isEmpty()){
				currQ = nextQ;
				nextQ = new LinkedList<>();
				xFound = false;
				yFound = false;
			}
		}

		return false;
	}
}
