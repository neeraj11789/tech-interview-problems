package datastructures.impl;

import datastructures.MinHeap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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