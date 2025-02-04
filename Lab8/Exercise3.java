import java.util.Scanner;
import java.util.Arrays;

public class Exercise3 {
    
    // Method to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method to sort the string alphabetically
    public static String sortAlphabetically(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to reverse the string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to concatenate the original string with the reversed string
    public static String concatenateOriginalAndReversed(String str) {
        return str + reverseString(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString;
        int choice;

        System.out.println("Enter a string:");
        inputString = scanner.nextLine();

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original and reversed string");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer

            switch (choice) {
                case 1:
                    if (isPalindrome(inputString)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;

                case 2:
                    System.out.println("String in alphabetical order: " + sortAlphabetically(inputString));
                    break;

                case 3:
                    System.out.println("Reversed string: " + reverseString(inputString));
                    break;

                case 4:
                    System.out.println("Concatenated string: " + concatenateOriginalAndReversed(inputString));
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

