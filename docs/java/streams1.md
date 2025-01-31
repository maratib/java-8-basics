# Comprehensive Guide to Java Streams

- Provide a powerful way to process collections of data in a functional style.

- Streams allow for operations such as filtering, mapping, and reducing data while promoting cleaner and more readable code.
- Java Streams, introduced in Java 8

---

## Table of Contents

1. **`Introduction to Streams`**

2. **`Functional Interfaces in Streams`**
   - Supplier
   - Predicate
   - Consumer
   - Function
3. **`Intermediate Operations`**
   - Detailed Overview of Filter, Map
4. **`Terminal Operations`**
   - Detailed Overview of Reduce
5. **`Examples with Functional Interfaces`**
6. **`Top 10 Interview Questions and Answers`**

---

## `1. Introduction to Streams`

A Stream in Java is a sequence of elements supporting sequential and parallel aggregate operations. It abstracts away the need to iterate over collections explicitly.

### Key Characteristics:

- **`Not a data structure`**: Streams are not data containers.

- **`Functional style`**: Encourages declarative programming.
- **`Laziness`**: Intermediate operations are lazy and only executed when a terminal operation is invoked.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println); // Output: Alice
    }
}
```

---

## `2. Functional Interfaces in Streams`

### 2.1 Supplier

The `Supplier<T>` is a functional interface that represents a supplier of results. It has a single method:

```java
T get();
```

**`Use Case`**: Used in lazy evaluation scenarios where data is supplied on demand.

**Code Example**:

```java
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> randomValue = Math::random;

        System.out.println(randomValue.get()); // Outputs a random number
    }
}
```

---

### 2.2 Predicate

The `Predicate<T>` interface represents a condition (boolean-valued function) on an input. `Filter` takes a Predicate for boolean comparison

**Method**:

```java
boolean test(T t);
```

**`Use Case`**: Commonly used in filtering operations in Streams.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = num -> num % 2 == 0;

        numbers.stream()
               .filter(isEven)
               .forEach(System.out::println); // Output: 2, 4
    }
}
```

---

### 2.3 Consumer

The `Consumer<T>` interface represents an operation that takes a single input and returns no result.

**Method**:

```java
void accept(T t);
```

**`Use Case`**: Often used in the `forEach` terminal operation.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        Consumer<String> printName = System.out::println;

        names.forEach(printName);
    }
}
```

---

### 2.4 Function

The `Function<T, R>` interface takes one input and produces a result.

**Method**:

```java
R apply(T t);
```

**`Use Case`**: Used in mapping operations to transform data.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Function<String, Integer> nameLength = String::length;

        names.stream()
             .map(nameLength)
             .forEach(System.out::println); // Output: 5, 3, 7
    }
}
```

---

## 3. Intermediate Operations

### Common Intermediate Operations:

#### 3.1 Filter

The `filter` operation is used to retain elements that match a given predicate.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alex");

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println); // Output: Alice, Alex
    }
}
```

#### 3.2 Map

The `map` operation transforms elements of the stream based on a provided function.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println); // Output: ALICE, BOB, CHARLIE
    }
}
```

#### 3.3 Sorted

The `sorted` operation sorts elements in their natural order or using a custom comparator.

**Description**:
The `sorted` method is an intermediate operation that returns a stream with elements sorted. Sorting can be done naturally (for comparable elements) or by providing a comparator.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");

        names.stream()
             .sorted() // Natural order
             .forEach(System.out::println); // Output: Alice, Bob, Charlie

        names.stream()
             .sorted((a, b) -> b.compareTo(a)) // Custom comparator (reverse order)
             .forEach(System.out::println); // Output: Charlie, Bob, Alice
    }
}
```

---

## 4. Terminal Operations

### Common Terminal Operations:

#### 4.1 Reduce

The `reduce` operation combines elements of a stream into a single result.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println(sum); // Output: 10
    }
}
```

#### 4.2 ForEach

The `forEach` operation is a terminal operation used to perform an action on each element of the stream.

**Description**:
It iterates over the elements of the stream and applies the provided `Consumer` to each element. This operation does not modify the elements but is often used for side effects like printing or logging.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.stream()
             .forEach(name -> System.out.println("Name: " + name));
        // Output:
        // Name: Alice
        // Name: Bob
        // Name: Charlie
    }
}
```

#### 4.3 Collect

The `collect` operation is a terminal operation that transforms the elements of a stream into a collection, such as a `List`, `Set`, or `Map`. It is commonly used to gather the processed stream data into a desired container.

**Description**:
The `collect` method takes a `Collector` as an argument. The `Collectors` utility class provides methods like `toList()`, `toSet()`, and `toMap()` to help in this process.

**Code Example**:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice");

        // Collecting to a List
        List<String> list = names.stream()
                                 .distinct()
                                 .collect(Collectors.toList());
        System.out.println(list); // Output: [Alice, Bob, Charlie]

        // Collecting to a Set
        Set<String> set = names.stream()
                               .collect(Collectors.toSet());
        System.out.println(set); // Output: [Alice, Bob, Charlie]
    }
}
```

---

## 5. Examples with Functional Interfaces

**`Combining Supplier, Predicate, and Consumer`**:

```java
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CombinedExample {
    public static void main(String[] args) {
        Supplier<List<String>> nameSupplier = () -> Arrays.asList("Alice", "Bob", "Charlie");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Consumer<String> printName = System.out::println;

        nameSupplier.get().stream()
                    .filter(startsWithA)
                    .forEach(printName); // Output: Alice
    }
}
```

---

## 6. Top 10 Interview Questions and Answers

1. **What is a Stream in Java?**

   - A Stream is a sequence of elements supporting sequential and parallel aggregate operations.

2. **What are the `key characteristics of Streams`?**

   - Not a data structure, supports functional programming, and processes data lazily.

3. **Difference between `Intermediate and Terminal Operations?`**

   - Intermediate operations are lazy and return a Stream, while terminal operations produce a result or side-effect.

4. **What is the difference between `map` and `flatMap`?**

   - `map` transforms elements into a single output; `flatMap` transforms them into multiple outputs.

5. **What is the role of the `filter` operation?**

   - Filters elements based on a condition (predicate).

6. **How does the `reduce` operation work?**

   - It reduces elements of a stream into a single value by applying an associative function.

7. **Explain the use of `collect` in Streams.**

   - Collects elements of the stream into a collection like List, Set, or Map.

8. **What is the difference between `findFirst` and `findAny`?**

   - `findFirst` retrieves the first element; `findAny` retrieves any element (useful in parallel streams).

9. **How are `Streams` different from `Collections`?**

   - Collections store data; Streams process data.

10. **Can you reuse a Stream after a terminal operation?**
    - `No`, Streams cannot be reused after a terminal operation; `they must be recreated`.
