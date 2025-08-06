public class MethodsExample {

    public static void main(String[] args) {
        MethodsExample m1 = new MethodsExample(); // Object creation
        m1.add(6, 4);
        m1.printHelloWorld();
        m1.greetHello("Ajay");
        m1.greetHello("Laxman");
        m1.greetHello("Jade");
        multiplyTwoNumbers(2, 4);
        //printHelloWorld()
        System.out.println(calculateArea(3.5));
        System.out.println(calculateArea(4.5));
    }

    public static void multiplyTwoNumbers(int a, int b) {
        int ans = a * b;
        System.out.println(calculateArea(3));
        System.out.println(ans);
    }

    public static double calculateArea(double radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public void printHelloWorld() {
        System.out.println("Hello World");
    }

    public void greetHello(String name) {
        System.out.println("Hello " + name);
    }

    // A void method usually does not have a return statement, or if it does, it's just return;
    // to exit the method early.

    // If a method has a return type other than void,
    // it means the method must compute and return a value of that specified data type to the caller.
}
