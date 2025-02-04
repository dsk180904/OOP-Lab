import java.util.Scanner;

// Matrix class to hold and display matrix data
class Matrix {
    private final int[][] matrix;
    private final int rows;
    private final int cols;

    // Constructor to initialize matrix with user input
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols];
        inputMatrix();  // Take user input to populate the matrix
    }

    // Method to take matrix input from the user
    private void inputMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public synchronized void displayMatrix() {
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public synchronized void displayTranspose() {
        System.out.println("\nTranspose:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(matrix[j][i] + "\t");
            }
            System.out.println();
        }
    }

    public synchronized void displayMaxValue() {
        int max = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("\nMaximum Value: " + max);
    }

    public synchronized void displayPrincipalDiagonal() {
        System.out.println("\nPrincipal Diagonal Elements:");
        for (int i = 0; i < Math.min(rows, cols); i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println();
    }

    public synchronized void displayNonDiagonalElements() {
        System.out.println("\nNon-Diagonal Elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

// Runnable threads for different tasks
class MatrixDisplayThread implements Runnable {
    private final Matrix matrix;

    public MatrixDisplayThread(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        matrix.displayMatrix();
    }
}

class TransposeThread implements Runnable {
    private final Matrix matrix;

    public TransposeThread(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        matrix.displayTranspose();
    }
}

class MaxValueThread implements Runnable {
    private final Matrix matrix;

    public MaxValueThread(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        matrix.displayMaxValue();
    }
}

class PrincipalDiagonalThread implements Runnable {
    private final Matrix matrix;

    public PrincipalDiagonalThread(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        matrix.displayPrincipalDiagonal();
    }
}

class NonDiagonalThread implements Runnable {
    private final Matrix matrix;

    public NonDiagonalThread(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        matrix.displayNonDiagonalElements();
    }
}

// Main class to demonstrate isAlive() and join()
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take matrix size input from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create the matrix with user input
        Matrix matrix = new Matrix(rows, cols);

        // Create threads for each operation
        Thread t1 = new Thread(new MatrixDisplayThread(matrix));
        Thread t2 = new Thread(new TransposeThread(matrix));
        Thread t3 = new Thread(new MaxValueThread(matrix));
        Thread t4 = new Thread(new PrincipalDiagonalThread(matrix));
        Thread t5 = new Thread(new NonDiagonalThread(matrix));

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Check and print status using isAlive()
        System.out.println("\nChecking thread status using isAlive():");
        System.out.println("t1 isAlive: " + t1.isAlive());
        System.out.println("t2 isAlive: " + t2.isAlive());
        System.out.println("t3 isAlive: " + t3.isAlive());
        System.out.println("t4 isAlive: " + t4.isAlive());
        System.out.println("t5 isAlive: " + t5.isAlive());

        // Wait for all threads to complete using join()
        try {
            System.out.println("\nWaiting for threads to complete...");
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Check status again after threads complete
        System.out.println("\nChecking thread status after join():");
        System.out.println("t1 isAlive: " + t1.isAlive());
        System.out.println("t2 isAlive: " + t2.isAlive());
        System.out.println("t3 isAlive: " + t3.isAlive());
        System.out.println("t4 isAlive: " + t4.isAlive());
        System.out.println("t5 isAlive: " + t5.isAlive());

        System.out.println("\nAll threads completed.");
        scanner.close();
    }
}
