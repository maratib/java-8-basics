# Jakarta EE Fundamentals

## 1. **What is Jakarta EE?**

Jakarta EE (formerly Java EE) is a set of specifications and standards for building enterprise-level applications in Java. It includes APIs for web services, security, persistence, messaging, and more.

## 2. **What is the difference between Jakarta EE and Java SE?**

- **Jakarta EE**: Focuses on enterprise applications and provides APIs for distributed, scalable, and transactional applications.
- **Java SE**: A standard platform for building standalone desktop applications and simple utilities.

## 3. **What is the role of the Jakarta EE Application Server?**

An application server provides runtime environments for Jakarta EE applications. It implements the Jakarta EE specifications and offers services like dependency injection, transaction management, and resource pooling.

## 4. **What are the main components of Jakarta EE?**

1. Web Profile (Servlets, JSP, JSF)
2. Enterprise JavaBeans (EJB)
3. Java API for RESTful Web Services (JAX-RS)
4. Java Persistence API (JPA)
5. Contexts and Dependency Injection (CDI)
6. Jakarta Messaging (JMS)

## 5. **What is CDI in Jakarta EE?**

Contexts and Dependency Injection (CDI) is a Jakarta EE specification that enables the dependency injection of objects and management of their lifecycle and contexts.

## 6. **Explain the Jakarta Servlet API.**

The Servlet API is used for handling HTTP requests and responses. It enables building dynamic web content and acts as the foundation for frameworks like JSP and JSF.

## 7. **What is a WAR file in Jakarta EE?**

A WAR (Web Application Archive) file packages web application resources (e.g., JSPs, servlets, and HTML files) along with configuration files for deployment in an application server.

## 8. **What is JPA, and why is it important?**

Java Persistence API (JPA) provides a standard way to manage relational data in Java applications. It simplifies database interactions using ORM (Object-Relational Mapping).

## 9. **What is the Jakarta Faces (JSF) framework?**

JSF is a UI framework in Jakarta EE that simplifies the creation of server-side user interfaces for web applications through reusable UI components.

## 10. **What is the purpose of the Jakarta RESTful Web Services (JAX-RS)?**

JAX-RS provides a specification for building RESTful web services in Jakarta EE using annotations and standard HTTP methods like GET, POST, PUT, and DELETE.

## 11. **What is Enterprise JavaBeans (EJB)?**

EJB is a Jakarta EE specification that provides a standard way to build scalable, transactional, and secure server-side components.

## 12. **What are the types of EJB?**

1. Stateless Session Beans
2. Stateful Session Beans
3. Singleton Session Beans
4. Message-Driven Beans

## 13. **What is Jakarta Messaging (JMS)?**

JMS provides APIs for sending and receiving messages between distributed systems, enabling asynchronous communication.

## 14. **What is the Jakarta Batch API?**

Jakarta Batch provides a specification for processing large volumes of data through batch jobs, including chunk and task-oriented processing.

## 15. **What is a DataSource in Jakarta EE?**

A DataSource represents a factory for database connections and is used for connection pooling, making database interactions more efficient.

## 16. **What is a Managed Bean?**

Managed Beans are simple Java objects with a lifecycle managed by the Jakarta EE container. They are commonly used in JSF and CDI contexts.

## 17. **What is the difference between JAX-RS and JAX-WS?**

- **JAX-RS**: For RESTful web services (stateless, lightweight, uses JSON/XML).
- **JAX-WS**: For SOAP-based web services (stateful or stateless, uses XML).

## 18. **What is a Deployment Descriptor?**

A deployment descriptor (e.g., `web.xml`) is an XML file used to configure Jakarta EE applications, such as defining servlets, filters, and security constraints.

## 19. **What is the Jakarta JSON Processing API?**

It provides APIs for parsing, generating, transforming, and querying JSON data in Jakarta EE applications.

## 20. **What is Jakarta Security?**

Jakarta Security simplifies authentication and authorization in Jakarta EE applications, providing APIs for managing security roles, permissions, and identity stores.

## 21. **What are the transaction management types in Jakarta EE?**

1. **Container-Managed Transactions (CMT)**: Handled by the application server.
2. **Bean-Managed Transactions (BMT)**: Explicitly managed by the developer using the JTA API.

