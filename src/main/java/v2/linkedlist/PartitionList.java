package v2.linkedlist;

import v1.datastructures.ListNode;

public class PartitionList {

    private ListNode leftHead = new ListNode(0); // dummy
    private ListNode leftCurrent = leftHead;


    private ListNode rightHead = new ListNode(0); // dummy
    private ListNode rightCurrent = rightHead;

    public ListNode partition(ListNode head, int x) {
        ListNode current = head;

        while (current != null){
            if(current.val >= x)
                addToRightNode(current);
            else
                addToLeftNode(current);
            current = current.next;
        }

        return merge();
    }

    private ListNode merge() {
        leftCurrent.next = rightHead.next;
        rightCurrent.next = null;
        return leftHead.next;
    }

    private void addToLeftNode(ListNode current) {
        leftCurrent.next = current;
        leftCurrent = leftCurrent.next;
    }

    private void addToRightNode(ListNode current) {
        rightCurrent.next = current;
        rightCurrent = rightCurrent.next;
    }

    public void print(ListNode current){
        while (current != null){
            System.out.println(current.val + " ");
            // move ahead
            current = current.next;
        }
    }
}
