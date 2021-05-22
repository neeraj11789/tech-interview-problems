package v1.leetcode.arrayandstring;

/**
 *
 * @NOTE: The interviewer here is only interested to know how
 * good do you handle the edge cases
 *
 * https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1148/
 */
public class PlusOne {

	public int[] plusOne(int[] digits) {
		int N = digits.length;

		boolean overflow = false;

		int carry = 1;
		for (int i=N-1; i>=0; i--){
			if(digits[i] == 9){
				if(i==0) overflow=true;
				digits[i] = 0;
			}else {
				digits[i] = digits[i] + carry;
				break;
			}
		}

		if(overflow == true){
			digits = new int[N+1];
			digits[0]=1;
		}

		return digits;
	}
}
