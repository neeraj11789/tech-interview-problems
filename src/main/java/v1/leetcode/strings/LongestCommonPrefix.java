package v1.leetcode.strings;

/**
 *
 * #revise
 *
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {

		StringBuilder sb = new StringBuilder();

		// Edge Cases
		if (strs.length == 0) return "";
		if (strs.length == 1) return strs[0];

		// Find the min length substring
		int minLength = Integer.MAX_VALUE;
		int minLenghtIndex = 0;
		for (int i=0; i<strs.length; i++){
			if (strs[i].length() < minLength){
				minLenghtIndex = i;
				minLength = strs[i].length();
			}
		}

		System.out.println("MinLength: " + minLength);

		for (int i=0; i<minLength; i++){
			char ch = strs[minLenghtIndex].charAt(i);

			// Compare this character with all the strings in the bucket
			boolean chFoundInAll = true;
			for (int j=0; j<strs.length; j++){
				if(ch != strs[j].charAt(i)) {
					chFoundInAll = false;
					break;
				}
			}

			if (chFoundInAll){
				sb.append(ch);
			}else {
				// Break this loop as well if character differs in any string
				break;
			}
		}

		return sb.toString();
	}
}
