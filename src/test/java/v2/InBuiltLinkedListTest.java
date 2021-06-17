package v2;

import org.junit.jupiter.api.*;
import v2.linkedlist.InBuiltLinkedList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InBuiltLinkedListTest {

    private InBuiltLinkedList inBuiltLinkedList;

    @BeforeEach
    void setUp() {
        inBuiltLinkedList = new InBuiltLinkedList();
    }

    @Test
    @DisplayName("Positive Test")
    void test1() {
        final List<Integer> list = inBuiltLinkedList.run();
        assertEquals(6, list.size());
    }
}