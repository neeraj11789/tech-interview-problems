package v1.java8.streamapi;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamApiExamples {

    public void simpleExample(){
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");

        Predicate<String> p1 = s -> s.length() > 3;
        Predicate<String> p2 = Predicate.isEqual("one");
        Predicate<String> p3 = Predicate.isEqual("ten");

        Predicate<String> p = p2.or(p3);

//        System.out.println("Simple Filter");
//        stream
//                .filter(p1)
//                .forEach(s -> System.out.println(s));

        System.out.println("Predicate Example");
        stream
                .filter(p)
                .forEach(s -> System.out.println(s));
    }
}
