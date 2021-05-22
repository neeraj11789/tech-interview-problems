package v1.leetcode.arrays101;


import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @NOTE: Use Priority Q of Size 3
 *
 * Usage of PQ and Hashset to solve problems
 *
 * https://leetcode.com/explore/featured/card/fun-with-arrays/523/conclusion/3231/
 */
public class ThirdMaximumNumber {
	public int thirdMax(int[] nums) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		Set<Integer> set = new HashSet<>();

		for (int i: nums){

			if(!set.contains(i)){
				pq.offer(i);
				set.add(i);

				// No more than 3 elements
				if (pq.size() > 3) pq.poll();
			}

		}

		if(pq.size() == 2) pq.poll();

		return pq.peek();

	}
}
