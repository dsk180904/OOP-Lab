import java.util.InputMismatchException;
import java.util.Scanner;

class NegativeInputException extends Exception {
    public NegativeInputException(String message) {
        super(message);
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            if (number < 0) {
                // Throw custom exception for negative input
                throw new NegativeInputException("Negative input detected. Please enter a non-negative number.");
            }

            double root = Math.sqrt(number);  // Compute square root
            System.out.println("The square root of " + number + " is: " + root);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid numeric value.");
        } catch (NegativeInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();  // Ensure scanner is closed
            System.out.println("Program terminated.");
        }
    }
}
