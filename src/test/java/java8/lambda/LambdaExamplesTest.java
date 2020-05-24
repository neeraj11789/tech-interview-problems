package java8.lambda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LambdaExamplesTest {

    private LambdaExamples examples;

    @BeforeEach
    void setUp() {
        examples = new LambdaExamples();
    }

    @Test
    void exampleWithOutLambda() {
        System.out.println("**** Without using Lambda Expressions ****");
        examples.exampleWithoutLambda();
    }

    @Test
    void exampleWithLambda() {
        System.out.println("**** With Using Lambda Expressions ****");
        examples.exampleWithLambda();
    }

    @Test
    void comparatorExampleWithoutLambda() {
        System.out.println("**** Without using Lambda Expressions ****");
        examples.comparatorExampleWithoutLambda();
    }

    @Test
    void comparatorExampleWithLambda() {
        System.out.println("**** With Using Lambda Expressions ****");
        examples.comparatorExampleWithLambda();
    }

    @Test
    void chainConsumers() {
        System.out.println("**** Example of Consumers ****");
        examples.chainConsumers();
    }
}