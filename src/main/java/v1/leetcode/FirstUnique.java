package v1.leetcode;

import java.util.*;

public class FirstUnique {

	private Map<Integer, Integer> map;
	Queue<Integer> queue = new LinkedList<>();

	public FirstUnique(int[] nums) {
		map = new HashMap<>();

		for (int i=0; i<nums.length; i++){
			add(nums[i]);
		}
	}

	public int showFirstUnique() {
		int size = queue.size();
		for (int i=0; i <size; i++){
			// check the count of the element
			int current = queue.peek();
			System.out.println(current);
			// remove from Q if greater than 1
			if(map.get(current) > 1) queue.poll();
			// return if found
			else if(map.get(current) == 1) return current;
		}
		return -1;
	}

	public void add(int value) {
		if(map.containsKey(value))
			map.put(value, map.get(value) + 1);
		else {
			queue.offer(value);
			map.put(value, 1);
		}
	}
}
