![Streams](https://github.com/maratib/learn/raw/main/java/cs/img2.png)

# Introduction to Java 8 Streams

- Enable `functional-style programming` and efficient data processing.

- They allow developers to `perform operations on collections in a declarative` and concise manner.
- Streams support `lazy evaluation and can process data in parallel`, making them highly efficient for large datasets.

---

## Key Features of Streams

1. **`Declarative Style`**: Simplifies the code by focusing on what to do, not how to do it.
2. **`Lazy Evaluation`**: Operations on streams are performed only when required.
3. **`Parallel Processing`**: Utilize multi-core architecture for better performance.
4. **`Immutability`**: Streams do not modify the original data source.
5. **`Functional Operations`**: Offers a rich set of intermediate and terminal operations.

---

## How Streams Work

Streams follow a three-step process:

1. **`Source`**: A stream is created from a collection or array.
2. **`Intermediate Operations`**: Transform the stream (e.g., `map`, `filter`, `reduce`).
3. **`Terminal Operations`**: Produce a result (e.g., `collect`, `forEach`).

### Simple Example of How Streams Work

```java
//Create stream
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

List<String> filteredAndMappedNames = names.stream()
    // Filter names starting with A or B
    .filter(name -> name.startsWith("A") || name.startsWith("B"))
    // Convert remaining names to uppercase
    .map(String::toUpperCase)
    // Collect the results into a list
    .collect(Collectors.toList());

System.out.println(filteredAndMappedNames); // Output: [ALICE, BOB]
```

This example demonstrates:

- Creating a stream from a list.
- Filtering the elements based on a condition.
- Mapping the elements to a new value.
- Collecting the results into a new list.

---

## Example Code Samples

### 1. Create a Stream

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Stream<String> nameStream = names.stream();
```

### 2. Filter a Stream

The `filter` method is used to exclude elements that do not satisfy a given predicate.

```java
List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("A"))
    .collect(Collectors.toList());
System.out.println(filteredNames); // Output: [Alice]
```

### 3. Map and Transform Data

The `map` method is used to transform each element of the stream using a provided function. For example, converting all strings to uppercase:

```java
List<String> upperCaseNames = names.stream()
    .map(String::toUpperCase)
    .collect(Collectors.toList());
System.out.println(upperCaseNames); // Output: [ALICE, BOB, CHARLIE]
```

Mapping can also be used to extract or transform object properties:

```java
List<Integer> nameLengths = names.stream()
    .map(String::length)
    .collect(Collectors.toList());
System.out.println(nameLengths); // Output: [5, 3, 7]
```

### 4. Reduce a Stream

The `reduce` method combines elements of a stream into a single result. It takes an identity value and a binary operator.

```java
int sum = Arrays.asList(1, 2, 3, 4).stream()
    .reduce(0, Integer::sum);
System.out.println(sum); // Output: 10
```

Reducing can also be used for other operations like concatenation:

```java
String concatenated = Arrays.asList("A", "B", "C").stream()
    .reduce("", (a, b) -> a + b);
System.out.println(concatenated); // Output: ABC
```

### 5. Parallel Streams

Parallel streams split the data and process it in multiple threads, which can improve performance for large datasets.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream()
    .forEach(System.out::println); // May print in non-sequential order
```

---

## Functional Interfaces in Java 8

### Runnable

The `Runnable` interface represents a task that can be executed by a thread. It does not return any result.

```java
Runnable task = () -> System.out.println("Running a task!");
task.run(); // Output: Running a task!
```

### Callable

The `Callable` interface is similar to `Runnable` but returns a result and can throw an exception.

```java
Callable<Integer> callableTask = () -> 42;
try {
    Integer result = callableTask.call();
    System.out.println("Result: " + result); // Output: Result: 42
} catch (Exception e) {
    e.printStackTrace();
}
```

### Predicate

The `Predicate` interface represents a condition or filter that returns `true` or `false` for a given input.

```java
Predicate<String> isLongName = name -> name.length() > 5;
System.out.println(isLongName.test("Charlie")); // Output: true
System.out.println(isLongName.test("Bob")); // Output: false
```

### Function

The `Function` interface takes one input and produces a result. It is often used for mapping operations.

```java
Function<String, Integer> stringLength = String::length;
System.out.println(stringLength.apply("Alice")); // Output: 5
```

### Supplier

The `Supplier` interface provides values without taking any input. It is used for lazy or deferred value generation.

```java
Supplier<Double> randomSupplier = Math::random;
System.out.println(randomSupplier.get()); // Output: A random number, e.g., 0.72345
```

---

## Top 10 Interview Questions on Java 8 Streams

### 1. **What is a Stream in Java 8?**

**Answer**: A Stream is a sequence of elements supporting sequential and parallel aggregate operations. It does not store data but instead operates on the data source.

### 2. **What is the difference between `Collection` and `Stream`?**

**Answer**:

- **Collection**: Stores data and is a data structure.
- **Stream**: Does not store data; it processes data in a functional style.

### 3. **What are the types of Streams in Java?**

**Answer**:

1. Sequential Streams: Process data sequentially.
2. Parallel Streams: Process data in parallel using multiple threads.

### 4. **What are intermediate and terminal operations?**

**Answer**:

- **Intermediate Operations**: Transform the stream and return another stream (e.g., `filter`, `map`).
- **Terminal Operations**: Produce a result or a side-effect (e.g., `collect`, `forEach`).

### 5. **Can a Stream be reused?**

**Answer**: No, a Stream cannot be reused. Once a terminal operation is invoked, the Stream is consumed.

### 6. **What is the purpose of `filter` in Streams?**

**Answer**: The `filter` method is used to include only elements that match a given predicate. It helps in narrowing down the stream's content based on a condition.

### 7. **Explain the `map` operation in Streams.**

**Answer**: The `map` operation is used to transform each element in the stream into another object using a given function. For example, you can use it to convert strings to uppercase or extract specific fields from objects.

### 8. **What is the difference between `findFirst` and `findAny`?**

**Answer**:

- `findFirst`: Returns the first element in the stream.
- `findAny`: Returns any element, particularly useful in parallel streams, where the fastest available match is returned.

### 9. **What is `reduce` in Streams?**

**Answer**: The `reduce` operation combines elements of the stream using a binary operator to produce a single value. Common use cases include summing, concatenating, or aggregating data.

### 10. **How does lazy evaluation work in Streams?**

**Answer**: Intermediate operations in Streams are lazy and do not execute until a terminal operation is invoked. This improves performance by minimizing computation and processing only what is necessary.

---

By mastering Java 8 Streams, you can write cleaner, more efficient, and more maintainable code while harnessing the power of modern Java.
