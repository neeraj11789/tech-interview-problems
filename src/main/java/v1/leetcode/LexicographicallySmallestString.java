package v1.leetcode;

/**
 * https://leetcode.com/discuss/interview-question/366869/
 * OR
 * https://www.geeksforgeeks.org/lexicographically-smallest-string-formed-by-removing-at-most-one-character/
 */
public class LexicographicallySmallestString {

    public String getSmallString(String s) {
        StringBuilder sb = new StringBuilder();

        // By Default Last Character to be removed
        int foundIndex = s.length()-1;

        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i+1) < s.charAt(i)){
                foundIndex = i;
                break;
            }
        }

        // Create String
        for (int i = 0; i < s.length(); i++) {
            if(i!=foundIndex)
                sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
