# Java 8 Features Overview

## 1. Lambda Expressions

### Explanation:

Lambda expressions provide a concise way to implement functional interfaces using a single method without needing anonymous classes.

### Syntax:

```java
(parameter1, parameter2) -> { // body }
```

### Sample Code:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(name -> System.out.println(name));
```

### Use Case:

Simplifying iteration, sorting, and filtering operations in collections.

### Interview Questions:

1. What is a lambda expression in Java 8?

   **A:** A lambda expression is a concise way to represent a method interface using a single abstract method, enhancing readability and functional programming.

2. How do lambda expressions improve code readability?

   **A:** By eliminating boilerplate code, such as anonymous classes, making the logic more concise and readable.

3. Can a lambda expression access static and instance variables?

   **A:** Yes, lambda expressions can access static, instance variables, and effectively final variables in their scope.

---

## 2. Functional Interfaces or SAMs

### Explanation:

Functional interfaces are interfaces with a `single abstract method` (SAM), annotated with `@FunctionalInterface` for clarity.

### Sample Code:

```java
@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Example {
    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello, " + name);
        greeting.sayHello("Alice");
    }
}
```

### Interview Questions:

1.` What is a functional interface in Java 8?`  
 **A:** A functional interface is an interface with exactly one abstract method, suitable for lambda expressions.

2. `Can functional interfaces have default methods?`  
   **A:** Yes, they can have default and static methods in addition to the single abstract method.

3. `Name some predefined functional interfaces in Java 8.`  
   **A:** Examples include `Runnable`, `Callable`, `Predicate`, `Function`, and `Supplier`.

---

## 3. Streams API

### Explanation:

The Streams API provides a functional approach to process collections of data by performing filter, map, reduce, and collect operations.

### Sample Code:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.stream()
       .filter(num -> num % 2 == 0)
       .map(num -> num * num)
       .forEach(System.out::println);
```

### Use Case:

Efficiently performing operations on large datasets.

### Interview Questions:

1. What is the difference between a `Stream` and a `Collection`?  
   **A:** `Collections` store data, whereas `Streams` process data without modifying the source.

2. How does lazy evaluation work in Streams?  
   **A:** Intermediate operations in Streams are not executed until a terminal operation is invoked.

3. Explain the difference between `map` and `flatMap` in Streams.
   **A:** `map` transforms elements into a single level, while `flatMap` flattens nested structures.

---

## 4. Default Methods

### Explanation:

Default methods allow interfaces to have method implementations, enabling backward compatibility without affecting existing classes.

### Sample Code:

```java
interface Vehicle {
    default void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car implements Vehicle {
    public static void main(String[] args) {
        new Car().start();
    }
}
```

### Use Case:

Adding new methods to interfaces without breaking existing implementations.

### Interview Questions:

1. What are default methods in Java 8?
   **A:** Default methods are methods in interfaces with a default implementation.

2. Can default methods be overridden?
   **A:** Yes, a class can override default methods if required.

3. How are conflicts resolved when a class implements multiple interfaces with default methods?
   **A:** The class must explicitly override the conflicting default methods.

---

## 5. Optional Class

### Explanation:

The `Optional` class is a container for nullable values, designed to reduce null pointer exceptions.

### Sample Code:

```java
Optional<String> name = Optional.ofNullable("Alice");
name.ifPresent(System.out::println);
```

### Use Case:

Avoiding null checks and handling null values safely.

### Interview Questions:

1. What is the purpose of the Optional class in Java 8?
   **A:** It is used to represent optional values and reduce null pointer exceptions.

2. How do you create an Optional object?
   **A:** Using `Optional.of(value)`, `Optional.ofNullable(value)`, or `Optional.empty()`.

3. What are the differences between `of`, `ofNullable`, and `empty` methods in Optional?
   **A:** `of` is for non-null values, `ofNullable` allows null, and `empty` represents an absent value.

---

## 6. Method References

### Explanation:

Method references are shorthand for calling methods using the `::` operator, improving readability.

### Sample Code:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(System.out::println);
```

### Use Case:

Simplifying the use of lambda expressions for existing methods.

### Interview Questions:

1. What are method references in Java 8?
   **A:** Method references are a shorthand for lambda expressions invoking methods.

2. What are the types of method references?
   **A:** Static method reference, instance method reference, and constructor reference.

3. Can method references refer to static methods?
   **A:** Yes, static method references use the syntax `ClassName::methodName`.

---

## 7. Date and Time API

### Explanation:

The new Date and Time API (`java.time`) simplifies working with dates and times, making it thread-safe and easy to use.

### Sample Code:

```java
LocalDate today = LocalDate.now();
LocalDate birthday = LocalDate.of(1990, Month.JANUARY, 1);
Period age = Period.between(birthday, today);
System.out.println("Age: " + age.getYears());
```

### Use Case:

Handling complex date/time operations, such as time zones and formatting.

### Interview Questions:

1. What is the difference between `LocalDate` and `ZonedDateTime`?
   **A:** `LocalDate` represents a date without time or timezone, while `ZonedDateTime` includes both time and timezone.

2. How does the new Date and Time API differ from `java.util.Date`?
   **A:** It is immutable, thread-safe, and easier to use.

3. What is the purpose of `Duration` and `Period` classes?
   **A:** `Duration` measures time in seconds/nanoseconds, while `Period` measures in days, months, or years.

---

## 8. Nashorn JavaScript Engine

### Explanation:

The Nashorn engine allows executing JavaScript code directly from Java applications.

### Sample Code:

```java
ScriptEngineManager manager = new ScriptEngineManager();
ScriptEngine engine = manager.getEngineByName("nashorn");
engine.eval("print('Hello from JavaScript');");
```

### Use Case:

Embedding and running JavaScript within Java applications.

### Interview Questions:

1. What is the purpose of the Nashorn engine in Java 8?
   **A:** It allows Java applications to run embedded JavaScript code.

2. How do you execute JavaScript using Nashorn?
   **A:** Use the `ScriptEngineManager` and `ScriptEngine` classes to execute JavaScript.

3. Is Nashorn deprecated in later Java versions?
   **A:** Yes, it was deprecated in Java 11 and removed in Java 15.

---

## 9. Base64 Encoding and Decoding

### Explanation:

Java 8 introduces the `java.util.Base64` class for encoding and decoding Base64 strings.

### Sample Code:

```java
String encoded = Base64.getEncoder().encodeToString("Hello".getBytes());
System.out.println("Encoded: " + encoded);

String decoded = new String(Base64.getDecoder().decode(encoded));
System.out.println("Decoded: " + decoded);
```

### Use Case:

Encoding data for secure transmission or storage.

### Interview Questions:

1. How do you encode and decode Base64 in Java 8?
   **A:** Use the `Base64.getEncoder()` and `Base64.getDecoder()` methods.

2. What are the types of Base64 encoders/decoders available?
   **A:** Basic, URL, and MIME.

---
