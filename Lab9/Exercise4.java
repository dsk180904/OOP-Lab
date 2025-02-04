
import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1, str2;

        System.out.print("Enter the first string: ");
        str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        str2 = scanner.nextLine();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Compare two strings");
            System.out.println("2. Convert uppercase to lowercase and vice versa");
            System.out.println("3. Check if one string is a substring of the other");
            System.out.println("4. Replace substring with 'Hello' if applicable");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    compareStrings(str1, str2);
                    break;
                case 2:
                    System.out.println("Converted String 1: " + toggleCase(str1));
                    System.out.println("Converted String 2: " + toggleCase(str2));
                    break;
                case 3:
                    checkSubstring(str1, str2);
                    break;
                case 4:
                    replaceSubstring(str1, str2);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }

    // a. Compare two strings
    public static void compareStrings(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }

    // b. Convert uppercase to lowercase and vice versa
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);  // Leave non-alphabetic characters unchanged
            }
        }
        return toggled.toString();
    }

    // c. Check if one string is a substring of the other
    public static void checkSubstring(String s1, String s2) {
        if (s1.contains(s2)) {
            System.out.println("\"" + s2 + "\" is a substring of \"" + s1 + "\".");
        } else if (s2.contains(s1)) {
            System.out.println("\"" + s1 + "\" is a substring of \"" + s2 + "\".");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }
    }

    // d. Replace substring with 'Hello' if applicable
    public static void replaceSubstring(String s1, String s2) {
        if (s1.contains(s2)) {
            String result = s1.replace(s2, "Hello");
            System.out.println("After replacement: " + result);
        } else if (s2.contains(s1)) {
            String result = s2.replace(s1, "Hello");
            System.out.println("After replacement: " + result);
        } else {
            System.out.println("No substring match found. No replacement performed.");
        }
    }
}
