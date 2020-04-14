package leetcode;

/**
 * https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 */
public class MinStepsAnagramComparision {
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
