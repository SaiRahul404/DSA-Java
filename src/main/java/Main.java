public class Main {

    // What's inside the JDK?
    //1.JRE (Java Runtime Environment): We'll get to this next, but essentially, it includes everything needed to run Java programs.
    //2.Development Tools:
    //javac: The Java Compiler. This is like the "translator" that takes your human-readable Java code (.java files)
    // and turns it into something the computer can understand called bytecode (.class files).
    //java: The Java Application Launcher. This is used to run compiled Java programs.
    //javadoc: For generating documentation.
    //jdb: The debugger, to help find and fix errors.
    //And many more tools for developing, debugging, and packaging Java applications.

    // JRE (Java Runtime Environment) - The Runner
    // That's the JRE. It's the environment needed to run Java programs.
    // If you just want to run an existing Java application (like a game or a piece of software written in Java), you only need the JRE.

    // JVM (Java Virtual Machine): The actual "engine" that runs the Java code. We'll explain this in detail next.
    //Java Class Libraries: A collection of pre-written code (like a massive library of ready-to-use functionalities) that your Java programs can use.
    // These include things for handling text, numbers, network connections, graphics, and much more.

    // The JVM is the heart of Java's "Write Once, Run Anywhere" (WORA) principle. When you compile your Java code,
    // it doesn't get converted into code specific to Windows or Mac directly.
    // Instead, it's compiled into bytecode, which is a universal, intermediate language.

    // What does the JVM do?
    // 1. Loads Code: It loads the .class files (your bytecode) into memory.
    // 2 Verifies Code: It checks the bytecode to ensure it's safe and doesn't try to do anything malicious or incorrectly formatted.
    // 3 Executes Code: This is the magic part. The JVM takes the bytecode and, depending on your operating system and hardware,

    // java code -> byte code -> machine code
    // Uses a Just-In-Time (JIT) Compiler: For frequently used parts of the code ("hot spots"),
    // the JIT compiler can convert the bytecode into native machine code (specific to your computer) for much faster execution.
    // This compiled native code is then cached for future use.
    // In short: JVM is the engine. It's what actually runs your Java bytecode.


    // Java Execution Cycle: From Code to Running Program
    // 1. Write Java Source Code: You, the developer,
    // write your Java code in a text editor or IDE and save it with a .java extension (e.g., MyProgram.java).
    // This code is human-readable.
    // 2. Compile with JDK (using javac):
    //You use the javac compiler (which is part of the JDK) to compile your MyProgram.java file.
    // javac checks your code for syntax errors
    // Run with JRE (using java command, which invokes JVM):
    //Now, to run your program, you use the java command (which is part of the JRE).
    //  Your Java program executes, interacting with your computer's resources (like displaying output on the screen, reading from files, etc.)
    //  through the JRE's class libraries and the underlying operating system.
}
