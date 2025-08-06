import java.util.Random;
import java.util.Scanner;

public class Methodoverloadingex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main method Examples");
        System.out.println("Give numbers as input: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        Methodoverloadingex m1 = new Methodoverloadingex();
        int result1 = m1.add(num1, num2);
        System.out.println("Sum of 2 integers: " + result1);
        int result2 = m1.add(num1, num2, num3);
        System.out.println("Sum of 3 integers: " + result2);
        double result3 = m1.sub(num1, num2);
        System.out.println("Sub of 2 doubles: " + result3);
        double result4 = m1.sub(num1, num2, num3);
        System.out.println("Sub of 3 doubles: " + result4);
        System.out.print("Enter a number for loop range: ");
        int num = sc.nextInt();
        m1.loops(num);

    }

    public int add(int a, int b) {
        System.out.println("Addition of two nums: ");
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public int add(int a, int b, int c) {
        System.out.println("Addition of two nums: ");
        int sum = 0;
        sum = a + b + c;
        return sum;
    }

    public double sub(double x, double y) {
        System.out.println("Substraction 2 numbers");
        double sub = 0;
        sub = x - y;
        return sub;
    }

    public double sub(double x, double y, double z) {
        System.out.println("Substraction 3 numbers");
        double sub = 0;
        sub = x - y - z;
        return sub;
    }

    // Loop example
    public void loops(int num) {
        System.out.println("For loop output:");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}