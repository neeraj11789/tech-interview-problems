package v2.linkedlist;

import v1.datastructures.ListNode;

public class OddEvenLinkedList {

    ListNode oddHead = new ListNode(0); // odd list
    ListNode currentOdd = oddHead;

    ListNode evenHead = new ListNode(0); // evenList
    ListNode currentEven = evenHead;

    public ListNode oddEvenList(ListNode head) {
        ListNode current = head;

        int counter = 1;
        while (current != null){
            if (isOdd(counter))
                addToOddList(current);
            else
                addToEvenList(current);

            current = current.next;
            counter++;
        }

        return merge();
    }

    private ListNode merge() {
        currentOdd.next = evenHead.next;
        currentEven.next = null;
        return oddHead.next;
    }

    private void addToEvenList(ListNode current) {
        currentEven.next = current;
        currentEven = currentEven.next;
    }

    private void addToOddList(ListNode current) {
        currentOdd.next = current;
        currentOdd = currentOdd.next;
    }

    private boolean isOdd(int counter) {
        return counter % 2 != 0;
    }

    public void print(ListNode current){
        while (current != null){
            System.out.println(current.val + " ");
            // move ahead
            current = current.next;
        }
    }
}
