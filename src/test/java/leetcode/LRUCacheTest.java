package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {

	private LRUCache cache;

	@Test
	void createNew(){

		cache = new LRUCache(5);

		cache.put(1,1);
		cache.put(2,2);
		cache.put(3,3);
		cache.put(4,4);
		cache.put(5,5);
		cache.put(6,6);

	}

	@Test
	void test1(){

		cache = new LRUCache(2);

		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // returns 1
		cache.put(3, 3);    // evicts key 2
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		cache.get(4);       // returns 4

	}

	@Test
	void test2() {
		cache = new LRUCache(1);
		cache.put(2,1);
		cache.get(2);
		cache.put(3,2);
		cache.get(2);
		cache.get(3);
	}

	@Test
	void test3() {
		cache = new LRUCache(2);
		cache.put(2,1);
		cache.put(1,1);
		cache.put(2,3);
		cache.put(4,1);
		cache.get(1);
		cache.get(2);
	}

	@Test
	void test4() {
		cache = new LRUCache(3);
		cache.put(1,1);
		cache.put(2,2);
		cache.put(3,3);
		cache.put(4,4);
		cache.get(4);
		cache.get(3);
		cache.get(2);
		cache.get(1);
		cache.put(5,5);
		cache.get(1);
		cache.get(2);
		cache.get(3);
		cache.get(4);
		cache.get(5);
	}
}