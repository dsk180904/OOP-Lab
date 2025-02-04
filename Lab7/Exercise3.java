public class Exercise3 {
    public static void main(String[] args) {
        // Autoboxing: Converting primitive types to their corresponding wrapper classes
        Integer intObj = 10; // int to Integer
        Double doubleObj = 20.5; // double to Double
        Character charObj = 'A'; // char to Character
        Boolean boolObj = true; // boolean to Boolean
        Byte byteObj = 1; // byte to Byte
        Short shortObj = 2; // short to Short
        Long longObj = 100L; // long to Long
        Float floatObj = 30.5f; // float to Float

        // Unboxing: Converting wrapper classes back to their corresponding primitive types
        int intValue = intObj; // Integer to int
        double doubleValue = doubleObj; // Double to double
        char charValue = charObj; // Character to char
        boolean boolValue = boolObj; // Boolean to boolean
        byte byteValue = byteObj; // Byte to byte
        short shortValue = shortObj; // Short to short
        long longValue = longObj; // Long to long
        float floatValue = floatObj; // Float to float

        // Displaying the values
        System.out.println("Autoboxing:");
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);

        System.out.println("\nUnboxing:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);
        System.out.println("byte value: " + byteValue);
        System.out.println("short value: " + shortValue);
        System.out.println("long value: " + longValue);
        System.out.println("float value: " + floatValue);
    }
}
