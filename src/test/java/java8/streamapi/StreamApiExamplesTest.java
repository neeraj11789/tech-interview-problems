package java8.streamapi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StreamApiExamplesTest {

    private StreamApiExamples examples;

    @BeforeEach
    void setUp() {
        examples = new StreamApiExamples();
    }

    @Test
    void simpleExample() {
        examples.simpleExample();
    }
}