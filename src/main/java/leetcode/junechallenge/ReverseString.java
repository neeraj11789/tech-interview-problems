package leetcode.junechallenge;

/**
 * Reverse String
 * https://www.youtube.com/watch?v=LMeYeTXrGak&t=27s
 *
 * https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/539/week-1-june-1st-june-7th/3350/
 */
public class ReverseString {
	public void reverseString(char[] s) {
		if (s.length <= 1) return;

		int leftPtr = 0;
		int rightPtr = s.length - 1;

		char tmp;
		while (rightPtr > leftPtr){
			tmp = s[leftPtr];
			s[leftPtr] = s[rightPtr];
			s[rightPtr] = tmp;

			leftPtr++;
			rightPtr--;
		}
	}
}
