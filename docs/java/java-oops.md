## 1. What is Object-Oriented Programming (OOP)?

OOP is a programming paradigm based on the concept of "objects," which can contain data (fields) and methods (functions). It aims to organize software design around data, or objects, rather than functions and logic. The four main principles of OOP are:

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

## 2. What are the four main pillars of OOP?

The four main pillars of OOP are:

- **Encapsulation**: Bundling the data (fields) and methods (functions) into a single unit called a class and restricting access to certain components.
- **Inheritance**: A mechanism where a new class (child) inherits properties and behavior from an existing class (parent).
- **Polymorphism**: The ability of a class to take on many forms. It allows objects to be treated as instances of their parent class.
- **Abstraction**: Hiding the implementation details and showing only the necessary functionality.

## 3. What is a class in Java?

A class is a blueprint for creating objects. It defines a set of attributes (fields) and behaviors (methods) that the objects created from the class will have.

## 4. What is an object in Java?

An object is an instance of a class. It has states (fields/variables) and behaviors (methods) defined in the class.

## 5. What is encapsulation?

Encapsulation is the practice of wrapping data (fields) and methods (functions) into a single unit, or class, and restricting access to some of the object's components. This is typically done using access modifiers (private, public, protected).

## 6. What are access modifiers in Java?

Access modifiers determine the visibility and accessibility of classes, methods, and variables. Java provides the following access modifiers:

- **public**: Accessible from anywhere.
- **private**: Accessible only within the same class.
- **protected**: Accessible within the same package and subclasses.
- **default**: If no access modifier is specified, it is accessible only within the same package.

## 7. What is inheritance in Java?

Inheritance is a mechanism where a new class (child) derives properties and behaviors (methods) from an existing class (parent). It allows for code reuse and creates a hierarchical relationship between classes.

## 8. What is the difference between "extends" and "implements" in Java?

- **extends**: Used when a class is inheriting from another class (single inheritance).
- **implements**: Used when a class implements an interface.

## 9. What is polymorphism in Java?

Polymorphism is the ability of an object to take on many forms. It allows one interface to be used for a general class of actions, with specific action details defined by subclasses.

## 10. What is the difference between method overloading and method overriding?

- **Method Overloading**: Defining multiple methods with the same name but different parameters in the same class.
- **Method Overriding**: A subclass provides a specific implementation of a method that is already defined in its parent class.

## 11. What is abstraction in Java?

Abstraction is the concept of hiding the complex implementation details and showing only the necessary functionality to the user. In Java, this is achieved using abstract classes and interfaces.

## 12. What is an abstract class in Java?

An abstract class is a class that cannot be instantiated on its own and must be subclassed. It can have abstract methods (without implementation) and concrete methods (with implementation).

## 13. What is an interface in Java?

An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. It cannot contain instance fields or constructors.

## 14. What is the difference between an interface and an abstract class?

- An **abstract class** can have both abstract (without implementation) and concrete (with implementation) methods.
- An **interface** can only have abstract methods (until Java 8, which added default and static methods).
- A class can implement multiple interfaces, but can only inherit from one abstract class.

## 15. What is constructor in Java?

A constructor is a special method used to initialize objects. It has the same name as the class and is called when an object of that class is created.

## 16. What is the difference between a constructor and a method in Java?

- A **constructor** initializes an object when it is created and does not have a return type.
- A **method** defines behavior and can be called on an object after it is created.

## 17. What is method overriding in Java?

Method overriding is when a subclass provides a specific implementation of a method that is already defined in the parent class. The method signature must be the same in both the subclass and the parent class.

## 18. What is the "super" keyword in Java?

The **super** keyword refers to the superclass (parent class) of the current object. It is used to access parent class methods, fields, and constructors.

## 19. What is "this" keyword in Java?

The **this** keyword refers to the current instance of the class. It is often used to refer to instance variables when they are shadowed by method parameters.

## 20. What is a static keyword in Java?

The **static** keyword is used for class-level variables and methods, which means they can be accessed without creating an instance of the class. Static members are shared by all instances of the class.

## 21. What is a singleton class in Java?

A singleton class is a class that allows only one instance to be created. It provides a global point of access to that instance.

## 22. What is the difference between "== " and ".equals()" in Java?

- **"=="** checks if two references point to the same object in memory.
- **".equals()"** checks if two objects are meaningfully equal based on their content.

## 23. What is a final keyword in Java?

The **final** keyword can be used to:

- Declare constants (final variables).
- Prevent method overriding (final methods).
- Prevent inheritance (final classes).

## 24. What is a package in Java?

A package is a group of related classes and interfaces. It helps organize code and prevent naming conflicts. Java has built-in packages like `java.util` and `java.io`.

## 25. What is the difference between a class and an interface in Java?

- A **class** can have both state (fields) and behavior (methods).
- An **interface** can only have method signatures and constants (until Java 8, which added default and static methods).

## 26. What is a Java Bean?

A Java Bean is a reusable software component that follows certain conventions: it has a no-argument constructor, private fields, and public getter and setter methods.

## 27. What is the use of the "instanceof" keyword in Java?

The **instanceof** keyword checks if an object is an instance of a specific class or implements a specific interface.

## 28. What is the difference between a "normal" class and a "final" class in Java?

A **final class** cannot be extended, whereas a "normal" class can be subclassed.

## 29. What is a default constructor in Java?

A **default constructor** is a constructor that has no parameters. If no constructor is explicitly defined in a class, Java provides a default constructor that initializes all instance variables to their default values.

## 30. What are the advantages of OOP?

The advantages of OOP include:

- **Code Reusability**: Through inheritance.
- **Scalability**: Easy to add new functionality.
- **Maintainability**: Easier to maintain and update code.
- **Modularity**: Dividing code into smaller, manageable units (objects).
