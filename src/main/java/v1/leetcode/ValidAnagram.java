package v1.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}