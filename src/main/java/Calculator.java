import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the 2nd number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter the 3rd number: ");
        double num3 = sc.nextDouble();

        double sum = num1 + num2 + num3;
        double mul = num1 * num2 * num3;
        double sub = num1 - num2 - num3;

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
    }
}
