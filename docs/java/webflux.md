# Introduction to Spring Boot Reactive Programming with WebFlux

Spring Boot's WebFlux module enables developers to create reactive, non-blocking, and scalable web applications using the principles of reactive programming. Below is a comprehensive guide covering key concepts, features, and code snippets for quick understanding.

---

## 1. What is Reactive Programming?

Reactive Programming is a programming paradigm centered around asynchronous data streams and the propagation of change. It allows applications to handle large volumes of data and traffic with fewer resources.

**Key Features:**

- **Asynchronous:** Enables non-blocking operations, ensuring that tasks do not wait unnecessarily for others to complete. This improves system responsiveness.
- **Event-driven:** Events drive the flow of data, allowing systems to react to changes dynamically.
- **Non-blocking:** Threads are not held up while waiting for results, optimizing resource usage and improving scalability.
- **Backpressure:** Provides mechanisms to handle data flow control between producers and consumers, preventing overwhelming slow consumers.

**Example Code:**

```java
import reactor.core.publisher.Flux;

public class ReactiveExample {
    public static void main(String[] args) {
        Flux<Integer> numbers = Flux.range(1, 5);
        numbers.map(num -> num * 2)
               .subscribe(System.out::println);
    }
}
```

**Key Points Learned:**

- Reactive streams are the backbone.
- `Flux` and `Mono` are the main reactive types.

---

## 2. Introduction to WebFlux

WebFlux is a Spring Boot module that supports building reactive web applications.

**Key Features:**

- **Non-blocking I/O:** Ensures threads are not blocked while waiting for I/O operations, enabling better resource utilization.
- **Declarative programming model:** Simplifies code with a functional, declarative style for processing streams of data.
- **Supports both annotation-based and functional endpoints:** Offers flexibility in designing APIs and routing mechanisms.

**Dependency:**

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
```

**Key Points Learned:**

- WebFlux replaces traditional `@RestController` with reactive counterparts.
- Handles asynchronous and streaming data efficiently.

---

## 3. Reactive Types: Mono and Flux

- **Mono**: Represents 0 or 1 item. It is used for operations like retrieving a single object or performing an action that produces a single result.
- **Flux**: Represents 0 to N items. Useful for handling collections or streams of data.

**Operators:**

- **`map`**: Transforms the data in the stream.
- **`flatMap`**: Asynchronously transforms and flattens the data.
- **`filter`**: Filters data based on a condition.

**Example Code:**

```java
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

public class ReactiveTypes {
    public static void main(String[] args) {
        Mono<String> singleValue = Mono.just("Hello, World!");
        Flux<Integer> multipleValues = Flux.range(1, 5);

        singleValue.subscribe(System.out::println);
        multipleValues.subscribe(System.out::println);
    }
}
```

**Key Points Learned:**

- Use `Mono` for single results and `Flux` for streams of data.
- Both support operators like `map`, `flatMap`, and `filter`.

---

## 4. Annotation-Based Programming with WebFlux

WebFlux supports annotations for defining reactive endpoints.

### Commonly Used Annotations

- **`@RestController`**: Marks a class as a controller where every method returns a domain object instead of a view.
- **`@GetMapping`**: Maps HTTP GET requests to specific methods.
- **`@PostMapping`**: Maps HTTP POST requests to specific methods.
- **`@PutMapping`**: Maps HTTP PUT requests to specific methods.
- **`@DeleteMapping`**: Maps HTTP DELETE requests to specific methods.
- **`@RequestBody`**: Binds the body of the HTTP request to a method parameter.
- **`@PathVariable`**: Binds a method parameter to a URI template variable.
- **`@RequestParam`**: Extracts query parameters from the URL.

**Example Code:**

```java
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ReactiveController {

    @GetMapping("/numbers")
    public Flux<Integer> getNumbers() {
        return Flux.range(1, 5);
    }

    @PostMapping("/echo")
    public Mono<String> echo(@RequestBody String input) {
        return Mono.just("Echo: " + input);
    }
}
```

**Key Points Learned:**

- Use `@RestController` and `@GetMapping` for reactive endpoints.
- Annotations simplify mapping of HTTP requests to methods.

---

## 5. Functional Programming Model

WebFlux also supports a functional approach for routing and handling requests.

**Example Code:**

```java
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Component
public class ReactiveRouter {

    @Bean
    public RouterFunction<ServerResponse> routes() {
        return route(GET("/numbers"), request ->
            ServerResponse.ok().body(Flux.range(1, 5), Integer.class));
    }
}
```

**Key Points Learned:**

- Use `RouterFunctions` for functional routing.
- Functional endpoints provide better separation of concerns.

---

## 6. Backpressure Handling

Reactive programming handles backpressure to ensure systems are not overwhelmed with data.

**Details:**

- **Backpressure Strategies:** Control the rate at which data is emitted.
  - **`onBackpressureBuffer`**: Buffers data when consumers are slower.
  - **`onBackpressureDrop`**: Drops excess data to maintain stability.

**Example Code:**

```java
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class BackpressureExample {
    public static void main(String[] args) {
        Flux.range(1, 1000)
            .onBackpressureBuffer()
            .publishOn(Schedulers.boundedElastic())
            .subscribe(System.out::println);
    }
}
```

**Key Points Learned:**

- Operators like `onBackpressureBuffer` help manage backpressure.
- Scheduler switching ensures thread-safe execution.

---

## 7. Testing in WebFlux

WebFlux provides tools to test reactive code effectively.

**Example Code:**

```java
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ReactiveTest {

    @Test
    public void testFlux() {
        Flux<Integer> numbers = Flux.range(1, 5);

        StepVerifier.create(numbers)
                    .expectNext(1, 2, 3, 4, 5)
                    .verifyComplete();
    }
}
```

**Key Points Learned:**

- Use `StepVerifier` to test reactive streams.
- Reactive testing ensures behavior under various conditions.

---

## 8. Integrating WebFlux with Databases

WebFlux integrates seamlessly with reactive database drivers like R2DBC or MongoDB.

**Example Code:**

```java
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<User, String> {
    Flux<User> findByName(String name);
}
```

**Key Points Learned:**

- Reactive repositories like `ReactiveCrudRepository` simplify database interactions.
- Supports backpressure and non-blocking calls.

---

## Summary of Key Points

1. **Reactive Programming Principles**: Focus on asynchronous streams.
2. **Mono and Flux**: Core types for single and multiple values.
3. **WebFlux Models**: Supports both annotation-based and functional programming.
4. **Backpressure**: Ensures system stability.
5. **Testing**: Use `StepVerifier` for effective testing.
6. **Database Integration**: Use reactive drivers and repositories.

By adopting Spring Boot WebFlux, developers can build highly scalable, efficient, and resilient web applications.