## 22. **What is Jakarta Concurrency?**

Jakarta Concurrency provides APIs for executing tasks asynchronously, managing threads, and scheduling tasks in a Jakarta EE environment.

## 23. **What is the purpose of Jakarta Annotations?**

Annotations in Jakarta EE are used to simplify configuration, such as `@Inject` for dependency injection, `@Transactional` for transactions, and `@Path` for REST endpoints.

## 24. **What is the Jakarta Mail API?**

The Jakarta Mail API allows applications to send and receive emails programmatically using protocols like SMTP, POP3, and IMAP.

## 25. **What is a Persistence Unit in JPA?**

A persistence unit is a configuration entity in JPA that defines the data source, entity classes, and properties for database interactions, typically declared in `persistence.xml`.

## 26. **What are Servlets’ Lifecycle Methods?**

1. `init()`: Initializes the servlet.
2. `service()`: Handles client requests.
3. `destroy()`: Cleans up resources before shutting down.

## 27. **What is Jakarta EE MicroProfile?**

MicroProfile is a set of optimized APIs and standards for building cloud-native, microservice-based applications in Jakarta EE.

## 28. **What are Interceptors in Jakarta EE?**

Interceptors enable cross-cutting concerns (e.g., logging, security) to be applied declaratively to Jakarta EE components like beans or EJBs.

## 29. **What is the Jakarta WebSocket API?**

The WebSocket API enables real-time, full-duplex communication between clients and servers over a single TCP connection.

## 30. **What is Jakarta Server Pages (JSP)?**

JSP is a Jakarta EE technology used to create dynamic web content by embedding Java code into HTML pages.

# Jakarta EE CDI, Object lifecycle and contexts

## **1. What is Contexts and Dependency Injection (CDI) in Jakarta EE?**

CDI is a specification in Jakarta EE that provides a standard for dependency injection and contextual lifecycle management. It enables loose coupling between components through dependency injection, producer methods, and event mechanisms.

## **2. What are the primary features of CDI?**

1. Dependency Injection (DI)
2. Contextual lifecycle management
3. Type-safe injection
4. Event-based communication
5. Interceptors and decorators
6. Stereotypes

## **3. What is the difference between CDI and traditional Java EE dependency injection?**

CDI provides advanced features such as contextual lifecycle management, producer methods, and event handling, whereas traditional DI in Java EE (e.g., `@EJB`) is limited to simpler injection scenarios and lacks contextual awareness.

## **4. What are the built-in CDI scopes?**

1. `@ApplicationScoped`
2. `@SessionScoped`
3. `@RequestScoped`
4. `@ConversationScoped`
5. `@Dependent`

## **5. What is the default scope in CDI?**

The default scope is `@Dependent`. It means the bean lifecycle is tied to the client that injects it.

## **6. What is a CDI Bean?**

A CDI Bean is a managed component that is instantiated, managed, and injected by the CDI container. It must follow certain rules, such as having a no-argument constructor.

## **7. What is the purpose of the `@Inject` annotation?**

The `@Inject` annotation is used to perform dependency injection, allowing the CDI container to provide the required dependency automatically.

## **8. Explain `@Qualifier` in CDI.**

`@Qualifier` is used to distinguish between multiple beans of the same type. Custom qualifiers can be defined to inject specific implementations.

## **9. What is the use of the `@Produces` annotation?**

The `@Produces` annotation is used to create producer methods, which define how to produce instances of a specific type for injection.

## **10. What is the difference between `@Inject` and `@Produces`?**

`@Inject` is used to inject dependencies into a consumer, whereas `@Produces` is used to create instances of a type that cannot be directly instantiated by CDI.

## **11. What is the role of `@ApplicationScoped`?**

`@ApplicationScoped` defines a bean with a lifecycle that spans the entire application. The same instance is shared across all requests and sessions.

## **12. What is `@RequestScoped`?**

`@RequestScoped` defines a bean with a lifecycle tied to a single HTTP request.

## **13. What is `@SessionScoped`?**

`@SessionScoped` defines a bean with a lifecycle tied to an HTTP session. The same instance is shared across multiple requests in the same session.

