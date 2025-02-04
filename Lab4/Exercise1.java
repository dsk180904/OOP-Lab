package OOP.OOPLab.Lab4;
import java.util.Scanner;

public class Exercise1{
    public static void main(String[] args) {
        int sum=0;
        int arr[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int size = scan.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        scan.close();
        System.out.println("Non Principal Diagonal Elements");
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i!=j){
                    System.out.println(arr[i][j]);
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of non principal diagonal elements are: " + sum);
    }
}