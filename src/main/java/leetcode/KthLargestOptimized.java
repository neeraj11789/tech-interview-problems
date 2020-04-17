package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-a-stream/
 */
class KthLargestOptimized {

    PriorityQueue<Integer> pq;
    int SIZE;

    public KthLargestOptimized(int k, int[] nums) {
        SIZE = k;
        pq = new PriorityQueue<>(k, (Comparator.comparingInt(o -> o)));
        for(int n: nums){
            addUtil(n);
        }
    }

    public int add(int val) {
        addUtil(val);
        return pq.peek();
    }

    /**
     * Optimized the insertion - we insert only if the incoming element is greater than the top element
     * @param val
     */
    private void addUtil(int val){
        if(pq.size()<SIZE || val > pq.peek()){
            pq.add(val);
            if (pq.size() > SIZE)
                pq.poll();
        }
    }
}