## **14. What is `@ConversationScoped`?**

`@ConversationScoped` defines a bean whose lifecycle can span multiple requests within a conversation, managed explicitly using `Conversation` API.

## **15. What is `@Dependent` scope in CDI?**

`@Dependent` means the lifecycle of the bean is tied to the lifecycle of the client that injects it. A new instance is created for each injection.

## **16. What is a CDI Interceptor?**

A CDI Interceptor is a mechanism to implement cross-cutting concerns, such as logging or security, by intercepting method calls.

## **17. How is an interceptor defined in CDI?**

An interceptor is defined using `@Interceptor` on a class and a corresponding interceptor binding annotation (e.g., `@Loggable`).

## **18. What is a Decorator in CDI?**

A Decorator is used to extend the functionality of a bean by wrapping it. It is annotated with `@Decorator`.

## **19. What is an event in CDI?**

Events in CDI allow beans to communicate in a loosely coupled manner using the `Event` interface.

## **20. How do you fire a CDI event?**

Use the `Event` interface to fire events:

```java
@Inject
Event<MyEvent> event;

event.fire(new MyEvent());
```

## **21. How do you observe a CDI event?**

Use the `@Observes` annotation:

```java
public void onEvent(@Observes MyEvent event) {
    // Handle event
}
```

## **22. What are Stereotypes in CDI?**

Stereotypes are annotations that group common annotations, making beans easier to define and manage.

## **23. Explain the concept of `@Alternative` in CDI.**

`@Alternative` is used to mark a bean as an alternative implementation, which can be enabled in `beans.xml`.

## **24. What is the purpose of the `@Vetoed` annotation?**

`@Vetoed` is used to exclude a class from being managed by CDI.

## **25. How do you define a custom scope in CDI?**

1. Define a scope annotation with `@NormalScope`.
2. Create a corresponding `Context` implementation.
3. Register it in `beans.xml`.

## **26. What is `InjectionPoint` in CDI?**

`InjectionPoint` is used to access metadata about the injection point, such as qualifiers or type.

## **27. How does CDI manage object lifecycles?**

CDI manages object lifecycles based on their scopes (e.g., `@RequestScoped` creates one instance per request, `@ApplicationScoped` creates one per application lifecycle).

## **28. How do you enable CDI in a Jakarta EE project?**

Include a `beans.xml` file in the `WEB-INF` or `META-INF` directory.

## **29. Can CDI inject non-bean classes?**

No, CDI can only inject managed beans or objects produced by producer methods.

## **30. What is a proxy in CDI?**

A proxy is a wrapper object used by CDI for beans with a scope wider than `@Dependent`. It ensures proper lifecycle and contextual references.

# Jakarta EE Annotations

## 1. **What are Jakarta EE annotations?**

Annotations in Jakarta EE provide metadata for Java classes and methods, simplifying configuration and reducing XML use.

## 2. **What is the use of `@Entity` annotation?**

Marks a class as a JPA entity for database mapping.

## 3. **What is `@Table` used for?**

Specifies the table name in the database to which an entity is mapped.

- **Example**: `@Table(name = "users")`

## 4. **What does `@Id` signify in JPA?**

Marks a field as the primary key of the entity.

## 5. **What is the purpose of `@GeneratedValue`?**

Configures automatic generation of primary key values.

- **Example**: `@GeneratedValue(strategy = GenerationType.AUTO)`

## 6. **Explain `@Column` annotation.**

Maps a class field to a database column and customizes its attributes like name, nullable, etc.

## 7. **What is `@NamedQuery`?**

Defines a static query using JPQL that can be reused.

- **Example**: `@NamedQuery(name = "findAllUsers", query = "SELECT u FROM User u")`

## 8. **What is `@Transient`?**

Marks a field that should not be persisted in the database.

## 9. **What is the role of `@Lob`?**

Specifies that a field should be persisted as a large object, like BLOB or CLOB.

## 10. **What is `@Inject` in CDI?**

Injects a bean or resource into a class.

## 11. **Explain the use of `@Qualifier`.**

Differentiates between multiple beans of the same type for injection.

## 12. **What is `@Produces` in CDI?**

