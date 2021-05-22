package v1.leetcode.strings;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] arr = new int[26];

		// Create Dictionary with count
		for (int i = 0; i < magazine.length(); i++) {
			arr[magazine.charAt(i) - 'a']++;
		}

		// Valide the note - reduce the count from dictionary
		for (int i = 0; i < ransomNote.length(); i++) {
			if(--arr[ransomNote.charAt(i)-'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
