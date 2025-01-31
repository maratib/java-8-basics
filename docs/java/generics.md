# Java Generics: A Comprehensive Introduction

`List<String> names = new ArrayList<>();`

- Allows developers to write `type-safe and reusable code`.
- They enable classes, interfaces, and methods to operate on a specific type without knowing the type in advance.
- Generics provide compile-time type checking and eliminate the need for casting, which reduces runtime errors and increases code readability.
- Java Generics, introduced in Java 5

## Key Concepts of Java Generics

1. **`Type Parameters`**:

   - Generics use type parameters to enforce type safety.
   - These parameters act as placeholders for specific types, which are provided during object instantiation.

   - Example: `<T>`, `<K, V>`, `<E>`, where `T` stands for Type, `K` and `V` for Key and Value, and `E` for Element.

2. **`Generic Classes`**: Classes that use type parameters.
3. **`Generic Methods`**: Methods that define their type parameters.
4. **`Bounded Type Parameters`**: Constrain the types that can be used with a generic.
5. **`Wildcard (?)`**: Represents an unknown type and is often used for flexibility.

---

## Use Cases of Generics

### 1. **Type-Safe Collections**

Generics ensure that collections store and retrieve elements of a specific type, avoiding `ClassCastException`.

#### Example:

```java
import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        for (String name : names) {
            System.out.println(name.toUpperCase()); // No casting needed
        }
    }
}
```

---

### 2. **Generic Classes**

A generic class allows defining a class with a placeholder for a type.

#### Example:

```java
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setItem(42);
        System.out.println(intBox.getItem());

        Box<String> strBox = new Box<>();
        strBox.setItem("Generics");
        System.out.println(strBox.getItem());
    }
}
```

---

### 3. **Generic Methods**

Methods with type parameters independent of the class.

#### Example:

```java
public class GenericsMethodExample {
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob"};
        Integer[] numbers = {1, 2, 3};

        printArray(names);
        printArray(numbers);
    }
}
```

---

### 4. **Bounded Type Parameters**

Constrains types to a specific hierarchy, e.g., types that extend a class or implement an interface.

#### Example:

```java
public class BoundedTypeExample {
    public static <T extends Number> double calculateSum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(calculateSum(5, 7));       // Integers
        System.out.println(calculateSum(5.5, 7.3));  // Doubles
    }
}
```

---

### 5. **Wildcard Use**

Supports unknown types for flexibility, such as in reading data.

#### Example:

```java
import java.util.List;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob");
        List<Integer> numbers = List.of(1, 2, 3);

        printList(names);
        printList(numbers);
    }
}
```

---

## Advantages of Generics

1. **`Type Safety`**: Compile-time checks reduce runtime errors.

2. **`Code Reusability`**: Generic classes and methods can work with multiple types.
3. **`Avoids Casting`**: No need for manual casting when retrieving objects from collections.
4. **`Improved Readability`**: Clearer intent with specific types.

---

## `Top 10 Java Generics Interview Questions and Answers`

### 1. **What are Java Generics?**

Java Generics provide a way to write classes, methods, and interfaces that work with any data type while ensuring type safety.

---

### 2. **What are the advantages of using Generics?**

- Generics enhance type safety
- Eliminate the need for typecasting
- Improve code reusability
- Provide better readability.

---

### 3. **What is the difference between `T`, `E`, `K`, and `V` in Generics?**

These are type parameter conventions:

- `T`: Type.
- `E`: Element (used in collections).
- `K`: Key (used in maps).
- `V`: Value (used in maps).
- `?`: Unknown type wildcard.

---

### 4. **What is a wildcard in Generics?**

The wildcard `?` represents an unknown type. It is used in scenarios where the type is not known or needed, such as reading elements from a collection.

---

### 5. **What are bounded type parameters?**

Bounded type parameters limit the types that can be used with generics.  
Example: `<T extends Number>` ensures `T` can only be `Number` or its subclasses.

---

### 6. **Can you create a generic array in Java?**

No, creating generic arrays is not allowed due to type erasure at runtime. However, you can create arrays of generic types indirectly using `Array.newInstance`.

---

### 7. **What is type erasure in Generics?**

Type erasure is a process where generic type information is removed at runtime, and all generics are replaced with their raw types to ensure backward compatibility with older Java versions.

---

### 8. **What is the difference between `List<?>` and `List<Object>`?**

**Answer**:

- `List<?>`: Represents a list of an unknown type.
- `List<Object>`: Represents a list of `Object` type, restricting it from holding specific types like `Integer` or `String`.

---

### 9. **Can a static method or variable use a generic type?**

No, static methods and variables cannot use the generic type of the class, but they can define their type parameters independently.

---

### 10. **What is the difference between `<? extends T>` and `<? super T>`?**

**Answer**:

- `<? extends T>`: Allows a type that is `T` or its subclass.
- `<? super T>`: Allows a type that is `T` or its superclass.

---

This guide provides a detailed understanding of Java Generics and prepares you for interview questions effectively. Let me know if you'd like further explanations or examples!
