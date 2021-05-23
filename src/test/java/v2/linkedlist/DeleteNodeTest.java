package v2.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteNodeTest {

    private DeleteNode deleteNode;

    @BeforeEach
    void setUp() {
        deleteNode = new DeleteNode();
    }

    @Test
    @DisplayName("Positive test for middle element")
    void test1() {
        System.out.println("before deletion 3");
        deleteNode.print();
        deleteNode.deleteNode(3);
        System.out.println("after deletion 3");
        deleteNode.print();
    }


    @Test
    @DisplayName("Positive test for last element")
    void test2() {
        System.out.println("before deletion 5");
        deleteNode.print();
        deleteNode.deleteNode(5);
        System.out.println("after deletion 5");
        deleteNode.print();
    }


    @Test
    @DisplayName("Positive test for first element")
    void test3() {
        System.out.println("before deletion 1");
        deleteNode.print();
        deleteNode.deleteNode(1);
        System.out.println("after deletion 1");
        deleteNode.print();
    }
}