package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Average of the Nodes at a level
 */
class AverageOfLevelOrderTraversal {
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		List<Integer> subList = new ArrayList<>();

		Queue<TreeNode> currentQ = new LinkedList<>();
		Queue<TreeNode> nextQ = new LinkedList<>();

		TreeNode current = root;
		currentQ.offer(current);

		while(currentQ.size() > 0){
			current = currentQ.poll();
			// System.out.println(current.val);
			subList.add(current.val);

			if(current.left!=null)
				nextQ.offer(current.left);

			if(current.right!=null)
				nextQ.offer(current.right);

			// System.out.println("Size: " + currentQ.size());

			if(currentQ.size() == 0){
				result.add(avg(subList));
				currentQ = nextQ;
				nextQ = new LinkedList<>();
				subList = new ArrayList<>();
			}
		}

		return result;
	}

	/**
	 * Util for Average of a list
	 * @param col
	 * @return
	 */
	private double avg(List<Integer> col){
		if(col.size() == 0)
			return 0D;
		double avg = 0D;
		for(int i=0; i<col.size(); i++){
			avg += col.get(i);
		}
		avg = avg/col.size();
		return avg;
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