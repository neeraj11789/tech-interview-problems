package v1.leetcode;

// Definition for a Node.

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/submissions/
 */
class NAryTreePreOrderTraversal {
	/**
	 *
	 * @param root
	 * @return
	 */
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		Node current = root;

		if(root == null)
			return list;

		stack.push(current);

		while(!stack.empty()){
			current = stack.pop();

			list.add(current.val);
			if(current.children.size() > 0){
				for(int i = current.children.size() - 1; i>=0; i-- )
					stack.push(current.children.get(i));
			}

		}

		return list;
	}

	/**
	 * Definition of a node of N-ary Tree
	 */
	class Node {
		public int val;
		public List<Node> children;

		public Node() {}

		public Node(int _val) {
			val = _val;
		}

		public Node(int _val, List<Node> _children) {
			val = _val;
			children = _children;
		}
	};

}