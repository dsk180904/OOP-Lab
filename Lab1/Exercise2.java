import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[], positive=0, negative=0, zeros=0;
        num = new int[10];
        for(int i=0;i<10;i++){
            num[i] = scan.nextInt();
        }
        scan.close();
        for(int i=0;i<10;i++){
           if (num[i]>0){
            positive++;
           }
           else if(num[i]<0){
            negative++;
           }
           else{
            zeros++;
           }
        }
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}
