package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

class ReverseLinkedListTest {

    private ReverseLinkedList reverseLinkedList;

    private ListNode head;

    @BeforeEach
    void setUp() {
        reverseLinkedList = new ReverseLinkedList();
        init();
    }

    private void init() {

        final ListNode a1 = new ListNode(1);
        final ListNode a2 = new ListNode(3);
        final ListNode a3 = new ListNode(6);
        final ListNode a4 = new ListNode(9);
        final ListNode a5 = new ListNode(12);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        head = a1;
    }

    @Test
    void test1() {
//        reverseLinkedList.print(head);
        ListNode reverseList = reverseLinkedList.reverseList(head);
        reverseLinkedList.print(reverseList);
    }
}