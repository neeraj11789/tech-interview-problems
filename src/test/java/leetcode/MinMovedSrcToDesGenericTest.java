package leetcode;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import leetcode.MinMovedSrcToDesGeneric.Cell;

class MinMovedSrcToDesGenericTest {

  MinMovedSrcToDesGeneric srcToDesGeneric;

  @BeforeEach
  void setUp() {
    srcToDesGeneric = new MinMovedSrcToDesGeneric();
  }

  @Test
  void should_take_6_steps_for_diagnols() {
    Cell source = new Cell(0,7);
    Cell destination = new Cell(7,0);
    int testValue = srcToDesGeneric.BFS(source, destination);
    assertThat(testValue).as("Should Return 6 for Diagnols").isEqualTo(6);
  }

  @Test
  void should_return_1_for_next_step(){
    Cell source = new Cell(0,7);
    Cell destination = new Cell(1,5);
    int testValue = srcToDesGeneric.BFS(source, destination);
    assertThat(testValue).as("Should Return 1 for Next Step").isEqualTo(1);
  }
}