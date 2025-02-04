import java.util.Scanner;

public class Exercise3{
    public static void main(String[] args) {
        int flag = 0;
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
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(arr[i][j]!=arr[j][i]){
                   flag = 1;
                }
            }
        }
        if(flag==0){
            System.out.println("The matrix is symmetric");
        }
        else{
            System.out.println("The matrix is not symmetric");
        }
    }
}
