import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        boolean isLeapYear;
        if (year % 4 != 0) {
            isLeapYear = false; // Common year
        } else if (year % 100 != 0) {
            isLeapYear = true; // Leap year
        } else if (year % 400 != 0) {
            isLeapYear = false; // Common year
        } else {
            isLeapYear = true; // Leap year
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
