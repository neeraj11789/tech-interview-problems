package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class IntersectionOfLinkedListTest {

    private IntersectionOfLinkedList intersectionOfLinkedList;
    private ListNode head1;
    private ListNode head2;

    @BeforeEach
    void setUp() {
        init();
        intersectionOfLinkedList = new IntersectionOfLinkedList();
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

        final ListNode b1 = new ListNode(5);
        b1.next = a4;

        head1 = a1;
        head2 = b1;
    }

    @Test
    void test1() {
        ListNode intersectionNode = intersectionOfLinkedList.getIntersectionNode(head1, head2);
        System.out.println(intersectionNode.val);
    }
}