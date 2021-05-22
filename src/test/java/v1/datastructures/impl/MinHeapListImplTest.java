package v1.datastructures.impl;

import v1.datastructures.MinHeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinHeapListImplTest {

    MinHeap heap;

    @BeforeEach
    void setUp() {
        heap = new MinHeapListImpl();
    }

    @Test
    void delete() {
    }

    @Test
    void insertElement() {
        heap.insertElement(3);
        heap.insertElement(4);
        heap.insertElement(1);
        heap.insertElement(5);
        heap.print();
        System.out.println("Deleting Element " + heap.delete());
        heap.print();
    }
}