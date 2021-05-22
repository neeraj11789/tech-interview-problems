package v1.leetcode.arrayandstring;

/**
 * @LEARNING: Classic Two Pointer Question #twopointer
 *
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/
 */
public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];

		int p1 = 0;
		int p2 = numbers.length-1;


		while (p2 > p1){
			int sum = numbers[p1] + numbers[p2];
			if(sum == target){
				res[0] = ++p1;
				res[1] = ++p2;
				return res;
			}else if(sum < target){
				p1++;
			}else {
				p2--;
			}
		}

		return res;
	}
}
