package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3299/
 */
public class PerformStringShifts {

    public String stringShift(String s, int[][] shift) {
        String res = s;
        Map<Integer, Integer> map = new HashMap<>();

        // calculate final shift
        for(int i=0; i<shift.length; i++){
            int direction = shift[i][0];
            int count = shift[i][1];
            map.put(direction, map.getOrDefault(direction, 0 ) + count);
        }

        System.out.println("Left: " + map.get(0));
        System.out.println("Right: " + map.get(1));

        int resultantDir = 0; int resultantSteps = 0;

        if(map.get(0) > map.get(1)){
            resultantDir = 0;
            resultantSteps = (map.get(0) - map.get(1)) % s.length();
        }else{
            resultantDir = 1;
            resultantSteps = (map.get(1) - map.get(0)) % s.length();
        }

        System.out.println("Dir: " + resultantDir);
        System.out.println("Steps: " + resultantSteps);

        if(resultantDir == 0)
            return s.substring(resultantSteps) + s.substring(0, resultantSteps);
        else
            return s.substring(s.length() - resultantSteps) + s.substring(0, s.length() - resultantSteps);
    }

}
