import java.util.Scanner;
class Box{
    double length;
    double breadth;
    double width;

    Box(double a, double b, double c){
        length = a;
        breadth = b;
        width= c;
    }

    double volume(){
        return length*width*breadth;
    }
}

public class Exercise1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box mybox = new Box(10, 20, 30);
        System.out.println("The volume of the Box is " + mybox.volume());
    }
}

