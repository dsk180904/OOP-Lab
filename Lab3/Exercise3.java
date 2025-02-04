import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        int m, n, flag=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter lower limit n");
        n = scan.nextInt();
        System.out.println("Enter upper limit m");
        m = scan.nextInt();
        scan.close();
        for(int i=n; i<m; i++){
            flag =1;
            for(int j=2; j<=i/2; j++){
                if(i%j==0){
                   flag=0;
                   break;
                }
            }
            if(flag==1){
                System.out.println(i + " is a prime number");
            }
        }
    }
}