Exposes a producer method to create a custom bean for injection.

## 13. **Describe `@RequestScoped`.**

Defines a bean's scope to the lifespan of a single HTTP request.

## 14. **What is `@SessionScoped`?**

Defines a bean's scope to the lifespan of an HTTP session.

## 15. **Explain `@ApplicationScoped`.**

Defines a bean's scope to the lifespan of the application.

## 16. **What does `@Singleton` do?**

Specifies that a bean is instantiated only once per application.

## 17. **What is `@Path` in Jakarta RESTful Web Services (JAX-RS)?**

Defines the URI path for a RESTful resource.

## 18. **Explain `@GET`, `@POST`, `@PUT`, `@DELETE` in JAX-RS.**

Specifies the HTTP method for a resource method in a RESTful web service.

## 19. **What is the purpose of `@Produces` in JAX-RS?**

Specifies the response media type a method produces.

## 20. **What is the use of `@Consumes` in JAX-RS?**

Specifies the request media type a resource can accept.

## 21. **What is `@PathParam`?**

Injects a path parameter into a method argument in JAX-RS.

## 22. **What is `@QueryParam`?**

Injects a query parameter from the URL into a method argument in JAX-RS.

## 23. **What is the use of `@RequestBody`?**

Maps the HTTP request body to a method parameter.

## 24. **What does `@ApplicationPath` do in JAX-RS?**

Sets the base URI for the REST application.

## 25. **What is `@EJB` used for?**

Injects an Enterprise Java Bean (EJB) into a class.

## 26. **What is `@Schedule` in Jakarta EE?**

Defines a timer method to run at specified intervals.

## 27. **What is `@Resource` in Jakarta EE?**

Injects a resource, such as a datasource, into a class.

## 28. **Explain `@PreDestroy`.**

Defines a method to execute before a bean is destroyed.

## 29. **What is `@PostConstruct`?**

Defines a method to execute after a bean is initialized.

## 30. **What is the purpose of `@Interceptor`?**

Defines a class to intercept and handle method calls or lifecycle events.

# JSP

## 1. What is JSP?

JSP (JavaServer Pages) is a server-side technology used to create dynamic and platform-independent web applications. It allows embedding Java code into HTML pages using special tags like `<% %>`.

## 2. How is JSP different from Servlets?

- **JSP**: Designed for presentation and focuses on creating dynamic content with HTML, JavaScript, etc.
- **Servlets**: Java programs written entirely in Java, better for control and processing logic.
- JSP is more convenient for designing UI, whereas servlets handle backend logic.

## 3. What are JSP scripting elements?

JSP scripting elements allow embedding Java code in JSP pages. They include:

- **Declarations**: `<%! %>` for defining methods and variables.
- **Scriptlets**: `<% %>` for writing Java code inside JSP.
- **Expressions**: `<%= %>` for outputting values.

## 4. What are JSP directives? Name the types.

Directives provide global information about the JSP page. Types:

1. **Page Directive**: Defines page settings (e.g., `language`, `errorPage`).
   ```jsp
   <%@ page language="java" contentType="text/html" %>
   ```
2. **Include Directive**: Includes files at compile-time.
   ```jsp
   <%@ include file="header.jsp" %>
   ```
3. **Taglib Directive**: Declares a custom tag library.
   ```jsp
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   ```

## 5. What are JSP implicit objects?

Implicit objects are pre-defined objects in JSP accessible without explicit declaration:

- `request`, `response`, `session`, `application`, `out`, `config`, `pageContext`, `page`, `exception`.

## 6. What is the difference between `<jsp:include>` and `<%@ include %>`?

- `<jsp:include>`: Includes a resource at runtime.
- `<%@ include %>`: Includes a resource at compile-time.

## 7. What is the use of the `isELIgnored` attribute in JSP?

The `isELIgnored` attribute determines whether Expression Language (EL) is ignored in a JSP. By default, it's `false`.

```jsp
<%@ page isELIgnored="true" %>
```

## 8. What are custom tags in JSP?

Custom tags are user-defined tags created to encapsulate reusable functionality. They are defined in a tag library (TLD) and used in JSP pages with `<%@ taglib %>`.

