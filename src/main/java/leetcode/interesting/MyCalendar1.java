package leetcode.interesting;

import java.util.TreeMap;

/**
 * @LEARNING: TreeMap in Java provides the implementation of Balanced-BST
 *
 * #redo #revise
 *
 * https://leetcode.com/problems/my-calendar-i/
 */
public class MyCalendar1 {

	TreeMap<Integer, Integer> calendar;

	public MyCalendar1() {
		calendar = new TreeMap<>();
	}

	public boolean book(int start, int end) {
		Integer previous = calendar.floorKey(start);
		Integer next = calendar.ceilingKey(start);

		// Compare the Intervals - DRAW NODES OF TREE AND UNDERSTAND
		if((previous==null || calendar.get(previous)<=start) && (next==null || end<=next)){
			calendar.put(start, end);
			return true;
		}

		return false;
	}
}
