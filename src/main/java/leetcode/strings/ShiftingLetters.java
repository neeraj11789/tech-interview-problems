package leetcode.strings;

/**
 * #revise
 *
 * https://leetcode.com/problems/shifting-letters/
 */
public class ShiftingLetters {
	public String shiftingLetters(String S, int[] shifts) {
		char[] arr = S.toCharArray();
		int shift = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			shift = (shift + shifts[i]) % 26;
			arr[i] = (char)((arr[i] - 'a' + shift) % 26 + 'a');
		}
		return new String(arr);
	}
}
