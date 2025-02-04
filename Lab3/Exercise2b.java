public class Exercise2b {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int number : numbers) {
            for (int i = 0; i < number; i++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
