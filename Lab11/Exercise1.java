import java.util.Scanner;

class RunnableTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread using Runnable interface is running.");
    }
}

class ThreadTask extends Thread {
    @Override
    public void run() {
        System.out.println("Thread using Thread class is running.");
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Create thread using Runnable interface");
            System.out.println("2. Create thread by extending Thread class");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    RunnableTask runnableTask = new RunnableTask();
                    Thread thread1 = new Thread(runnableTask);
                    thread1.start();
                    break;
                case 2:
                    ThreadTask threadTask = new ThreadTask();
                    threadTask.start();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}

