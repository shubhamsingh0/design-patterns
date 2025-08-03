# Structural Design Patterns
Structural design patterns are concerned with how classes and objects are composed to form larger structures.
They help ensure that if one part of a system changes, the entire system doesn't need to do the same. It focuses
on how classes and objects are organized to create larger, more flexible systems. They help manage relationships
between entities, making it easier to change or extend parts of the system without affecting the whole. This leads
to code that is easier to maintain, scale, and refactor.

### We can use ` composition ` and we can use ` inheritance ` And when we combine these two powerful features and create arrangements using these two features of object oriented programming, we can get some really interesting behavior out of our objects and classes. And using these arrangements, we can solve some very common problems that you will face in your real
## Aggregation
Dependency Injection is a example of aggregation, where a class depends on another class but does not own it. The dependent class can exist independently of the class that uses it and its lifecycle is managed externally.
```
public class Team {
    private Player player; // Player can exist outside Team

    public Team(Player player) {
        this.player = player;
    }
}
```

## Composition
The owner class creates and manages the dependent object itself, tightly coupling their lifecycles.
```
public class Car {
private Engine engine; // Car creates and owns Engine

    public Car() {
        this.engine = new Engine();
    }
}
```
```
Pattern  || Composition || Inheritance
Adapter  || ✔️          || ✔️
Bridge   || ✔️          || ✔️
Composite|| ✔️          || ✔️
Decorator|| ✔️          || ✔️
Facade   || ✔️          ||
Flyweight|| ✔️          ||
Proxy    || ✔️          || 

Note: Most structural patterns prefer composition for flexibility, 
but some use inheritance for base interfaces or default behavior.
```
### Here are some common structural design patterns:
1. **Adapter Pattern**: Allows incompatible interfaces to work together by converting the interface of a class into another interface that a client expects.
   - Example: A class that adapts
   - `java.util.List` to a custom interface.
   - `java.util.Arrays.asList()` method that adapts an array to a list.
   - Example: A legacy system that needs to work with a new interface.
   - `java.util.Collections` that adapts various collections to a common interface.
   
2. **Bridge Pattern**: Decouples an abstraction from its implementation so that the two can vary independently.
   - Example: A remote control that can work with different types of devices.
   - `java.awt.Shape` and `java.awt.Graphics` in Java.
   - `java.io.InputStream` and `java.io.OutputStream` for input/output operations.
   - Example: A drawing application that can render shapes in different styles.
   - `java.sql.Connection` and `java.sql.DriverManager` for database connections.

3. **Composite Pattern**: Composes objects into tree structures to represent part-whole hierarchies.
   - Example: A file system where files and directories can be treated uniformly.
   - `java.awt.Container` and `java.awt.Component` in Java's GUI framework.
   - `java.util.Collection` and `java.util.List` for collections of objects.
   - Example: A graphical user interface where buttons and panels can be treated as components.
   - `javax.swing.JComponent` and its subclasses in Swing.

4. **Decorator Pattern**: Adds new functionality to an object dynamically without altering its structure.
   - Example: Adding scroll functionality to a window.
   - `java.io.BufferedReader` and `java.io.BufferedWriter` for adding buffering to input/output streams.
   - `java.util.Collections` methods like `Collections.synchronizedList()` for adding synchronization to collections.
   - Example: A text editor that can add spell-checking or formatting features to text components.
   - `javax.swing.text.JTextComponent` and its decorators.
   
5. **Facade Pattern**: Provides a simplified interface to a complex subsystem.
   - Example: A library that provides a simple interface for complex operations.
   - `java.awt.Toolkit` for accessing system resources in a simplified way.
   - `javax.swing.JOptionPane` for displaying dialog boxes without dealing with the underlying complexity.
   - Example: A video player that provides a simple interface for playing, pausing, and stopping videos.
   - `java.applet.Applet` as a facade for applet functionality.
   
6. **Flyweight Pattern**: Reduces memory usage by sharing common parts of state between multiple objects.
   - Example: A text editor that uses shared character objects for each character in the text.
   - `java.lang.String` where immutable strings are shared to save memory.
   - `java.awt.Font` where font objects can be shared across multiple components.
   - Example: A game that uses shared sprite objects for characters to reduce memory usage.
   - `javax.swing.Icon` for icons that can be reused across different components.
   
7. **Proxy Pattern**: Provides a surrogate or placeholder for another object to control access to it.
   - Example: A virtual proxy that loads an image only when it is needed.
   - `java.lang.reflect.Proxy` for creating dynamic proxies in Java.
   - `java.rmi.Remote` for remote method invocation where a proxy is used to access remote objects.
   - Example: A security proxy that checks permissions before allowing access to a resource.
   - `javax.management.MBeanServer` as a proxy for managing MBeans in Java Management Extensions (JMX).
