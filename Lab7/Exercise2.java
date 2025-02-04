

class ObjectCounter {
    // Static variable to keep track of the number of objects created
    private static int count = 0;

    // Constructor
    public ObjectCounter() {
        // Increment the count whenever a new object is created
        count++;
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }
}
    // Main method to test the class
    public class Exercise2{
        public static void main(String[] args) {
            // Creating objects
            ObjectCounter obj1 = new ObjectCounter();
            ObjectCounter obj2 = new ObjectCounter();
            ObjectCounter obj3 = new ObjectCounter();
    
            // Displaying the number of objects created
            System.out.println("Number of objects created: " + ObjectCounter.getCount());
        }
    }
