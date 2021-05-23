package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import v1.datastructures.ListNode;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {

    private PartitionList partitionList;
    private ListNode head;

    @BeforeEach
    void setUp() {
        init();
        partitionList = new PartitionList();
    }

    private void init() {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(7);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(6);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        head = l1;
    }

    @Test
    void test1() {
//        partitionList.print(head);
        ListNode partition = partitionList.partition(head, 6);
        partitionList.print(partition);
    }

    @Test
    void test2() {
        ListNode partition = partitionList.partition(null, 6);
        partitionList.print(partition);
    }

    @Test
    void test3() {
//        partitionList.print(head);
        ListNode partition = partitionList.partition(head, 60);
        partitionList.print(partition);
    }
}