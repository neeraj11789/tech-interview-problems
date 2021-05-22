package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

class AddNumbersTest {

    private AddNumbers program;

    @BeforeEach
    void setUp() {
        program = new AddNumbers();
    }

    @Test
    void test1() {
        ListNode node = program.addTwoNumbers(createList1(), createList2());
        program.print(node);
    }

    private ListNode createList1() {
        ListNode head = new ListNode(9);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        head.next = node2;
        node2.next = node3;

        return head;
    }

    private ListNode createList2(){
        ListNode headNew = new ListNode(1);
        ListNode newNode2 = new ListNode(1);
        ListNode newNode3 = new ListNode(1);
        headNew.next = newNode2;
        headNew.next = newNode3;

        return headNew;
    }
}