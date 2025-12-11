public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            // 1. Create an instance of the Runnable
            SingletonThreadTest runnable = new SingletonThreadTest();

            // 2. Create a Thread object, passing the Runnable
            Thread thread = new Thread(runnable, "Thread-" + i);

            // 3. Start the thread (calls the run() method)
            thread.start();
        }
    }
}