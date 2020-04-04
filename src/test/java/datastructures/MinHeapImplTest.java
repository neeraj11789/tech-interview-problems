package datastructures;

import datastructures.impl.MinHeapImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinHeapImplTest {

    private int[] arr;
    private MinHeap heap;

    @BeforeEach
    void setUp() {
        arr = new int[]{1,2,1,3,1,4,5,3};
        heap = new MinHeapImpl(arr.length);
    }

    @Test
    void insert() {
        for (int i = 0; i < arr.length; i++) {
            heap.insert(arr[i]);
        }
        heap.print();
        testDelete();
    }

    void testDelete(){
        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();

        System.out.println("Deleting Top Element ");
        System.out.println(heap.delete());
        System.out.println("Printing new heap");
        heap.print();
    }

    @Test
    void checkInsertionInDefinedLength(){
        heap = new MinHeapImpl(3);
        heap.conditionalInsert(1);
        heap.conditionalInsert(2);
        heap.conditionalInsert(1);
        heap.conditionalInsert(3);
        heap.conditionalInsert(1);
        heap.conditionalInsert(4);
        heap.conditionalInsert(5);
        heap.print();
    }
}