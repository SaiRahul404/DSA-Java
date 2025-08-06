public class HelloWorld {

    // Basic Java program
    public static void main(String[] args) {
        System.out.println("Hello World  Rahul");
        System.out.println("Hey, I'm learning Java");
        System.out.println("Another example");
        int score; // declaration
        score = 4;
        int salary = 5000; // declaration and Initialization
        int Salary = 6000;
        boolean isActive = true;
        isActive = false;
        // Here, salary and Salary are two different variables because one starts with 's' (small letter) and the other with 'S' (capital letter).
    }
    // Why is Java Platform Independent?
    //Unlike other programming languages like C or C++, Java does not compile directly into machine code. Instead:
    //· It first converts source code into bytecode.
    //· This bytecode can run on any system with a JVM.
    //· Since every OS (Windows, Mac, Linux) has its own JVM, Java code runs anywhere without modification.
    //This is why Java is called "Platform Independent"!
    // Java Code → Compiled into Bytecode → Executed by JVM

    //  Just-In-Time (JIT) Compilation
    //· If a block of code (like a function) is used multiple times, JVM compiles it into machine code using the JIT Compiler.
    //· The next time the same code runs, JVM uses the pre-compiled version, making execution faster.
    // If a loop runs 1000 times, JIT will optimize it to run efficiently.

    /*
     * This is a multi-line comment.
     * It can span several lines.
     * Often used for block explanations or to temporarily disable code.
     */
    /*kjsfjljfsajl;
    salkfl;jsal;sa
     */
    // Multi-line Comments: Start with /* and end with */.
    // Everything between these two symbols is a comment, even across multiple lines

    // A variable is a container that holds a value. Think of it as a named storage location in memory.
    // You can use:
    //✅ Letters (a-z, A-Z)
    //✅ Numbers (0-9)
    //✅ Underscore (_)
    //✅ Dollar sign ($)
    // But there are some restrictions:
    //❌ The variable name cannot start with a number
    //❌ Spaces are not allowed
    //❌ You cannot use special symbols like @, #, %, &

    //  You Cannot Use Java’s Reserved Keywords as Variable Names
    // Java has some special words that are already used in the language, such as:
    //class
    //public
    //static
    //int
    //boolean
    // Java follows a naming style called camelCase.
    // What is camelCase?
    //The first word starts with a small letter.
    //Each new word starts with a capital letter.
    // fullName
    // fullname
    // student_age // snake case
    // int x = 5000;
    // float y = 99.99F;
    //  int employeeSalary = 5000;
    //float productPrice = 99.99F;
    // Good Examples (Descriptive & Meaningful)
}