## 9. Explain the JSP lifecycle.

1. **Translation**: JSP is translated into a servlet.
2. **Compilation**: The servlet is compiled into bytecode.
3. **Initialization**: The servlet is loaded and initialized.
4. **Execution**: The servlet processes requests.
5. **Destruction**: The servlet is removed from memory.

## 10. What is the role of `pageContext` in JSP?

`pageContext` is an implicit object that provides access to all JSP objects (request, response, session, etc.) and allows sharing data between them.

## 11. How can you handle exceptions in JSP?

- Use `errorPage` attribute to redirect to an error page.
  ```jsp
  <%@ page errorPage="error.jsp" %>
  ```
- In the error page, set `isErrorPage="true"`.
  ```jsp
  <%@ page isErrorPage="true" %>
  ```

## 12. What is the difference between `forward` and `sendRedirect`?

- **Forward**: Happens on the server side; the client is unaware.
- **SendRedirect**: Client-side redirection; the browser is redirected to a new URL.

## 13. What is JSTL?

JSTL (JavaServer Pages Standard Tag Library) is a collection of tags providing functionalities like conditional statements, loops, and internationalization.

## 14. How can you share data between JSP pages?

- **Request Scope**: `request.setAttribute("key", value);`
- **Session Scope**: `session.setAttribute("key", value);`
- **Application Scope**: `application.setAttribute("key", value);`

## 15. What are JSP actions?

JSP actions are XML tags used to control the behavior of the JSP engine. Examples:

- `<jsp:include>`: Includes a resource at runtime.
- `<jsp:useBean>`: Declares or references a JavaBean.
- `<jsp:setProperty>`: Sets properties for a bean.
- `<jsp:getProperty>`: Retrieves properties of a bean.

# JSTL

## 1. What is JSTL?

JSTL (JavaServer Pages Standard Tag Library) is a collection of standard tags that simplify JSP development. It provides core functionalities like iteration, conditionals, formatting, SQL interactions, and internationalization.

## 2. What are the main tag libraries provided by JSTL?

JSTL provides the following libraries:

- Core Tags (`c`): General-purpose tags like loops and conditionals.
- Formatting Tags (`fmt`): For number, date, and message formatting.
- SQL Tags (`sql`): For database interactions.
- XML Tags (`x`): For XML data processing.
- Function Tags (`fn`): For string operations.

## 3. What are the advantages of using JSTL?

- Reduces Java code in JSP files.
- Simplifies dynamic content generation.
- Promotes cleaner and more readable code.
- Supports internationalization and localization.

## 4. How do you import JSTL in a JSP file?

Add the JSTL library to your project, then include the following taglib directives in your JSP file:

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
```

## 5. What is the `<c:if>` tag used for?

The `<c:if>` tag is used for conditional execution of code.
Example:

```jsp
<c:if test="${user.loggedIn}">
    <p>Welcome, ${user.name}!</p>
</c:if>
```

## 6. How does the `<c:choose>` tag work?

The `<c:choose>` tag is used for conditional branching, similar to an `if-else` construct. It includes `<c:when>` and `<c:otherwise>` sub-tags.
Example:

```jsp
<c:choose>
    <c:when test="${user.age > 18}">
        <p>Adult</p>
    </c:when>
    <c:otherwise>
        <p>Minor</p>
    </c:otherwise>
</c:choose>
```

## 7. What is the purpose of the `<c:forEach>` tag?

The `<c:forEach>` tag is used to iterate over collections like arrays or lists.
Example:

```jsp
<c:forEach items="${items}" var="item">
    <p>${item}</p>
</c:forEach>
```

## 8. How is the `<c:out>` tag used?

The `<c:out>` tag is used to display data while escaping HTML and XML characters.
Example:

```jsp
<c:out value="${user.name}" />
```

## 9. What is the `<fmt:formatDate>` tag?

The `<fmt:formatDate>` tag formats date and time values.
Example:

```jsp
<fmt:formatDate value="${date}" pattern="yyyy-MM-dd" />
```

## 10. How do you use `<sql:query>` to execute a database query?

The `<sql:query>` tag executes SQL SELECT queries.
Example:

```jsp
<sql:query dataSource="${dataSource}" var="result">
    SELECT * FROM users
</sql:query>
<c:forEach var="row" items="${result.rows}">
    <p>${row.username}</p>
</c:forEach>
```

## 11. What is the `<fmt:setLocale>` tag used for?

The `<fmt:setLocale>` tag sets the locale for internationalization.
Example:

```jsp
<fmt:setLocale value="en_US" />
```

## 12. How does the `<fmt:message>` tag work?

The `<fmt:message>` tag retrieves localized messages from a resource bundle.
Example:

```jsp
<fmt:message key="welcome.message" />
```

## 13. What is the difference between `<c:forEach>` and `<c:forTokens>`?

- `<c:forEach>` iterates over a collection or array.
- `<c:forTokens>` iterates over tokens in a delimited string.
  Example for `<c:forTokens>`:

```jsp
<c:forTokens items="a,b,c" delims="," var="token">
    <p>${token}</p>
</c:forTokens>
```

## 14. What are some common JSTL functions provided by the `fn` library?

Some common functions are:

- `fn:contains()`: Checks if a string contains a substring.
- `fn:startsWith()`: Checks if a string starts with a specific prefix.
- `fn:length()`: Returns the length of a string or collection.
- `fn:toUpperCase()`: Converts a string to uppercase.

## 15. How do you handle errors using JSTL?

Use the `<c:catch>` tag to handle exceptions.
Example:

```jsp
<c:catch var="error">
    <sql:query dataSource="${dataSource}" var="result">
        SELECT * FROM invalid_table
    </sql:query>
</c:catch>
<c:if test="${not empty error}">
    <p>Error: ${error}</p>
</c:if>
```

# Servlets

## 1. **What is a Servlet?**

A Servlet is a Java program that runs on a web server or application server and acts as a middle layer between client requests and server responses. It is used to process and respond to HTTP requests in web applications.

## 2. **What are the key features of Servlets?**

- Platform-independent: Written in Java, Servlets are platform-independent.
- Performance: Servlets are faster than traditional CGI due to their multithreading capability.
- Robust: Built on Java, Servlets benefit from Java’s security and robustness.
- Integration: Easily integrate with databases and other server-side components.

## 3. **Explain the life cycle of a Servlet.**

1. **Loading and Instantiation**: The servlet class is loaded and an instance is created.
2. **Initialization**: `init()` method is called to initialize the servlet.
3. **Request Handling**: `service()` method is called to handle client requests.
4. **Destruction**: `destroy()` method is called before the servlet is removed from memory.

## 4. **What is the difference between `doGet()` and `doPost()` methods?**

- **`doGet()`**: Handles HTTP GET requests, used for retrieving data. Parameters are visible in the URL.
- **`doPost()`**: Handles HTTP POST requests, used for submitting data. Parameters are sent in the request body and are more secure.

## 5. **What is the `ServletConfig` interface?**

The `ServletConfig` interface is used to pass initialization parameters to a Servlet during startup. It allows access to configuration data from the deployment descriptor (web.xml).

## 6. **What is the `ServletContext` interface?**

`ServletContext` provides a way to access global information shared across the application. It allows servlets to communicate with one another and provides methods to access resources like files and configuration settings.

## 7. **How is session tracking managed in Servlets?**

Session tracking can be managed using:

- **Cookies**
- **URL Rewriting**
- **Hidden Form Fields**
- **HttpSession**

## 8. **What is the difference between `include()` and `forward()` in Servlets?**

- **`include()`**: Includes the content of another resource (e.g., JSP or Servlet) in the response.
- **`forward()`**: Forwards the request to another resource without returning to the current resource.

## 9. **What is a filter in Servlets?**

A filter is an object that performs filtering tasks on the request and response, such as logging, authentication, or compression. Filters are configured in the deployment descriptor (web.xml).

## 10. **What are the advantages of using Servlets over CGI?**

- Servlets are multithreaded, making them faster and more efficient.
- Memory management in Servlets is better, reducing overhead.
- Servlets are easier to write, maintain, and extend.

## 11. **What is the purpose of the `RequestDispatcher`?**

The `RequestDispatcher` interface allows one servlet to forward a request to another servlet or include content from another resource in the response.

## 12. **What are the major HTTP status codes you should know?**

- **200 OK**: Request succeeded.
- **404 Not Found**: Resource not found.
- **500 Internal Server Error**: Server encountered an error.
- **302 Found**: Redirect to a different URL.

## 13. **What is the difference between `GenericServlet` and `HttpServlet`?**

- **GenericServlet**: Protocol-independent, suitable for any type of service.
- **HttpServlet**: Specific to HTTP protocol, provides methods like `doGet()` and `doPost()`.

## 14. **How do you handle exceptions in Servlets?**

Exceptions in Servlets can be handled by:

- Using `try-catch` blocks in the servlet code.
- Configuring error pages in `web.xml` using the `<error-page>` element.

## 15. **What is the purpose of the `web.xml` file?**

The `web.xml` file (deployment descriptor) is used to:

- Define servlets and their mappings.
- Configure initialization parameters.
- Specify filters and listeners.
- Handle error pages.

# EJBs

## 1. **What is an EJB?**

Enterprise JavaBeans (EJB) is a server-side software component that encapsulates business logic in a Jakarta EE application. It simplifies the development of large-scale enterprise applications by managing transactions, security, and remote communication.

## 2. **What are the types of EJBs?**

- **Session Beans:** Stateful, Stateless, and Singleton.
- **Message-Driven Beans (MDB):** For asynchronous communication.

## 3. **What is the difference between Stateful and Stateless Session Beans?**

- **Stateful Session Beans:** Maintain client state across multiple method calls.
- **Stateless Session Beans:** Do not maintain any state between method calls.

## 4. **What is a Singleton Session Bean?**

A Singleton Session Bean is instantiated once per application and shared among all clients. It is used for application-wide shared data or initialization.

## 5. **What is the lifecycle of a Stateless Session Bean?**

1. Bean instantiated.
2. Dependency Injection occurs.
3. Business methods are invoked.
4. Bean ready for garbage collection.

## 6. **What are the transaction management options in EJB?**

- **Container-Managed Transactions (CMT):** Managed by the EJB container.
- **Bean-Managed Transactions (BMT):** Managed explicitly by the developer using `javax.transaction.UserTransaction`.

## 7. **What is the role of `@Stateless` annotation?**

The `@Stateless` annotation is used to define a Stateless Session Bean, indicating it does not maintain a conversational state with clients.

## 8. **How do EJBs handle security?**

EJBs handle security via declarative security (annotations like `@RolesAllowed`, `@PermitAll`, and `@DenyAll`) or programmatic security using `EJBContext`.

## 9. **What is `@EJB` annotation?**

The `@EJB` annotation is used to inject an EJB reference into a client or another EJB.

## 10. **What is an MDB (Message-Driven Bean)?**

MDB is an EJB component that processes messages asynchronously from a messaging system like JMS.

## 11. **How is an MDB configured?**

An MDB is configured using the `@MessageDriven` annotation and a JMS destination (queue or topic).

## 12. **What is the purpose of `@Lock` in Singleton Beans?**

The `@Lock` annotation specifies concurrency control for Singleton Beans, with values like `@Lock(LockType.WRITE)` for exclusive access and `@Lock(LockType.READ)` for shared access.

## 13. **What is the difference between `@Timeout` and `@Schedule`?**

- **`@Timeout`:** Used in conjunction with a Timer Service to handle single or recurring timer expirations.
- **`@Schedule`:** Used for declarative, calendar-based scheduling in Singleton Beans.

## 14. **What is Dependency Injection in EJB?**

Dependency Injection simplifies resource lookup by automatically injecting required resources (like other beans, data sources) using annotations like `@EJB`, `@Inject`, or `@Resource`.

## 15. **What is the difference between local and remote EJB interfaces?**

- **Local Interface:** Used when the client and the EJB run in the same JVM.
- **Remote Interface:** Used when the client and the EJB run in different JVMs.

## 16. **What is an Interceptor in EJB?**

Interceptors are used to encapsulate cross-cutting concerns (e.g., logging, auditing) and are defined using `@Interceptor` and `@AroundInvoke`.

## 17. **What is EJB Timer Service?**

EJB Timer Service provides functionality to schedule timed events for EJBs, such as executing tasks at a specific time or interval.

## 18. **What is `EJBContext`?**

`EJBContext` provides access to container-related functionality, such as transaction management, security, and environment lookup.

## 19. **What is the role of `@Asynchronous` in EJB?**

The `@Asynchronous` annotation allows a method to execute asynchronously, returning control to the client immediately.

## 20. **How do you declare an EJB local interface?**

A local interface is declared using the `@Local` annotation.  
Example:

```java
@Local
public interface MyLocalInterface {
    void performTask();
}
```

## 21. **What is the purpose of `@PreDestroy` and `@PostConstruct`?**

- **`@PostConstruct`:** Called after the bean is initialized and dependencies are injected.
- **`@PreDestroy`:** Called before the bean is removed or destroyed.

## 22. **What is EJB Passivation?**

Passivation is the process of saving the state of a Stateful Session Bean to free up memory and restore it when needed.

## 23. **What is EJB Pooling?**

EJB Pooling is a mechanism where a pool of bean instances is maintained to handle multiple client requests efficiently, improving performance.

## 24. **How do EJBs integrate with JPA?**

EJBs can integrate with JPA to manage persistence. For example, an EJB can use `@PersistenceContext` to inject an EntityManager for database operations.

## 25. **What are the benefits of using EJBs?**

- Simplified development of distributed systems.
- Automatic transaction management.
- Security management.
- Scalability and high availability.
- Integration with Jakarta EE technologies.

# JBoss WildFly

## 1. **What is JBoss WildFly?**

JBoss WildFly is a lightweight, flexible, and high-performance application server used for building and deploying Java-based applications.

## 2. **What are the key features of WildFly?**

- Modular architecture
- Lightweight runtime
- Support for Java EE/Jakarta EE standards
- Management using CLI, web console, and REST API
- Clustering and scalability

## 3. **What is the difference between JBoss EAP and WildFly?**

JBoss EAP is the commercially supported version of the open-source WildFly project, with additional features for production use.

## 4. **How do you deploy an application in WildFly?**

Applications can be deployed using:

- Web console
- Command Line Interface (CLI)
- Drag-and-drop in the `deployments` folder
- Admin API

## 5. **Explain the role of the `standalone.xml` and `domain.xml` files.**

- `standalone.xml`: Used for standalone server configurations.
- `domain.xml`: Used in domain mode to manage multiple servers centrally.

## 6. **What is a domain controller in WildFly?**

A domain controller is a central process in domain mode that manages configuration and deployment across multiple servers.

## 7. **What is the purpose of the Undertow subsystem in WildFly?**

Undertow is a lightweight and highly scalable web server and servlet container used in WildFly to handle HTTP requests.

## 8. **How can you manage WildFly remotely?**

WildFly can be managed remotely via:

- Management CLI (`jboss-cli.sh`)
- Web admin console
- Management API

## 9. **What is a datasource in WildFly?**

A datasource is a configuration that connects the application server to a database, allowing applications to interact with the database seamlessly.

## 10. **How do you configure logging in WildFly?**

Logging can be configured via the `logging` subsystem in the XML configuration files (`standalone.xml` or `domain.xml`) or through the admin console.

## 11. **What are subsystems in WildFly?**

Subsystems are modular components within WildFly that provide specific functionalities, such as messaging, transactions, security, and web services.

## 12. **Explain the WildFly management CLI.**

The CLI is a command-line tool (`jboss-cli.sh`) that allows administrators to manage WildFly configurations, deployments, and runtime operations interactively or via scripts.

## 13. **What is the role of the HornetQ/ActiveMQ subsystem?**

HornetQ (replaced by ActiveMQ in newer versions) is used to provide messaging services, enabling asynchronous communication between application components.

## 14. **How does WildFly ensure scalability?**

WildFly supports clustering, load balancing, and distributed deployments, which help in scaling applications horizontally across multiple servers.

## 15. **What is the purpose of the `jboss-cli.sh` file?**

`jboss-cli.sh` is the script to start the Command Line Interface (CLI) tool used for managing and configuring the WildFly server.
