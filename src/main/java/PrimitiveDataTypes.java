public class PrimitiveDataTypes {
    public static void main(String[] args) {
        int numberOfApples = 10;
        double temperature = 25.5;
        long bigNumber = 5L;
        float intrest = 3.5f;
        boolean isJavaFun = true;
        char grade = 'A';
        System.out.println("Hello");
        System.out.println("World");

        System.out.print("Hello");
        System.out.print("World");

        byte b = 10;
        int i = b; // Implicit conversion from byte to int
        System.out.println("byte b: " + b);
        System.out.println("int i (from byte): " + i);

        float piFloat = 3.14f; // 'f' suffix required for float literal
        double piDouble = piFloat; // Implicit conversion from float to double
        System.out.println("float piFloat: " + piFloat);
        System.out.println("double piDouble (from float): " + piDouble);
        // int to float
        //  int to long

        // double to int
        double d = 99.99;
        int m = (int) d;
        System.out.println("double d: " + d);
        System.out.println("int i (from double): " + m);

        //  int to byte
        int largeInt = 200;
        byte b1 = (byte) largeInt;
        System.out.println("int largeInt: " + largeInt);
        System.out.println(b1);

        int largeInt1 = 99;
        byte b2 = (byte) largeInt1;
        System.out.println("int largeInt: " + largeInt1);
        System.out.println(b2);
        //  float to long
        // long to int

    }
    // Java has 8 primitive data types, which are the basic building blocks for values. They hold simple, raw data.
    // int: Used for whole numbers (integers) without decimal points.
    // Range: Approximately -2 billion to 2 billion.

    // Used for floating-point numbers (numbers with decimal points). This is the default for decimal values.
    // boolean: Used for logical values, representing either true or false.
    // char  Used for a single character. Values are enclosed in single quotes.

    // PascalCase (or UpperCamelCase) for classes:
    //Every word in the name starts with an uppercase letter.
    //Examples: MyClass, Student, BankAccount.

    // When we want to display something on the screen, we use:
    // System.out.println("Hello, World!");
    // System → This is a built-in class in Java that helps interact with the system (computer).
    // This is a static member of System that represents the console output stream (meaning it allows us to print things on the screen).
    // println → This is a method that prints text and moves to a new line.
    // 1.System.out.println() → Prints and moves to the next line.
    //2.System.out.print() → Prints but stays on the same line.

    // Type casting is the process of converting a value of one data type to another data type.
    // In Java, this conversion can happen in two main ways:
    // 1. Implicit Type Casting (Widening Conversion): Automatic conversion from a smaller data type to a larger data type.
    // byte to short, int, long, float, double
    // short to int, long, float, double
    // int to long, float, double
    // float to double
    // char to int, long, float, double
    // 2. Explicit Type Casting (Narrowing Conversion): Manual conversion from a larger data type to a smaller data type.
    // It is not always safe.
    // There is a risk of data loss (truncation) or precision loss if the value of the larger type exceeds the range of the smaller type.
    // Syntax: (targetDataType) valueToCast
    // double to float, long, int, short, byte
    //
    //float to long, int, short, byte
    //
    //long to int, short, byte
    // int to short, byte, char
    // short to byte




}
