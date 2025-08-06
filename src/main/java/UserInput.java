import java.util.*;
public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- User Information ---");

        System.out.print("Enter user name : ");
        String name = sc.nextLine();

        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        sc.nextLine();
        //
        // Consume the leftover newline character after reading an int/double
        // This is important if you plan to read another line of text after a number

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("hello" + name);
        System.out.println("You are " + age + " years old and live in " + city + ".");
        sc.close();

    }

}
