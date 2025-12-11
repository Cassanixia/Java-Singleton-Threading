# Java-Singleton-Threading-Demo

This project demonstrates a thread-unsafe implementation of the Lazy Initialized Singleton pattern in Java.

## Project Files
* `LazyInitializedSingleton.java`: The core Singleton class.
* `SingletonThreadTest.java`: A `Runnable` implementation that accesses the Singleton.
* `Main.java`: The entry point that creates and starts multiple threads.

## Observations

After running the `Main.java` with a loop creating 5 threads, I observed the following in the console output:

1.  **Multiple Instance Creation:** The message `"LazyInitializedSingleton instance created."` appeared **more than once** (e.g., 2 or 3 times).
2.  **Different Hash Codes:** The hash codes printed by the different threads were **not identical**. For example, the output might look something like this (exact values vary):
    ```
    LazyInitializedSingleton instance created.
    LazyInitializedSingleton instance created.
    LazyInitializedSingleton instance created.
    LazyInitializedSingleton instance created.
    LazyInitializedSingleton instance created.
    Thread-3 - Singleton HashCode: 1550089733
    Thread-4 - Singleton HashCode: 1918335029
    Thread-5 - Singleton HashCode: 1550089733
    Thread-2 - Singleton HashCode: 1918335029
    Thread-1 - Singleton HashCode: 1918335029
    ```

### Conclusion
The **Lazy Initialized Singleton** implementation used is **not thread-safe**. When multiple threads simultaneously execute the `getInstance()` method and find `instance == null`, they can all proceed to create their own unique instance of the `LazyInitializedSingleton` object.

A correct Singleton pattern guarantees only *one* instance exists, but in this output, the observation of **multiple "instance created" messages** and **different hash codes** proves that **multiple instances were created**, violating the fundamental principle of the Singleton pattern in a multithreaded environment.