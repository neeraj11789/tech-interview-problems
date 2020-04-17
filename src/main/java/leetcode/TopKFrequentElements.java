package leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 */
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();

        // Put the frequency of each element in the hashmap
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1 );
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(k, (o1,o2)-> o1.getValue() - o2.getValue());

        // Maintain the Size of the Heap fixed for K elements
        Iterator<Map.Entry<Integer,Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            pq.offer(iterator.next());
            if (pq.size() > k)
                pq.poll();
        }

        // fetch all the remanining elements from the Heap
        while (pq.size()>0)
            res.add(pq.poll().getKey());

        return res;
    }
}
