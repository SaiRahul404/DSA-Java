public class Assigmnet {
    // Compound Assignment Operators
    //Compound assignment operators perform an operation (like addition, subtraction, multiplication, etc.)
    // on the variable and then assign the result back to the same variable

    // =	Assign value	a = 10
    //+=	Add and assign	a += 5 (same as a = a + 5)
    //-=	Subtract and assign	a -= 5  a = a-5
    //*=	Multiply and assign	a *= 5  a = a *5
    ///=	Divide and assign	a /= 5
    //%=	Modulus and assign	a %= 5



    //The Ternary Operator, also known as the Conditional Operator,
    // is a unique operator in Java because it's the only operator that takes three operands.
    // It provides a concise way to write a simple if-else statement.
    // variable = (condition) ? expressionIfTrue : expressionIfFalse;
    // condition: This is a boolean expression that evaluates to either true or false.
    // ?: This separates the condition from the two expressions.
    // :: This separates the expressionIfTrue from the expressionIfFalse.
    public static void main(String[] args) {
        int a = 10;
        a += 5;
        System.out.println(a);
        a -= 3; // Equivalent to a = a - 3;
        System.out.println("a after a -= 3: " + a);
        a *= 2; // Equivalent to a = a * 2;
        System.out.println("a after a *= 2: " + a);
        a /= 4; // Equivalent to a = a / 4;
        System.out.println("a after a /= 4: " + a);
        a %= 5; // Equivalent to a = a % 5;
        System.out.println("a after a %= 5: " + a);

        int m = 10;
        int n = 15;
        int z = (m < n) ? n : m; // It is a simple program to find the lagrest of two numbers
        System.out.println(z);

        int number = 6;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(number + " is " + result);
    }
}
