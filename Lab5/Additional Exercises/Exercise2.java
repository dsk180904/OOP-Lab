import Java.util.Scanner;

class intArray{
    int array[];

    public intArray(){
        Scanner sc = new Scanner(System.in);
        array = new int[10];
    }

    public void insertArray(){
        for(int i=0;i<10;i++){
            array[i] = sc.nextInt();
        }
    }
    
    public void display(){
        for(int i=0;i<10;i++){
            System.out.println(array[i]);
        }    
    }

    public int largestValue(){
        for(int i=0;i<10;i++){
            largest = array[i];
            if(array[i]<array[i+1]){
                largest = arr[i+1];
            }
        }
        return largest;
    }


}


public class Exercise2 {
    intArray newArray = new intArray();
    newArray.insertArray();
}
