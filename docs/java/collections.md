### Java Collections Utility Class Overview

The `Collections` utility class in Java belongs to the `java.util` package. It provides static methods for operating on or returning collections. These methods are often used for sorting, searching, reversing, and other utility tasks.

### **Most Used Methods**

Here’s a list of some frequently used methods in the `Collections` class, along with short, easy-to-understand examples.

#### 1. **`sort(List<T> list)`**

Sorts the specified list into ascending order.

```java
List<Integer> numbers = Arrays.asList(5, 1, 3, 7, 2);
Collections.sort(numbers);
System.out.println(numbers); // Output: [1, 2, 3, 5, 7]
```

**Takeaway:** Use `sort` to organize elements in ascending order.

---

#### 2. **`reverse(List<?> list)`**

Reverses the order of the elements in the specified list.

```java
List<String> words = Arrays.asList("apple", "banana", "cherry");
Collections.reverse(words);
System.out.println(words); // Output: [cherry, banana, apple]
```

**Takeaway:** Use `reverse` to flip the order of elements in a list.

---

#### 3. **`shuffle(List<?> list)`**

Randomly permutes the elements in the list.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
Collections.shuffle(numbers);
System.out.println(numbers); // Output: [3, 5, 1, 4, 2] (varies)
```

**Takeaway:** Use `shuffle` to mix up the elements.

---

#### 4. **`binarySearch(List<? extends Comparable<? super T>>, T key)`**

Performs a binary search for a key in a sorted list.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int index = Collections.binarySearch(numbers, 3);
System.out.println(index); // Output: 2
```

**Takeaway:** Use `binarySearch` to efficiently find an element in a sorted list.

---

#### 5. **`max(Collection<? extends T>)` and `min(Collection<? extends T>)`**

Find the maximum and minimum elements in a collection.

```java
List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
System.out.println(Collections.max(numbers)); // Output: 40
System.out.println(Collections.min(numbers)); // Output: 10
```

**Takeaway:** Use `max` and `min` to retrieve the largest or smallest element.

---

#### 6. **`frequency(Collection<?> c, Object o)`**

Counts the occurrences of a specific element in the collection.

```java
List<String> words = Arrays.asList("apple", "banana", "apple", "cherry");
System.out.println(Collections.frequency(words, "apple")); // Output: 2
```

**Takeaway:** Use `frequency` to count occurrences of an element.

---

#### 7. **`fill(List<? super T> list, T obj)`**

Replaces all elements of the list with the specified object.

```java
List<String> words = Arrays.asList("a", "b", "c");
Collections.fill(words, "x");
System.out.println(words); // Output: [x, x, x]
```

**Takeaway:** Use `fill` to replace all elements in a list with a single value.

---

#### 8. **`copy(List<? super T> dest, List<? extends T> src)`**

Copies all elements from one list into another.

```java
List<String> src = Arrays.asList("a", "b", "c");
List<String> dest = Arrays.asList("x", "y", "z");
Collections.copy(dest, src);
System.out.println(dest); // Output: [a, b, c]
```

**Takeaway:** Use `copy` to copy elements from one list to another.

---

#### 9. **`unmodifiableList(List<? extends T> list)`**

Returns an unmodifiable view of the specified list.

```java
List<String> words = Collections.unmodifiableList(Arrays.asList("a", "b", "c"));
System.out.println(words); // Output: [a, b, c]
```

**Takeaway:** Use `unmodifiableList` to create read-only collections.

---

#### 10. **`swap(List<?> list, int i, int j)`**

Swaps the elements at the specified positions.

```java
List<String> words = Arrays.asList("apple", "banana", "cherry");
Collections.swap(words, 0, 2);
System.out.println(words); // Output: [cherry, banana, apple]
```

**Takeaway:** Use `swap` to exchange two elements in a list.

---

### Top 10 Java Interview Questions on Collections

1. **What is the `Collections` utility class in Java?**

   - It’s a part of `java.util` that provides static methods for common collection-related tasks like sorting, searching, and modifying collections.

2. **How does `Collections.sort()` work?**

   - It sorts the elements in natural order using the `compareTo` method of `Comparable`.

3. **What is the purpose of `Collections.reverse()`?**

   - It reverses the order of elements in a list.

4. **What are the differences between `Collections` and `Collection`?**

   - `Collection` is an interface, while `Collections` is a utility class.

5. **Can you explain `binarySearch` in the `Collections` class?**

   - It performs a binary search on a sorted list and returns the index of the key.

6. **What does `Collections.unmodifiableList()` do?**

   - It creates a read-only view of the specified list.

7. **How is `shuffle()` used in the `Collections` class?**

   - It randomly reorders the elements in a list.

8. **What is the use of `frequency()` in the `Collections` class?**

   - It counts the number of times a specific element appears in a collection.

9. **How does `swap()` work in the `Collections` class?**

   - It swaps two elements in a list based on their indices.

10. **When should you use `Collections.fill()`?**
    - When you need to replace all elements in a list with the same value.
