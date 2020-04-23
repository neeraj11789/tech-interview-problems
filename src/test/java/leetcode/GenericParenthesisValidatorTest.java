package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericParenthesisValidatorTest {

  GenericParenthesisValidator validator;

  @BeforeEach
  void setUp() {
    validator = new GenericParenthesisValidator();
  }

  @Test
  void isValid() {
    Assertions.assertThat(validator.isValid("((")).isFalse().as("Should be false for (( String");
    Assertions.assertThat(validator.isValid("((aa))")).as("Should be True for ((aa)) String").isTrue();
  }
}