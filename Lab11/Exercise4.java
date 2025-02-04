class SimpleThread implements Runnable {
    private final String threadName;

    public SimpleThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println(threadName + " is running with priority " +
                               Thread.currentThread().getPriority());
            // Simulate some work using sleep
            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " - Step " + i);
                Thread.sleep(1000);  // 1-second pause
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " was interrupted!");
        }
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        // Create three threads with different names
        Thread t1 = new Thread(new SimpleThread("Thread-1"));
        Thread t2 = new Thread(new SimpleThread("Thread-2"));
        Thread t3 = new Thread(new SimpleThread("Thread-3"));

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);  // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
        t3.setPriority(Thread.MAX_PRIORITY);  // Priority 10

        // Start the threads
        t1.start();
        t2.start();
        t3.start();

        // Interrupt thread t2 after a short delay
        try {
            Thread.sleep(2000);  // Main thread sleeps for 2 seconds
            System.out.println("Interrupting Thread-2...");
            t2.interrupt();  // Interrupt t2
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted during join.");
        }

        System.out.println("All threads completed.");
    }
}
