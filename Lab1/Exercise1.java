public class Exercise1 {
    public static void main(String args[]){
        int length, breadth;
        length = Integer.parseInt(args[0]);
        breadth = Integer.parseInt(args[1]);
        int circumference = 2*(length + breadth);
        int area = length*breadth;
        System.out.println("Length of the rectangle = " + length);
        System.out.println("Breadth of the rectangle = " + breadth);
        System.out.println("Area of rectangle = " + area);
        System.out.println("Area of rectangle = " + circumference);
    
    }
}
