public class Exercise2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds! Please check the array size.");
        }
    }
}

