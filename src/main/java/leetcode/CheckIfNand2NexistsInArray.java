package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @LEARNING: Using HashSet
 *
 * @NOTE
 * Approach was absolutely correct. But since in my commented method
 * I was pushing both 2i and i/2. I could produce false positive results.
 *
 * Better way was pushing the original method and checking for 2i or i/2
 *
 * https://leetcode.com/problems/check-if-n-and-its-double-exist/
 */
public class CheckIfNand2NexistsInArray {

	public boolean checkIfExist(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		for (int i : arr) {
			if (seen.contains(2 * i) || i % 2 == 0 && seen.contains(i / 2))
				return true;
			seen.add(i);
		}
		return false;
	}

//	public boolean checkIfExist(int[] arr) {
//		Set<Integer> set = new HashSet<>();
//
//		for (int i: arr){
//			// Add double and half element in the set
//			set.add(2*i);
//			if(i % 2 == 0) set.add(i/2);
//
//			if (set.contains(i)) return true;
//		}
//
//		return false;
//	}
}
