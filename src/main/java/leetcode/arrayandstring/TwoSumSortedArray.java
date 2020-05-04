package leetcode.arrayandstring;

/**
 *
 * @NOTE: Classic 2 pointer solution
 *
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1153/
 */
public class TwoSumSortedArray {

	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];

		if(numbers == null || numbers.length < 2) return new int[0];

		int p1 = 0;
		int p2 = numbers.length - 1;

		while (p1<p2){
			if(numbers[p1] + numbers[p2] == target){
				res[0] = p1+1;
				res[1] = p2+1;
				return res;
			}
			else if(numbers[p1] + numbers[p2] > target)
				p2--;
			else
				p1++;
		}

		return res;
	}
}
