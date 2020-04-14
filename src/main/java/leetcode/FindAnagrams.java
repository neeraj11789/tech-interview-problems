package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
 */
public class FindAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        char[] p_arr = p.toCharArray();
        int lenP = p_arr.length;
        Arrays.sort(p_arr);

        char[] s_arr;
        for(int i=0; i<=s.length()-lenP; i++){
            // check null pointer
            s_arr = s.substring(i,i+lenP).toCharArray();
            Arrays.sort(s_arr);
            if(Arrays.equals(s_arr, p_arr))
                res.add(i);
        }

        return res;
    }
}
