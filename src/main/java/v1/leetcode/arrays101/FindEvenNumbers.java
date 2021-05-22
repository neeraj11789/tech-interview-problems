package v1.leetcode.arrays101;

/**
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */
public class FindEvenNumbers {
	public int findNumbers(int[] nums) {
		int result = 0;
		for(int i=0; i<nums.length; i++){
			if(digits(nums[i]) % 2 == 0) result++;
		}
		return result;
	}

	private int digits(int n){
		int count = 0;
		while (n > 0){
			n = n/10;
			count++;
		}
		return count;
	}
}
