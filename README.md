# Design-Patterns-

# Introduction

Design patterns are solutions to recurring problems; guidelines on how to tackle certain problems. 
The architecture of the solution to this problem in such a way that it can be used thousands of times.
Enables successful description of types of recurring solutions to common problems in types of situations
They are not classes, packages or libraries that you can plug into your application and wait for the magic to happen. These are, rather, guidelines on how to tackle certain problems in certain situations.

# Types of Design Patterns
 - Creational
 - Structural
 - Behavioral

# Creational Design Patterns
Creational design patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed, and represented.

- Abstract Factory
- Builder
- Factory Method
- Prototype
- Property
- Singleton
- Multiton
- Object Pool
# Structural Patterns
Structural patterns are concerned with how classes and objects are composed to form larger structures.

- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy
- Service Locator
- Servant
- Event Aggregator
# Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilites between objects.

- Chain of responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State

# Designs Patterns in this Repository

1. Strategy pattern
Intent: Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
Applicability: Use the Strategy pattern when

- many related classes differ only in their behavior. Strategies provide a way to configure a class either one of many behaviors
- you need different variants of an algorithm. for example, you might define algorithms reflecting different space/time trade-offs. Strategies can be used when these variants are implemented as a class hierarchy of algorithms
- an algorithm uses data that clients shouldn't know about. Use the Strategy pattern to avoid exposing complex, algorithm-specific data structures
- a class defines many behaviors, and these appear as multiple conditional statements in its operations. Instead of many conditionals, move related conditional branches into their own Strategy class.
Generaly speaking this is the class diagram of the strategy pattern
![Diagramm2](https://user-images.githubusercontent.com/60799334/138187423-f468c424-da61-454e-9248-9f7019712862.PNG)


2. Observer
Intent: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

Applicability: Use the Observer pattern in any of the following situations

when an abstraction has two aspects, one dependent on the other. Encapsulating these aspects in separate objects lets you vary and reuse them independently
when a change to one object requires changing others, and you don't know how many objects need to be changed
when an object should be able to notify other objects without making assumptions about who these objects are. In other words, you don't want these objects tightly coupled
![Observer2](https://user-images.githubusercontent.com/60799334/138187756-d5d241d6-d870-4d1d-b4f4-3e3c0ef01a66.PNG)


3. Decorator
 Intent: Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Applicability: Use Decorator

to add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects
for responsibilities that can be withdrawn
when extension by subclassing is impractical. Sometimes a large number of independent extensions are possible and would produce an explosion of sublasses to support every combination. Or a class definition may be hidden or otherwise unavailable for subclassing.

![deco](https://user-images.githubusercontent.com/60799334/138187531-c9575b23-f51e-4528-8fb4-71e5f0c72fe9.PNG)

4. Composite 
Intent: Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
Applicability: Use the Composite pattern when

you want to represent part-whole hierarchies of objects
you want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly
![Comp](https://user-images.githubusercontent.com/60799334/138187589-b695d435-4c2e-4ed0-8559-c3962d75168b.PNG)

