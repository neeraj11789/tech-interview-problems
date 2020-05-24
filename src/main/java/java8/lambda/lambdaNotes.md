# Lambda in Java 8
Important notes and examples for java-8 lambda expressions

## Functional Interfaces
New package in Java 8 for Functional Interfaces. Mostly reside inside the package
```java.util.function``` 
Mainly of four types - 
1. Consumer/BiConsumer
2. Predicate/BiPredicate
3. Function/Bifunction
4. UnaryOperator/BinaryOperator

### Method References
```java
Consumer<String> c = s -> System.out.println(s); 
```
This can also be written as - 
```java
Consumer<String> c = System.out::println
```
Another Example - 
```java
Comparator<Integer> c = (i1, i2) -> Integer.compare(i1,i2);
```
Can be rewritten as - 
```java
Comparator<Interger> c = Integer::compare;
```

Real Life Example with Java Collections - 
````java
List<String> list = ...
list.foreach(System.out::println);
````

Examples of New Patterns (Predicate & Consumer here). Check the implementation of these inside java code to get the better undertanding - 
```java
// Consumer Example
Consumer<String> c = System.out::println;

// Predicate Example
Predicate<String> p1 = s -> s.length() < 20;
Predicate<String> p2 = s -> s.length() > 10;
Predicate<String> p3 = p1.and(p2);
```
