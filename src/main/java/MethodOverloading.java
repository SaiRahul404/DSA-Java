import java.util.Arrays;

public class MethodOverloading {
    // multiple methods with the same name but different parameters.

    // The compiler differentiates between overloaded methods based on the signature of the method, which consists of:
    //
    //The method name.
    //
    //The number of parameters.
    //
    //The data types of the parameters.
    //
    //The order of the data types of the parameters


    // Improved Readability and Consistency:

    // Flexibility: It provides flexibility to the users of your class,
    // allowing them to call the most convenient version of a method for their specific needs.

    // This is resolved at compile-time (known as static polymorphism or compile-time polymorphism).
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.add(2, 3, 5));
        methodOverloading.greetPeople("Rahul", 4);
        methodOverloading.printPyrmaid(4);
        System.out.println(methodOverloading.max(35, 45));
        System.out.println(methodOverloading.max(5, 4));
        System.out.println(methodOverloading.max(15, 25));
        System.out.println(methodOverloading.max(315, 35));
        System.out.println(methodOverloading.min(3, 3));


    }

    public void printPyrmaid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // to add two integers
    public int add(int a, int b) {
        System.out.println("Adding two number");
        return a + b;
    }
    // to add two doubles

    public double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // to add three integers
    public int add(int a, int b, int c) {
        System.out.println("Adding 3 numbers");
        return a + b + c;
    }

    public void greetPeople(String name, int value) {
        System.out.println("Name : " + name + " Value : " + value);
    }

    public void greetPeople(int value, String name) {
        System.out.println("Name : " + name + " Value : " + value);
    }

    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
