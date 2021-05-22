package v1.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountingElements {
    public int countElements(int[] arr) {
        int res = 0;

        Map<Integer,Integer> map = new HashMap<>();
        for(int i: arr){
            if(map.containsKey(i)){
                int curr = map.get(i) + 1;
                map.put(i, curr);
            }else{
                map.put(i, 1);
            }
        }


        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(map.containsKey(m.getKey() + 1))
                res += m.getValue();
        }


        return res;
    }
}
