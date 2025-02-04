import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int a = Scan.nextInt();
        System.out.println("Integer is: " + a);
        System.out.println("Enter a Double: ");
        double b = Scan.nextDouble();
        System.out.println("double is: " + b);
        System.out.println("Enter a Charachter: ");
        char c = Scan.next().charAt(0);
        System.out.println("Charachter is: " + c);
        Scan.close();
        byte d = (byte)a;
        System.out.println("Int to Byte gives: " + d);
        int e = (int)c; 
        System.out.println("Charachter to Integer gives: " + e);
        byte f = (byte)b;
        System.out.println("Double to Byte gives: " + f);
        int g = (int)b;
        System.out.println("Double to Integer: " + g);

    } 
}
