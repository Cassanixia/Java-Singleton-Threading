public class SingletonThreadTest implements Runnable {

    @Override
    public void run() {
        // Access the Singleton instance
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();

        // Print the thread name and the Singleton's hash code
        System.out.println(Thread.currentThread().getName() +

                " - Singleton HashCode: " +
                singleton.hashCode());
    }
}