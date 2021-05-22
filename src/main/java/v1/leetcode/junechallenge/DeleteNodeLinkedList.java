package v1.leetcode.junechallenge;

import v1.datastructures.ListNode;

/**
 * https://leetcode.com/submissions/detail/303550118/
 */
public class DeleteNodeLinkedList {
    public void deleteNode(ListNode node) {
        ListNode tmp = node.next;
        node.val = tmp.val;
        node.next = tmp.next;
    }
}