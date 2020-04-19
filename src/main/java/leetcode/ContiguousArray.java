package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * #hard #revise #goodsolution
 *
 * @NOTE: Read the solution-2 to understand the baics on how it is working
 * https://leetcode.com/problems/contiguous-array/submissions/
 */
public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int max=0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        // Handle the case where it starts with 0
        map.put(0,-1);

        for(int i=0; i< nums.length; i++){
            sum += (nums[i]==0)?-1:1;
             System.out.println(sum);

            if(map.containsKey(sum)){
                max = Math.max(max, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
             System.out.println("Max: " + max);
        }
        return max;
    }

}
