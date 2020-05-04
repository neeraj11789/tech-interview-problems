package leetcode.arrayandstring;

/**
 * @NOTE: Simple Two Pointer Question
 *
 * @LEARNING: Using 2 pointers to efficiently solve this.
 *
 * https://leetcode.com/explore/learn/card/array-and-string/205/array-two-pointer-technique/1183/
 */
public class ReverseString {
	public void reverseString(char[] s) {
		if(s.length < 2)
			return;

		int ptr1 = 0;
		int ptr2 = s.length-1;
		char tmp;

		while(ptr1 < ptr2){
			// swap
			tmp = s[ptr1];
			s[ptr1] = s[ptr2];
			s[ptr2] = tmp;

			ptr1++;
			ptr2--;
		}

		return;
	}
}
