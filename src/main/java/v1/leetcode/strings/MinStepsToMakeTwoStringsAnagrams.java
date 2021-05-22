package v1.leetcode.strings;


/**
 *
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 *
 * @NOTE: #revise #pattern just increment counter in 1 case and decrement in other case
 *
 * @LEARNING: In case of Strings rather than using HashMap, think of using an array of 26 items
 *
 */
public class MinStepsToMakeTwoStringsAnagrams {
	public int minSteps(String s, String t) {
		int res = 0;

		char[] s_arr = s.toCharArray();
		char[] t_arr = t.toCharArray();

		int[] arr = new int[26];
		int char_value;
		for(int i=0; i<s_arr.length; i++){
			char_value = t_arr[i] - 'a';
			arr[char_value]++;
			char_value = s_arr[i] - 'a';
			arr[char_value]--;
		}

		for(int i=0; i<26; i++)
			if(arr[i]>0)
				res += arr[i];

		return res;
	}
}
