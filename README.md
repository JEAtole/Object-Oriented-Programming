# Object-Oriented-Programming (OOP)

## FOUR BUILDING BLOCKS IN OOP


1. **Encapsulation** - the practice of bundling data (attributes) and methods (functions) that operate on that data into a single unit, usually a class, while restricting direct access to some of the object's components. This helps protect the internal state of an object and keeps it organized - what's inside is hidden unless you have the right access. 

Ex: Using private variables and accessing them through getters and setters.

2. **Abstraction** - means hiding complex implementation details and showing only the essential features of an object. It simplifies the interface and helps you focus on what an object does, not how it does it.

Ex: When you using a print() method, you don’t need to know how the printer works internally.

3. **Inheritance** - allows a class (child or subclass) to acquire properties and behaviors (methods and variables) from another class (parent or superclass). This promotes code reuse and establishes a natural hierarchy.

Ex: A Dog class can inherit from an Animal class.

4. Polymorphism - means that Objects can take many forms. The same method can behave differently depending on the object that is calling it.

Ex: A draw() method in a Shape class may work differently in Circle, Square, or Triangle classes.

Activities:

- COM Report Generator
- Game App
- Department Report Generator

---

## SOLID PRINCIPLES

Solid principles are design principles or guidelines for designing better OOP systems. It helps in designing cleaner, more maintainable, and scalable code.

1. **S - Single Responsibility Principle** -  A class should only have one job or reason to change. This means each class should handle only one part of the functionality, making it easier to maintain or update later without affecting unrelated parts.

Ex: A Report class shouldn't handle saving the report to a file. Instead, that should be the job of a separate FileSaver class.

2. **O - Open/Closed Principle** - Software should be open for extension but closed for modification. You should be able to add new features by extending existing code—not by changing the code that's already working.

Ex: Instead of modifying a class to support a new payment method, you can create a new class that extends the existing one.

3. **L - Liskov Substitution Principle** - Objects of a subclass should be able to replace objects of the superclass without breaking the application.

Ex: If Bird is a class and Sparrow is a subclass, you should be able to use Sparrow anywhere you use Bird, and it should behave correctly.

4. **I - Interface Segregation Principle** - Don’t force a class to implement methods it doesn’t need. It’s better to have several small, specific interfaces rather than one big, bloated interface.

Ex: Instead of a Worker interface with work() and eat() methods, split them into Workable and Eatable interfaces—so robots can implement Workable without needing an eat() method.

D - Dependency Inversion Principle: High-level modules (the brain) should not depend on low-level modules (the hands); both should depend on abstractions (the idea). This makes code more flexible and easier to test.

Ex: A class should use an interface for sending notifications instead of being tightly coupled with EmailSender or SMSSender.

Activities:

- Ordering System
- NEU Library