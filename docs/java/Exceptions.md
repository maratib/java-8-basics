# Java Exception Handling

### Throwable, Error, and Exception

![Throwable](https://java8.info/images/exceptionhierarchy.jpg)

Java organizes its error-handling mechanism into a class hierarchy under the **`Throwable`** class.

---

### 1. **Throwable**

- **Definition**: The base class for all errors and exceptions in Java.
- **Purpose**: Provides the root framework for objects that can be "thrown" and "caught" in Java programs.
- **Direct Subclasses**:
  - **Error**: Indicates serious problems the application should not try to handle.
  - **Exception**: Represents conditions that an application might want to catch and handle.

**Key Methods in `Throwable`:**

- `getMessage()`: Returns a detailed message about the exception.
- `printStackTrace()`: Prints the stack trace to help diagnose the error.
- `getCause()`: Returns the cause of the exception.

---

### 2. **Error**

- **Definition**: Represents severe issues related to the runtime environment that an application typically cannot recover from.
- **Examples**:
  - **`OutOfMemoryError`**: Thrown when the JVM runs out of memory.
  - **`StackOverflowError`**: Occurs when the call stack exceeds its limit (e.g., due to infinite recursion).

**Characteristics**:

- Errors are not meant to be caught or handled programmatically.
- Mostly caused by JVM or hardware failures.

**Example of `Error`:**

```java
public class ErrorExample {
    public static void main(String[] args) {
        main(args); // Causes StackOverflowError
    }
}
```

---

### 3. **Exception**

- **Definition**: Represents conditions that an application can reasonably expect to handle.
- **Examples**:
  - **Checked Exceptions**: `IOException`, `SQLException`
  - **Unchecked Exceptions**: `NullPointerException`, `ArithmeticException`

**Characteristics**:

- Divided into **checked exceptions** (compile-time) and **unchecked exceptions** (runtime).
- Handled using `try-catch-finally` or declared using `throws`.

**Example of `Exception`:**

```java
import java.io.File;
import java.io.FileReader;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
```

---

### 4. **Hierarchy of Throwable**

Here’s the simplified hierarchy:

```
java.lang.Object
   |
   +-- java.lang.Throwable
        |
        +-- java.lang.Error
        |     +-- OutOfMemoryError
        |     +-- StackOverflowError
        |
        +-- java.lang.Exception
              +-- IOException (Checked)
              +-- SQLException (Checked)
              +-- RuntimeException (Unchecked)
                   +-- NullPointerException
                   +-- ArrayIndexOutOfBoundsException
                   +-- ArithmeticException
```

---

### **Explanation of the Hierarchy**

1. **Object**: The base class of all Java classes.
2. **Throwable**: Base class for anything that can be thrown as an exception or error.
3. **Error**: Severe, unrecoverable conditions.
4. **Exception**: Recoverable or manageable problems in the program.
   - **Checked Exceptions**: Must be handled at compile-time.
   - **Unchecked Exceptions**: Occur at runtime due to logical errors in the code.

---

### Key Takeaways

1. **`Throwable`** is the root of all exceptions and errors.
2. **`Error`** represents severe, system-level failures (unrecoverable).
3. **`Exception`** is for application-level issues (recoverable).
4. Use **`custom exceptions`** for domain-specific error handling.

### Java Exception Handling

Java uses a structured approach to handle runtime errors in a program, allowing developers to separate error-handling code from the main program logic. Here's a simplified overview:

1. **Key Constructs:**
   - `try`: Wraps code that may throw exceptions.
   - `catch`: Handles specific exceptions thrown within the `try` block.
   - `finally`: Executes code after the `try` and `catch`, regardless of whether an exception occurred.
   - `throw`: Used to explicitly throw an exception.
   - `throws`: Declares exceptions that a method might throw.

---

### Types of Exceptions in Java

#### 1. **Checked Exceptions**

- These are exceptions checked at compile time.
- If a method can throw a checked exception, it must either handle it with a `try-catch` block or declare it with the `throws` keyword.
- **Examples**: `IOException`, `SQLException`

**Example:**

```java
import java.io.File;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
```

#### 2. **Unchecked Exceptions**

- These are exceptions that occur at runtime and are not checked during compilation.
- Caused by programming errors like accessing invalid array indices or null pointer dereferences.
- **Examples**: `NullPointerException`, `ArrayIndexOutOfBoundsException`

**Example:**

```java
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // Will throw ArrayIndexOutOfBoundsException
    }
}
```

#### 3. **Errors**

- Serious issues typically related to the environment in which the application is running.
- Errors are not meant to be caught or handled in the application.
- **Examples**: `StackOverflowError`, `OutOfMemoryError`

**Example:**

```java
public class ErrorExample {
    public static void main(String[] args) {
        main(args); // Recursive call leads to StackOverflowError
    }
}
```

---

### Custom Exceptions in Java

Custom exceptions are user-defined exceptions tailored for specific use cases. They extend the `Exception` class (for checked exceptions) or the `RuntimeException` class (for unchecked exceptions).

#### Steps to Create a Custom Exception:

1. Extend `Exception` or `RuntimeException`.
2. Provide constructors as needed.

**Example of a Checked Custom Exception:**

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomCheckedException {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
```

**Example of an Unchecked Custom Exception:**

```java
class InvalidInputException extends RuntimeException {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class CustomUncheckedException {
    public static void validateInput(String input) {
        if (input == null || input.isEmpty()) {
            throw new InvalidInputException("Input cannot be null or empty.");
        }
    }

    public static void main(String[] args) {
        validateInput(""); // Will throw InvalidInputException
    }
}
```

---

### Easy to Remember Order

1. **Types of Exceptions**:
   - Checked
   - Unchecked
   - Errors
2. **Key Constructs**:
   - `try-catch-finally`
   - `throw` and `throws`
3. **Custom Exceptions**:
   - Checked custom exception
   - Unchecked custom exception
