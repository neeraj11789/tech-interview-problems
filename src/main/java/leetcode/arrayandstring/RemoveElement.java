package leetcode.arrayandstring;

/**
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1151/
 */
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		if(nums == null || nums.length == 0) return 0;

		int p1 = 0;
		int p2 = 0;

		while (p1 < nums.length){
			int current = nums[p1];
			if(current != val){
				if(p1 > p2){
					nums[p2] = current;
				}
				p2++;
			}
			p1++;
		}
		return p2;
	}
}
