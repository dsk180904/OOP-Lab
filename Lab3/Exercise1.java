import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        int digit=0, sum=0, number, originalNum;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        number = scan.nextInt();
        originalNum = number;
        scan.close();

        while(number!=0){
            digit = number%10;
            sum += (digit*digit*digit);
            number/=10;
        }

        if(originalNum==sum){
            System.out.println("It is a Armstrong Number");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
}