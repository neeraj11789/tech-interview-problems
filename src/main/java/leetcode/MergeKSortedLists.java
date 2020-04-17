package leetcode;

import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class MergeKSoretedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        // initial check
        if (lists == null || lists.length == 0) {
            return null;
        }
        // add first node of each list to the minHeap
        PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((n1, n2) -> n1.val - n2.val);
        for (ListNode node : lists) {
            if (node != null) {
                minHeap.add(node);
            }
        }
        // if no node was added to the minHeap we return null
        if (minHeap.isEmpty()) {
            return null;
        }

        // save head since we need to return it
        ListNode head = minHeap.peek();

        while(!minHeap.isEmpty()) {
            // extract node from minHeap
            ListNode node = minHeap.poll();
            if (node.next != null) {
                // add next node to minHeap
                minHeap.add(node.next);
            }
            // set node.next
            if (minHeap.peek() != null) {
                node.next = minHeap.peek();
            }
        }
        return head;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}