package leetcode;

import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        int res = stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->o2-o1);
        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }

        while (pq.size() >= 2){
            int s1 = pq.poll();
            int s2 = pq.poll();

            int smashed = smash(s1,s2);
            pq.offer(smashed);
        }

        if (pq.size()==0)
            res =  0;
        else
            res = pq.poll();

        return res;
    }

    private int smash(int s1, int s2) {
        if (s1==s2)
            return 0;
        else{
            if(s1 < s2)
                return s2-s1;
            else
                return s1-s2;
        }
    }
}
