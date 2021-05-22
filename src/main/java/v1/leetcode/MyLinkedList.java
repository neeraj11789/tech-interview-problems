package v1.leetcode;

class MyLinkedList {

	Node head;

	Node tail;

	private Node fakeHead = new Node(Integer.MIN_VALUE);

	private Node fakeTail = new Node(Integer.MAX_VALUE);

	public MyLinkedList() {

		head = fakeHead;
		tail = fakeTail;


		head.next = tail;
		tail.prev = head;
	}


	private Node getAtIndex(int index){
		int counter = 0;
		Node current = head;

		while (current!= fakeTail && counter<index){
			current = current.next;
			counter++;
		}
		if (current == fakeTail)
			return null;
		return current;
	}

	public int get(int index) {
		Node n = getAtIndex(index);
		if (n==null)
			return -1;
		return n.val;
	}

	public void addAtHead(int val) {
		Node node = new Node(val);
		node.prev = head;
		node.next = head.next;
		head.next.prev = node;
		head.next = node;
	}

	public void addAtTail(int val) {
		Node node = new Node(val);
		node.next = tail;
		node.prev = tail.prev;
		tail.prev.next = node;
		tail.prev = node;
	}

	public void addAtIndex(int index, int val) {
		Node current = getAtIndex(index);

		Node node = new Node(val);
		node.prev = current.prev;
		node.next = current;
		current.prev.next = node;
		current.prev = node;
	}

	public void deleteAtIndex(int index) {
		Node current = getAtIndex(index);

		current.prev.next = current.next;
		current.next.prev = current.prev;
	}


	static class Node{
		int val;
		Node next;
		Node prev;

		public Node(int val, Node next, Node prev) {
			this.val = val;
			this.next = next;
			this.prev = prev;
		}

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}
	}
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */