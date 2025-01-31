## 1. What is Hibernate?

Hibernate is an open-source, lightweight Object-Relational Mapping (ORM) tool. It simplifies data interaction between Java applications and relational databases by mapping Java objects to database tables.

## 2. What are the advantages of using Hibernate?

- Automatic table creation
- Database-independent queries with HQL
- Lazy initialization
- Caching for optimized performance
- Support for annotations
- Simplified complex joins

## 3. What is an ORM?

ORM stands for Object-Relational Mapping. It is a programming technique to convert data between incompatible systems using object-oriented programming languages.

## 4. What are the key components of Hibernate architecture?

- **SessionFactory**
- **Session**
- **Transaction**
- **Query**
- **Configuration**

## 5. What is a Session in Hibernate?

A `Session` is a lightweight, single-threaded object used to interact with the database. It represents a unit of work.

## 6. What is a SessionFactory?

A `SessionFactory` is a factory for `Session` objects. It is a heavyweight object and should be created once per database.

## 7. What is the difference between `get()` and `load()`?

- **`get()`**: Returns `null` if the object is not found.
- **`load()`**: Throws `ObjectNotFoundException` if the object is not found.

## 8. What are persistent, detached, and transient states in Hibernate?

- **Transient**: Not associated with a session.
- **Persistent**: Associated with a session.
- **Detached**: Previously associated with a session, but now disconnected.

## 9. What is HQL?

HQL (Hibernate Query Language) is an object-oriented query language that operates on persistent objects and their properties.

## 10. What are the core interfaces of Hibernate?

- Configuration
- SessionFactory
- Session
- Query
- CriteriaBuilder
- Transaction

## 11. What is the purpose of the Configuration object?

The `Configuration` object is used to configure Hibernate by loading configuration files like `hibernate.cfg.xml` and mapping files.

## 12. What is the difference between `save()` and `persist()`?

- **`save()`**: Returns the identifier and can be called outside a transaction.
- **`persist()`**: Does not return the identifier and must be used within a transaction.

## 13. How does Hibernate handle caching?

Hibernate supports two levels of caching:

1. **First-level cache** (Session cache)
2. **Second-level cache** (Shared across sessions, e.g., Ehcache, Infinispan)

## 14. What is Lazy Loading in Hibernate?

Lazy Loading delays the loading of associated data until it is accessed.

## 15. How does Hibernate implement relationships?

Using annotations like:

- **`@OneToOne`**
- **`@OneToMany`**
- **`@ManyToOne`**
- **`@ManyToMany`**

## 16. What is the use of `@Entity` annotation in Hibernate?

The `@Entity` annotation is used to specify that a class is a Hibernate entity.

## 17. What is the difference between Criteria and HQL?

- **Criteria**: Programmatic and dynamic.
- **HQL**: String-based and static.

## 18. What is a proxy object in Hibernate?

A proxy object is a placeholder for an actual entity object. It is used for lazy loading.

## 19. What is cascading in Hibernate?

Cascading propagates operations like persist, merge, remove, etc., from a parent entity to its associated entities.

## 20. How do you configure Hibernate?

Hibernate can be configured using:

1. XML files (`hibernate.cfg.xml`)
2. Java-based annotations

## 21. What is the difference between `merge()` and `update()`?

- **`merge()`**: Works on detached objects and creates a copy.
- **`update()`**: Works only on persistent objects.

## 22. What is the difference between `Session.save()` and `Session.saveOrUpdate()`?

- **`save()`**: Inserts a new record.
- **`saveOrUpdate()`**: Updates if the record exists; otherwise, inserts.

## 23. What are native SQL queries in Hibernate?

Native SQL queries allow executing SQL directly in Hibernate using the `createSQLQuery()` method.

## 24. What is a Named Query in Hibernate?

A Named Query is a predefined HQL or SQL query defined using `@NamedQuery`.

## 25. What is the `Interceptor` in Hibernate?

An `Interceptor` is used to intercept and modify Hibernate operations, like pre-insert or post-update.

## 26. What is the difference between optimistic and pessimistic locking?

- **Optimistic Locking**: Checks for changes using versioning.
- **Pessimistic Locking**: Locks a record to prevent updates by others.

## 27. What is the purpose of the `@Id` annotation in Hibernate?

The `@Id` annotation specifies the primary key of an entity.

## 28. How does Hibernate handle inheritance?

Using:

- **Table per class hierarchy**
- **Table per subclass**
- **Table per concrete class**

## 29. What is the `Session.clear()` method used for?

The `clear()` method removes all objects from the first-level cache.

## 30. How can you integrate Hibernate with Spring?

Hibernate can be integrated with Spring using `HibernateTemplate` or `SessionFactory` beans.

```

Feel free to adapt the answers as needed for specific contexts!
```
