package v1.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
class KthLargest {

    PriorityQueue<Integer> pq;
    int SIZE;

    public KthLargest(int k, int[] nums) {
        SIZE = k;
        pq = new PriorityQueue<>(k, (Comparator.comparingInt(o -> o)));
        for(int n: nums){
            pq.add(n);
            if (pq.size() > SIZE)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > SIZE)
            pq.poll();
        return pq.peek();
    }
}