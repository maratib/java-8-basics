## 1. **What is the main feature introduced in Java 8?**

Java 8 introduced several significant features, including: - Lambda Expressions - Stream API - Default Methods in Interfaces - Functional Interfaces - java.time (Date/Time API) - Optional class - New collector API - Parallel Operations on Streams

## 2. **What are Lambda Expressions in Java 8?**

Lambda expressions allow you to write instances of single-method interfaces (functional interfaces) in a much more concise and readable way. Syntax:
`java
     (parameters) -> expression
     `

## 3. **What is a Functional Interface?**

A functional interface is an interface that has only one abstract method. Java 8 introduced the `@FunctionalInterface` annotation to ensure the interface has exactly one abstract method.
`java
     @FunctionalInterface
     public interface MyInterface {
         void myMethod();
     }
     `

## 4. **What is the Stream API?**

The Stream API allows processing sequences of elements (such as collections) in a functional style. Streams can be processed in parallel and support operations like map, filter, reduce, and more.

## 5. **What is the difference between `map()` and `flatMap()` in Java 8 Streams?**

     - `map()` transforms each element into another element.
     - `flatMap()` flattens the result into a single stream of elements.

## 6. **Explain the concept of Default Methods in Java 8.**

Java 8 allows you to add method implementations in interfaces using the `default` keyword. This helps in extending interfaces without breaking existing implementations.
`java
     public interface MyInterface {
         default void defaultMethod() {
             System.out.println("Default method");
         }
     }
     `

## 7. **What is Optional in Java 8?**

`Optional` is a container object that may or may not contain a non-null value. It is used to avoid `NullPointerException` and is often used for handling return values that might be null.
`java
     Optional<String> opt = Optional.ofNullable("Hello");
     opt.ifPresent(System.out::println);  // prints "Hello"
     `

## 8. **How to use `forEach()` method in Java 8?**

The `forEach()` method is a default method in the `Iterable` interface that provides a way to iterate over elements in a collection.
`java
     list.forEach(item -> System.out.println(item));
     `

## 9. **What is the purpose of the `filter()` method in Streams?**

The `filter()` method is used to filter elements based on a given predicate. It returns a new stream with only the elements that match the predicate.
`java
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
     numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
     `

## 10. **What is the difference between `Collection` and `Stream` in Java 8?**

     - `Collection` represents a collection of elements, with built-in methods to manipulate and traverse them.
     - `Stream` is an abstraction that allows you to process sequences of elements in a functional way without modifying the underlying data structure.

## 11. **What are method references in Java 8?**

Method references provide a way to refer to methods of classes or objects in a shorthand notation.
`java
     List<String> list = Arrays.asList("a", "b", "c");
     list.forEach(System.out::println);  // Method reference
     `

## 12. **What is the new Date/Time API in Java 8?**

Java 8 introduced a new Date and Time API (`java.time` package) to address issues with the older `java.util.Date` and `java.util.Calendar` classes. It provides immutable and thread-safe classes such as `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and more.

## 13. **What is the difference between `LocalDate` and `LocalDateTime`?**

- **Answer:**
  - `LocalDate` represents a date without a time zone (e.g., "2025-01-05").
  - `LocalDateTime` represents both date and time without a time zone (e.g., "2025-01-05T12:30").

## 14. **What is `@FunctionalInterface` annotation?**

The `@FunctionalInterface` annotation is used to declare an interface as a functional interface. It ensures that the interface contains exactly one abstract method.

## 15. **What are the key benefits of using Java 8 Streams?**

Key benefits include: - Ability to process data in parallel - Concise and readable code - Lazy evaluation - More expressive code using functional operations

## 16. **What are the different ways to create a stream in Java 8?**

Streams can be created in the following ways: - From a collection: `List<String> list = Arrays.asList("a", "b", "c"); list.stream();` - From arrays: `Stream<String> stream = Arrays.stream(new String[]{"a", "b", "c"});` - Using `Stream.of()`: `Stream<String> stream = Stream.of("a", "b", "c");`

## 17. **What are the `peek()` and `map()` methods in Java 8 Streams?**

- **Answer:**
  - `peek()`: Allows you to inspect each element in the stream without modifying it.
  - `map()`: Transforms each element of the stream using a provided function.

## 18. **What are the main features of the new `java.time` package in Java 8?**

     - Immutable and thread-safe classes for date and time
     - Better handling of time zones and offsets (`ZonedDateTime`, `OffsetDateTime`)
     - Methods for formatting and parsing dates and times
     - API that works in a more human-readable manner, making it easier to work with.

## 19. **What is `Collectors` in Java 8?**

`Collectors` is a utility class that provides various methods to collect elements from a stream into collections, such as lists, sets, or maps. Examples: - `toList()`: Collect elements into a List - `joining()`: Concatenate strings - `groupingBy()`: Group elements by a classifier function

## 20. **Explain the `reduce()` method in Java 8 Streams.**

The `reduce()` method performs a reduction on the elements of the stream using an associative accumulation function and returns an `Optional` containing the result.

## 21. **What is the difference between `parallelStream()` and `stream()`?**

     - `stream()` processes elements sequentially.
     - `parallelStream()` processes elements in parallel, potentially improving performance for large datasets.

## 22. **How does the `Optional` class help to prevent `NullPointerException`?**

The `Optional` class provides methods like `isPresent()`, `ifPresent()`, and `orElse()` to check for the presence of a value and avoid direct null checks.

## 23. **What is the purpose of `Supplier` functional interface in Java 8?**

`Supplier` is a functional interface that represents a function that supplies a value of a certain type, without taking any input. Example:
`java
     Supplier<String> supplier = () -> "Hello, World!";
     `

## 24. **What is `Consumer` functional interface?**

`Consumer` is a functional interface that accepts a single argument and returns no result. It is used for operations that modify or print values. Example:
`java
     Consumer<String> consumer = s -> System.out.println(s);
     `

## 25. **What is the `Predicate` interface in Java 8?**

`Predicate` is a functional interface used to represent a boolean-valued function of one argument. It is commonly used for filtering elements in streams.
`java
     Predicate<Integer> isEven = n -> n % 2 == 0;
     `

## 26. **What is the use of `java.util.function` package?**

The `java.util.function` package contains various functional interfaces such as `Function`, `Predicate`, `Consumer`, `Supplier`, and `BinaryOperator` to support functional programming in Java.

## 27. **What are `intStream`, `longStream`, and `doubleStream`?**

These are specialized streams for handling primitive data types `int`, `long`, and `double` efficiently without autoboxing.

## 28. **What is method chaining in Java 8?**

Method chaining allows you to chain multiple method calls in a single expression, typically used with streams, where each method call returns a new stream.
`java
     list.stream().filter(x -> x > 5).map(String::valueOf).forEach(System.out::println);
     `

## 29. **How can you handle exceptions in lambda expressions?**

Lambda expressions cannot throw checked exceptions directly. You need to either catch exceptions within the lambda or use a helper function to handle them.

## 30. **What are the key improvements in Java 8's `Collectors` utility?**

Java 8 enhanced the `Collectors` class with more powerful collection operations such as `toMap()`, `groupingBy()`, `partitioningBy()`, and `reducing()`.
