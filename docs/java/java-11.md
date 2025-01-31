# Java 9, 10, and 11 Features and Top 10 Interview Questions

## Java 9 Features

1. **Module System (Project Jigsaw)**
2. **JShell (Interactive Java Shell)**
3. **Factory Methods for Collections**
4. **Private Methods in Interfaces**
5. **Process API Improvements**
6. **Stream API Enhancements**
7. **Optionals Enhancements**
8. **HTTP/2 Client**
9. **Improved Deprecation**
10. **Multi-Release JAR Files**

## Java 10 Features

1. **Local Variable Type Inference**
2. **Unmodifiable Collections Enhancements**
3. **Application Class-Data Sharing (CDS)**
4. **Garbage Collector Interface**
5. **Thread-Local Handshakes**
6. **Root Certificates**
7. **Heap Allocation on Alternative Memory Devices**

## Java 11 Features

1. **HTTP Client (Standardized)**
2. **Local-Variable Syntax for Lambda Parameters**
3. **String Methods Enhancements**
4. **Files Methods Enhancements**
5. **Running Java Files with `java` Command**
6. **Deprecation and Removal of Features**
7. **New Garbage Collector (ZGC)**
8. **Flight Recorder**
9. **Dynamic Class-File Constants**

---

## Detailed Explanations and Code Samples

### Java 9 Features

#### 1. Module System (Project Jigsaw)

Introduces modularity in Java to improve application structure and dependency management.

```java
module com.example {
    requires java.base;
    exports com.example.api;
}
```

#### 2. JShell (Interactive Java Shell)

Allows developers to test code snippets interactively.

```java
jshell> int sum = 5 + 10;
jshell> System.out.println(sum);
15
```

#### 3. Factory Methods for Collections

Simplifies creation of immutable collections.

```java
List<String> list = List.of("A", "B", "C");
```

#### 4. Private Methods in Interfaces

Enables code reuse in interfaces using private methods.

```java
interface MyInterface {
    default void log(String msg) {
        logToConsole(msg);
    }

    private void logToConsole(String msg) {
        System.out.println(msg);
    }
}
```

---

### Java 10 Features

#### 1. Local Variable Type Inference

`var` keyword allows implicit type inference.

```java
var message = "Hello, Java 10!";
System.out.println(message);
```

#### 2. Application Class-Data Sharing (CDS)

Reduces startup time by sharing class metadata across JVM instances.

---

### Java 11 Features

#### 1. HTTP Client (Standardized)

Provides a modern API for HTTP requests.

```java
HttpClient client = HttpClient.newHttpClient();
HttpRequest request = HttpRequest.newBuilder()
    .uri(URI.create("https://example.com"))
    .build();
HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());
```

#### 2. String Methods Enhancements

New methods like `isBlank()`, `lines()`, and `repeat()`.

```java
String str = "Hello \nWorld";
System.out.println(str.lines().count());
```

---

## Top 10 Java Interview Questions and Answers

### 1. What is the difference between `var` in Java 10 and `final` variables?

**Answer:** The `var` keyword allows implicit type inference, while `final` explicitly marks a variable as unchangeable. `var` cannot change the type assigned.

```java
var message = "Hello"; // Type inferred as String
final String constantMessage = "Constant";
```

### 2. What is the purpose of the module system introduced in Java 9?

**Answer:** The module system improves code organization, makes applications easier to scale, and enhances security by defining module dependencies explicitly.

### 3. How does the HTTP Client in Java 11 differ from the old `HttpURLConnection`?

**Answer:** The HTTP Client is non-blocking, supports HTTP/2, and provides a modern, fluent API for building requests.

### 4. What are factory methods for collections in Java 9?

**Answer:** These are methods like `List.of()`, `Set.of()`, and `Map.of()` for creating immutable collections.

```java
List<String> list = List.of("A", "B");
```

### 5. Can you explain the improvements to the `Optional` class in Java 9?

**Answer:** Java 9 introduced methods like `ifPresentOrElse()`, `stream()`, and `or()` for better handling of `Optional` values.

### 6. What is a multi-release JAR file in Java 9?

**Answer:** It allows different versions of classes to coexist in a single JAR file, enabling backward compatibility and use of newer APIs.

### 7. How does the `isBlank()` method in Java 11 differ from `isEmpty()`?

**Answer:** `isBlank()` checks if a string is empty or contains only white space, while `isEmpty()` only checks for an empty string.

```java
" ".isBlank(); // true
" ".isEmpty(); // false
```

### 8. What is Application Class-Data Sharing (CDS) in Java 10?

**Answer:** CDS improves startup time by sharing class metadata between JVM processes.

### 9. What are thread-local handshakes introduced in Java 10?

**Answer:** These allow JVM operations to be performed on individual threads without stopping all threads.

### 10. How do private methods in interfaces work in Java 9?

**Answer:** They allow code reuse within default and static methods of the same interface.

```java
interface Demo {
    default void methodA() {
        helper();
    }

    private void helper() {
        System.out.println("Helper method");
    }
}
```
