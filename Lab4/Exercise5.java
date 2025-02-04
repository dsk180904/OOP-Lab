import java.util.Scanner;

public class Exercise5{
    public static void main(String[] args) {
        int sumd1 = 0,sumd2=0, rowSum = 0, colSum = 0;
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
        for (int i = 0; i < size; i++)
		{
			sumd1 += arr[i][i];
			sumd2 += arr[i][size-1-i];
		}

        for (int i = 0; i < size; i++) {
            rowSum = 0; 
            colSum = 0;
			for (int j = 0; j < size; j++)
			{
				rowSum += arr[i][j];
				colSum += arr[j][i];
			}
		}
            
        if (rowSum != colSum || colSum != sumd1 || sumd1!=sumd2){
            System.out.println("It is not a magic square");
            System.out.println(rowSum); 
            System.out.println(colSum); 
            System.out.println(sumd1); 
            System.out.println(sumd2);
        }
        else{
            System.out.println("It is a magic square");
        }   
	}
}

