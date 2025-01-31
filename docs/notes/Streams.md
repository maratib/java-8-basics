# Java Streams

## What is a Stream?

#### Introduced in Java 8 as a new package `java.util.stream`

#### A Stream is a `sequence of data` that you can process in a `declarative and functional style`.

- It allows to perform `filtering, mapping, and reducing` operations on a `collection of data`.
- Use sources, including arrays, collections, and even I/O channels
- Supports sequential as well as parallel operations.
- `Filtering, mapping and reducing` data with `more readable code`.
- Abstract away the need of iterate over collections explicitly.
- Takes a `stream source` do zero or more `intermediate operations` invoke `terminal operation` gets result.
- `Intermediate operations` are lazy and only executes when a `terminal operation` is invoked.

#### Notes

- Streams are not data structures or data containers.
- Streams cannot mutate data.
- Once a `terminal operation` is called stream cannot be used again.
- :: [Method Reference Operator](../java/colons.md)

### Intermediate Operators

- Always return a stream, lazy executed

- `Filter` to filter the data, returns `boolean value true or false`, if true, the item is added
- `Map` to transform the item e.g `.map(String::toUpperCase)`
- `Reduce`
- `Sorted`

## How Streams Work

![Stream life cycle](https://www.logicbig.com/tutorials/core-java-tutorial/java-util-stream/images/java-streams.png)

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
