package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 */
class LRUCache {

	private Map<Integer, DLLNode> map;

	private DLLNode head = new DLLNode(Integer.MIN_VALUE, Integer.MIN_VALUE);

	private DLLNode tail = new DLLNode(Integer.MAX_VALUE, Integer.MAX_VALUE);

	int capacity = 0;

	public LRUCache(int capacity) {
		map = new HashMap<>();
		this.capacity = capacity;
		// Link Head and tail
		head.next = tail;
		tail.prev = head;
	}

	public int get(int key) {
		if(!map.containsKey(key)){
			System.out.println(-1);
			return -1;
		}else{
			// move that item to the front/head
			DLLNode node = map.get(key);
			removeNode(node);
			insert(key,node.value);
            System.out.println(node.value);
			return node.value;
		}
	}


	public void put(int key, int value) {
		// if it exists in the map
		if(map.containsKey(key)){
			DLLNode node = map.get(key);
			removeNode(node);
			insert(key,value);
		}else {
			if(isFull())
				removeFromTail();
			insert(key, value);
		}
	}

	private void insert(int key, int value) {
		DLLNode node = new DLLNode(key, value);

		// Pointers Play
		node.prev = head;
		node.next = head.next;
		head.next.prev = node;
		head.next = node;

		map.put(key, node);
	}


	private void removeNode(DLLNode currentNode) {

			currentNode.prev.next = tail;
			tail.prev = currentNode.prev;

			// remove from map
			map.remove(currentNode.key);

	}

	private void removeFromTail() {
		DLLNode lastElement = tail.prev;
		removeNode(lastElement);
	}

	private boolean isFull() {
		return map.size() == capacity;
	}

	/**
	 *
	 */
	class DLLNode{
		int key;
		int value;
		DLLNode prev;
		DLLNode next;

		public DLLNode(int key, int value) {
			this.key = key;
			this.value = value;
		}

		public DLLNode(int key, int value, DLLNode prev, DLLNode next) {
			this.key = key;
			this.value = value;
			this.prev = prev;
			this.next = next;
		}
	}
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */