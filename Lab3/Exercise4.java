import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        int arr[]={1,2,3,1,2,1,5,6,7}, j=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to be searched: ");
        int target = scan.nextInt();
        scan.close();
        System.out.println("The number is found at: ");
        for(int i:arr){
            if(i==target){
                System.out.println("a["+j+"]");
            }
            j++;
        }
    } 
}
