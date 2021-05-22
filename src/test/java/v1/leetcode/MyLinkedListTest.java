package v1.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyLinkedListTest {

	MyLinkedList linkedList;

	MyLinkedList.Node head;

	MyLinkedList.Node tail;

	@BeforeEach
	void setUp() {
		linkedList = new MyLinkedList();
		head = linkedList.head;
		tail = linkedList.tail;
	}

	void print() {
		MyLinkedList.Node current = head;
		while (current != null) {
			System.out.println(current.val);
			current = current.next;
		}
	}

	@Test
	void should_pass_when_accessing_in_bound_value() {
		linkedList.addAtTail(10);
		linkedList.addAtTail(11);
		linkedList.addAtTail(12);
		linkedList.addAtTail(13);

		print();

		System.out.println(linkedList.get(3));
		Assertions.assertThat(linkedList.get(3)).isEqualTo(12);

		Assertions.assertThat(linkedList.get(1)).isEqualTo(10);

		Assertions.assertThat(linkedList.get(4)).isEqualTo(13);
	}

	@Test
	void should_fail_when_accessing_value_beyond_boundary() {
		linkedList.addAtTail(10);
		linkedList.addAtTail(11);
		linkedList.addAtTail(12);
		linkedList.addAtTail(13);

		print();

		System.out.println(linkedList.get(5));
		Assertions.assertThat(linkedList.get(5)).isEqualTo(-1);
	}

	@Test
	void addAtHead() {
		linkedList.addAtHead(5);
		linkedList.addAtHead(4);
		linkedList.addAtHead(3);
		linkedList.addAtHead(2);
		print();
	}

	@Test
	void addAtTail() {
		linkedList.addAtTail(10);
		linkedList.addAtTail(11);
		linkedList.addAtTail(12);
		linkedList.addAtTail(13);
		print();
	}

	@Test
	void addAtIndex() {
		linkedList.addAtTail(10);
		linkedList.addAtTail(11);
		linkedList.addAtTail(12);
		linkedList.addAtTail(13);

		linkedList.addAtIndex(3, 15);

		print();
	}

	@Test
	void deleteAtIndex() {

		linkedList.addAtTail(10);
		linkedList.addAtTail(11);
		linkedList.addAtTail(12);
		linkedList.addAtTail(13);

		linkedList.addAtIndex(3, 15);

		print();

		linkedList.deleteAtIndex(3);
		linkedList.deleteAtIndex(3);

		print();


	}
}
