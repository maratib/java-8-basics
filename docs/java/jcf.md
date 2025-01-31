![JCF](https://miro.medium.com/v2/resize:fit:4800/format:webp/1*2hgLstie4gxpXUUzgAkGgg.png)

### What is the Java Collections Framework (JCF)?

The Java Collections Framework (JCF) is a unified architecture for storing, managing, and manipulating groups of objects in Java. It consists of:

1. **Interfaces**: Define the common behavior for various collection types (e.g., List, Set, Map).
2. **Implementations**: Concrete classes like ArrayList, HashSet, and HashMap that implement these interfaces.
3. **Algorithms**: Utility methods provided by the `Collections` class for performing operations like sorting and searching.

---

### Key Features of the Java Collections Framework

1. **Hierarchy**: Unified structure allows easy learning and interoperability.
2. **Generics**: Type safety to avoid runtime `ClassCastException`.
3. **Thread Safety**: Classes like `Vector` and `Hashtable` are synchronized.
4. **Performance**: Different implementations cater to different performance needs.
5. **Utility Methods**: Sorting, searching, and other algorithms provided by the `Collections` class.

---

### Core Interfaces in Java Collections Framework

1. **Collection**: Root interface for List, Set, and Queue.

   - Methods: `add()`, `remove()`, `size()`, `contains()`, etc.

2. **List**: Ordered collection allowing duplicates.

   - Implementations: `ArrayList`, `LinkedList`, `Vector`.

3. **Set**: Collection that does not allow duplicates.

   - Implementations: `HashSet`, `LinkedHashSet`, `TreeSet`.

4. **Queue**: Represents a collection for holding elements prior to processing.

   - Implementations: `PriorityQueue`, `ArrayDeque`.

5. **Map**: Key-value pair collection.
   - Implementations: `HashMap`, `TreeMap`, `LinkedHashMap`.

---

### Collection Implementations

#### 1. **List Implementations**

- **ArrayList**
  - Backed by a dynamic array.
  - Best for random access.
  - Not synchronized.

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
System.out.println(list);
```

- **LinkedList**
  - Backed by a doubly-linked list.
  - Efficient for frequent insertions and deletions.

```java
LinkedList<String> linkedList = new LinkedList<>();
linkedList.add("Dog");
linkedList.addFirst("Cat");
System.out.println(linkedList);
```

#### 2. **Set Implementations**

- **HashSet**
  - Uses a hash table for storage.
  - No guarantee of order.

```java
HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
System.out.println(set);
```

- **TreeSet**
  - Implements `NavigableSet` and provides sorted order.

```java
TreeSet<Integer> treeSet = new TreeSet<>();
treeSet.add(10);
treeSet.add(5);
System.out.println(treeSet);
```

#### 3. **Map Implementations**

- **HashMap**
  - Unordered key-value pairs.
  - Allows one `null` key and multiple `null` values.

```java
HashMap<Integer, String> map = new HashMap<>();
map.put(1, "One");
map.put(2, "Two");
System.out.println(map);
```

- **TreeMap**
  - Sorted key-value pairs.

```java
TreeMap<Integer, String> treeMap = new TreeMap<>();
treeMap.put(3, "Three");
treeMap.put(1, "One");
System.out.println(treeMap);
```

---

### Important Utility Classes

- **Collections**: Provides static methods for algorithms like sorting, searching, etc.

```java
List<Integer> nums = Arrays.asList(3, 1, 2);
Collections.sort(nums);
System.out.println(nums);
```

- **Arrays**: Provides methods for working with arrays, such as `asList()`.

---

### Common Scenarios

1. **Synchronization**
   - Use `Collections.synchronizedList()` for thread-safe operations.

```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

2. **Immutability**
   - Use `Collections.unmodifiableList()` for immutable collections.

```java
List<String> immutableList = Collections.unmodifiableList(Arrays.asList("A", "B"));
```

---

### Takeaways

1. Understand the hierarchy and purpose of key interfaces and classes.
2. Choose the right implementation based on performance needs (e.g., ArrayList vs LinkedList).
3. Leverage utility methods from `Collections` for common tasks.
4. Be mindful of thread safety when dealing with multi-threaded environments.

---

### 30 Most Asked Interview Questions on Java Collections Framework

1. **What is the Java Collections Framework?**

   - The Java Collections Framework is a unified architecture for managing collections of objects. It includes interfaces like List, Set, Map, their implementations like ArrayList, HashSet, and HashMap, and utility methods provided by the `Collections` class.

2. **Differentiate between Collection and Collections.**

   - `Collection` is an interface, while `Collections` is a utility class with static methods for operations like sorting, searching, and synchronizing collections.

3. **What are the core interfaces in the Java Collections Framework?**

   - Core interfaces are Collection, List, Set, Queue, Deque, and Map.

4. **What is the difference between List, Set, and Map?**

   - List: Ordered, allows duplicates.
   - Set: Unordered, no duplicates.
   - Map: Key-value pairs, no duplicate keys.

5. **Explain the differences between ArrayList and LinkedList.**

   - ArrayList is backed by a dynamic array, suitable for frequent read operations.
   - LinkedList uses a doubly-linked list, suitable for frequent insertions and deletions.

6. **How does HashSet ensure uniqueness?**

   - HashSet uses a hash table internally. It relies on the `hashCode()` and `equals()` methods to ensure unique elements.

7. **What is the difference between HashSet and TreeSet?**

   - HashSet does not maintain order, while TreeSet keeps elements sorted in natural order or using a custom comparator.

8. **What is a LinkedHashSet, and when to use it?**

   - LinkedHashSet maintains insertion order, useful when order matters.

9. **How does HashMap work internally?**

   - HashMap uses a hash table with buckets. Keys are hashed to locate the bucket, and `equals()` ensures key uniqueness.

10. **What is the difference between HashMap and TreeMap?**

    - HashMap is unordered, while TreeMap is sorted by natural order or a custom comparator.

11. **What is the load factor in HashMap?**

    - The load factor determines when to resize the hash table. Default is 0.75.

12. **Why is Hashtable synchronized?**

    - To support thread-safe operations by default, but it has lower performance than modern alternatives like ConcurrentHashMap.

13. **How does ConcurrentHashMap differ from HashMap?**

    - ConcurrentHashMap is thread-safe and divides its table into segments for better concurrency.

14. **What is the difference between fail-fast and fail-safe iterators?**

    - Fail-fast iterators throw `ConcurrentModificationException` if the collection is modified during iteration. Fail-safe iterators allow modifications.

15. **What are WeakHashMap and IdentityHashMap?**

    - WeakHashMap uses weak references for keys, allowing garbage collection. IdentityHashMap uses reference equality (==) instead of `equals()` for keys.

16. **Explain PriorityQueue with an example.**

    - A PriorityQueue orders elements based on natural order or a comparator.

    ```java
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(3);
    pq.add(1);
    pq.add(2);
    System.out.println(pq.poll()); // Outputs 1
    ```

17. **What is the difference between ArrayDeque and LinkedList?**

    - ArrayDeque is faster and more memory-efficient for deque operations, while LinkedList supports both deque and list operations.

18. **How to make a collection thread-safe?**

    - Use synchronized wrappers from `Collections` or concurrent collections like `ConcurrentHashMap`.

19. **What are the differences between Comparable and Comparator?**

    - Comparable is for natural ordering via `compareTo()`. Comparator defines custom order via `compare()`.

20. **How does `Collections.sort()` work?**

    - Uses merge sort (dual-pivot quicksort since Java 7) for sorting collections.

21. **What is the difference between synchronized collections and concurrent collections?**

    - Synchronized collections (e.g., `Collections.synchronizedList()`) lock the entire collection, while concurrent collections (e.g., `ConcurrentHashMap`) allow fine-grained locks.

22. **What is the purpose of the `NavigableSet` and `NavigableMap` interfaces?**

    - They provide navigation methods like `lower()`, `higher()`, `floor()`, and `ceiling()`.

23. **How to create an immutable collection in Java?**

    - Use methods like `Collections.unmodifiableList()` or `List.of()` (Java 9+).

24. **Explain the `iterator()` and `listIterator()` methods.**

    - `iterator()` provides forward traversal. `listIterator()` supports bidirectional traversal.

25. **What is the difference between peek(), poll(), and remove() methods in a Queue?**

    - `peek()` retrieves the head without removal, `poll()` retrieves and removes, and `remove()` throws an exception if the queue is empty.

26. **Explain the role of `Spliterator`.**

    - Spliterator is used for parallel processing of collections by splitting elements into chunks.

27. **What is the `Enumeration` interface, and how does it differ from Iterator?**

    - Enumeration is legacy and read-only. Iterator supports removal of elements.

28. **What are the advantages of using the Stream API with collections?**

    - Simplifies operations like filtering, mapping, and reducing with lazy evaluation and parallel processing.

29. **How is the `LinkedHashMap` different from `HashMap`?**

    - LinkedHashMap maintains insertion or access order.

30. **Why are generics important in collections?**
    - Generics provide type safety and eliminate the need for explicit type casting.
