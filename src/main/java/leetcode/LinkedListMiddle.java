package leetcode;


/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class LinkedListMiddle {
    public ListNode middleNode(ListNode head) {
        // edge case - handle 1,2,3 cases
        ListNode slow = head;
        if(head.next == null)
            return head;
        if(head.next.next == null)
            return head.next;

        ListNode fast = slow.next;

        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }

    /**
     * Definition of ListNode
     */
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



