package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNodeWithValueTest {

    private RemoveNodeWithValue removeNodeWithValue;

    private ListNode head;

    @BeforeEach
    void setUp() {
        removeNodeWithValue = new RemoveNodeWithValue();
        init();
    }

    private void init() {

        final ListNode a0 = new ListNode(2);
        final ListNode a1 = new ListNode(4);
        final ListNode a2 = new ListNode(2);
        final ListNode a3 = new ListNode(6);
        final ListNode a4 = new ListNode(2);
        final ListNode a5 = new ListNode(8);
        a0.next = a1;
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;

        head = a0;
    }

    @Test
    void test1() {
        ListNode node = removeNodeWithValue.removeElements(head, 2);
        removeNodeWithValue.print(node);
    }
}