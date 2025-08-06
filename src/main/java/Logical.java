import java.util.Scanner;

public class Logical {
    // Logical operators are fundamental in Java for controlling program flow based on multiple conditions.
    // They allow you to combine or modify boolean expressions. Java provides three main logical operators: AND, OR, and NOT

    //The logical AND operator && returns true only if both operands are true.
    // If either operand is false, the result is false.

    // The logical OR operator || returns true if at least one of the operands is true.
    // It returns false only if both operands are false.

    // The logical NOT operator ! is a unary operator (operates on a single operand) that inverts the boolean value of its operand.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first value :");
        boolean b1 = scanner.nextBoolean();
        System.out.print("Enter the second value :");
        boolean b2 = scanner.nextBoolean();

        boolean b3 = b1 && b2;
        System.out.println("Logical AND " + b3);

        boolean b4 = b1 || b2;
        System.out.println("Logical OR " + b4);

        boolean b5 = !b1;
        System.out.println("NOT result" + b5);
    }

}
