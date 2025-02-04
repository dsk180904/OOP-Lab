import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = scan.nextInt();
        scan.close();
        int prod = n<<1;
        int quotient = n>>1;
        System.out.println("n*2 = " + prod);
        System.out.println("n/2 = " + quotient);
    }
    
}
