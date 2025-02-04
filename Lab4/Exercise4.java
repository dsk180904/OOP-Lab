import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int a[][] = new int[10][10], b[][] = new int[10][10], c[][]=new int[10][10];
        int row1, row2, col1, col2;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rows of the first matrix: ");
        row1 = scan.nextInt();
        System.out.println("Enter the cols of the first matrix: ");
        col1 = scan.nextInt();
        System.out.println("Enter the rows of the second matrix: ");
        row2 = scan.nextInt();
        System.out.println("Enter the cols of the second matrix: ");
        col2 = scan.nextInt();

        if(row2!=col1){
            System.out.println("The matrix cannot be multiplied");
        }
        else{
            System.out.println("Enter the elements of matrix A: ");
            for(int i=0; i<row1; i++){
                for(int j=0; j<col1; j++){
                    a[i][j] = scan.nextInt();
                }
            }
            System.out.println("Enter the elements of matrix B: ");
            for(int i=0; i<row2; i++){
                for(int j=0; j<col2; j++){
                    b[i][j] = scan.nextInt();
                }
            }
            scan.close();
            System.out.println("Multiplication of matrix A + B: ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                  c[i][j] = 0;
                  for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                  }
                }
              }
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col2; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }  
        }
    }
}

