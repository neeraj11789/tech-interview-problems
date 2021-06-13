package v2.linkedlist;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class ReverserAlternatingElementsTest {

    private ReverserAlternatingElements reverserAlternatingElements;

    private ListNode head;

    @BeforeEach
    void setUp() {
        final ListNode listNode1 = new ListNode(1);
        final ListNode listNode2 = new ListNode(2);
        final ListNode listNode3 = new ListNode(3);
        final ListNode listNode4 = new ListNode(4);
        final ListNode listNode5 = new ListNode(5);
        final ListNode listNode6 = new ListNode(6);
        final ListNode listNode7 = new ListNode(7);
        final ListNode listNode8 = new ListNode(8);
        final ListNode listNode9 = new ListNode(9);
        final ListNode listNode10 = new ListNode(10);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;
        listNode9.next = listNode10;
        listNode10.next = null;

        head = listNode1;
    }

    @Test
    void test1() {
        reverserAlternatingElements = new ReverserAlternatingElements( 3, head );
        ListNode run = reverserAlternatingElements.run();
        Assertions.assertThat( run.val == 3);
    }
}