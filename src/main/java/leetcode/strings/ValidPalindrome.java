package leetcode.strings;

/**
 *
 * #revise
 *
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		int len = s.length();

		if(len <=1)
			return true;

		int p1 = 0;
		int p2 = len-1;

		while (p1<p2){
			if(!Character.isLetterOrDigit(s.charAt(p1))){
				p1++;
			}else if(!Character.isLetterOrDigit(s.charAt(p2))){
				p2--;
			}else{
				if(Character.toLowerCase(s.charAt(p1)) != Character.toLowerCase(s.charAt(p2))){
					return false;
				}
				p1++;
				p2--;
			}
		}
		return true;
	}
}
