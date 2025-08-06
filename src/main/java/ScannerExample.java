import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Object for the Scanner class
        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        System.out.println("The number is " + n);
//        double d1 = sc.nextDouble();
//        System.out.println(d1);
//
//        System.out.print("Enter a float number:");
//        float f1 = sc.nextFloat();
//        System.out.println(f1);
//
//
//        System.out.print("Enter a boolean:");
//        boolean b1 = sc.nextBoolean();
//        System.out.println(b1);
//
//        System.out.print("Enter a long number:");
//        long l1 = sc.nextLong();
//        System.out.println(l1);

        System.out.println("Enter a character");
//        char ch = sc.next().charAt(0);
//        System.out.println(ch);

        String s1 = sc.next();
        System.out.println(s1);
        sc.close();



        // Scanner is a class in Java.

        //It belongs to the package java.util.
        // It is used to take input from users (keyboard) during program execution
        // Without Scanner, Java programs can't easily read dynamic user inputs.
    }
}
