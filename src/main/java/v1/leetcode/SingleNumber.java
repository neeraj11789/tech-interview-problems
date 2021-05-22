package v1.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3283/
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            if(map.containsKey(i))
                map.remove(i);
            else
                map.put(i,1);
        }

        // Iterating over the map
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            System.out.println(m);
            res = m.getKey();
        }

        return res;
    }
}
