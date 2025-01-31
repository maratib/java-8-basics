# `:: Method Reference Operator`

- `::` **method reference operator** introduced Java 8
- Used to refer to methods or constructors without invoking them.
- It is a shorthand notation for lambda expressions (e.g `names.forEach(System.out::println);`)
- `Method references` make the code more `concise and readable`.

### Syntax

The general syntax for method reference is:

```java
ClassName::methodName
```

### Uses of `::` in Java 8

The `::` operator can be used in the following contexts:

---

### 1. **Static Method Reference**

Refers to a static method of a class.

#### Syntax:

```java
ClassName::staticMethodName
```

#### Example:

```java
        // Using method reference
        names.forEach(System.out::println);
```

Here, `System.out::println` is a reference to the static `println` method.

---

### 2. **Instance Method Reference of a Particular Object**

Refers to an instance method of a specific object.

#### Syntax:

```java
objectReference::instanceMethodName
```

#### Example:

```java
        // Using method reference
        names.forEach(System.out::println);
```

Here, `System.out::println` refers to the `println` method of the `System.out` object.

---

### 3. **Instance Method Reference of an Arbitrary Object of a Particular Type**

Refers to an instance method of an arbitrary object of a specific type. This is often used in stream operations.

#### Syntax:

```java
ClassName::instanceMethodName
```

#### Example:

```java
        // Using method reference
        names.sort(String::compareToIgnoreCase);
```

Here, `String::compareToIgnoreCase` refers to the `compareToIgnoreCase` method of the `String` class.

---

### 4. **Constructor Reference**

Refers to a constructor of a class.

#### Syntax:

```java
ClassName::new
```

#### Example:

```java
        Supplier<List<String>> listSupplier = ArrayList::new;
```

Here, `ArrayList::new` refers to the constructor of the `ArrayList` class.

---

### 5. **Super Method Reference**

Refers to a method of the superclass.

#### Syntax:

```java
super::methodName
```

#### Example:

```java
class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    @Override
    void greet() {
        System.out.println("Hello from Child");
    }

    void callParentGreet() {
        Runnable runnable = super::greet;
        runnable.run();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.callParentGreet(); // Output: Hello from Parent
    }
}
```

Here, `super::greet` refers to the `greet` method of the superclass (`Parent`).

---

### 6. **Array Constructor Reference**

Refers to the constructor of an array.

#### Syntax:

```java
ClassName[]::new
```

#### Example:

```java
        // Using array constructor reference
        IntFunction<int[]> arrayCreator2 = int[]::new;
```

Here, `int[]::new` refers to the constructor of an `int` array.

---

### Summary of Uses

| Use Case                          | Syntax                          | Example                       |
| --------------------------------- | ------------------------------- | ----------------------------- |
| Static Method Reference           | `ClassName::staticMethodName`   | `Math::sqrt`                  |
| Instance Method Reference         | `objectReference::methodName`   | `System.out::println`         |
| Arbitrary Object Method Reference | `ClassName::instanceMethodName` | `String::compareToIgnoreCase` |
| Constructor Reference             | `ClassName::new`                | `ArrayList::new`              |
| Super Method Reference            | `super::methodName`             | `super::greet`                |
| Array Constructor Reference       | `ClassName[]::new`              | `int[]::new`                  |

---

### Key Points

- Method references are a shorthand for lambda expressions that call an existing method.
- They improve code readability and reduce boilerplate code.
- They can be used for static methods, instance methods, constructors, and arrays.
