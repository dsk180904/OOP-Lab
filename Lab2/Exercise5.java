import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        char d;
        do{ 
            Scanner in = new Scanner(System.in);
            System.out.println("Enter First Number, Operator and Second Number: ");
            double a = in.nextDouble();
            char c = in.next().charAt(0);
            double b = in.nextDouble();
            switch(c) {
                case '+':
                double sum = a + b;
                System.out.println("a + b = " + sum);
                break;
                case '-':
                double diff = a - b;
                System.out.println("a - b = " + diff);
                break;
                case '*':
                double prod = a*b;
                System.out.println("a*b = " + prod);
                break;
                case 3:
                double quotient = a/b;
                System.out.println("a/b = " + quotient);
                break;
                default:
                System.out.println("Enter the correct operator");
            }    
            System.out.println("Do another (y/n)?");
                d = in.next().charAt(0);
                if(d=='N' || d=='n'){
                    in.close();
                }
        } while((d =='Y' || d =='y') && ( d != 'N' || d!='n'));
    }
}
