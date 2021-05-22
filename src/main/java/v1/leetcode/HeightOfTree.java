package v1.leetcode;

public class HeightOfTree {


	/**
	 *
	 * @param root
	 * @return
	 */
	private int height(Node root){

		if(root == null)
			return 0;

		return 1 + Math.max(height(root.left) , height(root.right));
	}


	class Node{
		int val;
		Node left;
		Node right;
	}
}
