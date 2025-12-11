public class LazyInitializedSingleton {
    // 1. The private static instance of the class (initialized to null for lazy loading)
    private static LazyInitializedSingleton instance;

    // 2. A private constructor to prevent external instantiation
    private LazyInitializedSingleton() {
        System.out.println("LazyInitializedSingleton instance created.");
    }

    // 3. The public static method to provide the global access point
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {

            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}