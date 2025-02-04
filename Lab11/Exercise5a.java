class SharedResource {
    private int counter = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        counter++;
        System.out.println(Thread.currentThread().getName() + " incremented: " + counter);
    }

    public int getCounter() {
        return counter;
    }
}

class MyThread extends Thread {
    private final SharedResource resource;

    public MyThread(SharedResource resource, String name) {
        super(name);
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            resource.increment(); // Accessing synchronized method
        }
    }
}

public class Exercise5a {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new MyThread(resource, "Thread-1");
        Thread t2 = new MyThread(resource, "Thread-2");

        t1.start();
        t2.start();
    }
}
