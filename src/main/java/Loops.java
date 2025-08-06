public class Loops {

    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

        for (int i = 0; i < 50; i++) {
            System.out.println("Hello World");
        }

//        for(initialization; condition; update) {
//            // code to execute
//        }
        // Initialization → executed once before the loop starts.
        //Condition → checked before each iteration. If true, the loop runs; otherwise, it stops.
        //Update → executed after each iteration (usually increments or decrements a variable).

        for (int i = 0; i <= 100; i += 5) {
            System.out.println(i);
        }
        for (int i = 100; i >= 0; i -= 5) {
            System.out.println(i);
        }

        // while(condition) {
        //    // code to execute
        //}

//        int i = 1; // Initialization
//        while (i <= 5) { // Condition
//            System.out.println("Iteration: " + i);
//            i++; // update
//        }
        // Use it when you don't know how many times something will happen,
        // but you’ll keep doing it as long as some condition is true.
        while (1 == 1) {
            System.out.println("Hello World");
            break;
        }

        // do {
        //    // code to execute
        //} while (condition)
        // The do-while loop executes at least once before checking the condition.
        // The code inside the do block runs at least once, even if the condition is false.

        int spoon = 2;
        do {
            System.out.println("Taking spoonful " + spoon);
            spoon++;
        } while (spoon <= 1);

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Found what I was looking for. Breaking the loop!");
                break;
            }
            System.out.println("Checking item " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Drawer 3 is stuck, skipping it.");
                continue;
            }
            System.out.println("Checking drawer " + i);
        }

//        int i = 1;
//        while (i <= 5) {
//            if (i == 4) {
//                System.out.println("Oops! Problem at step " + i + ". Breaking out.");
//                break;
//            }
//            System.out.println("Step " + i);
//            i++;
//        }
//        int i = 0;
//        while (i < 5) {
//            i++; // increase first to avoid infinite loop
//            if (i == 3) {
//                System.out.println("Skipping step " + i);
//                continue;
//            }
//            //i++;
//            System.out.println("Completing step " + i);
//        }
//        int i = 1;
//        do {
//            if (i == 3) {
//                System.out.println("Unexpected issue at try " + i + ". Stopping.");
//                break;
//            }
//            System.out.println("Trying attempt " + i);
//            i++;
//        } while (i <= 5);

        int i = 0;
        do {
            i++;
            if (i == 2) {
                System.out.println("Skipping attempt " + i);
                continue;
            }
            System.out.println("Processing attempt " + i);
        } while (i < 4);

        // Print multiplication table of 7
        int n = 5; // Scanner
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (i * n));
        }
        // Print numbers from 1 to 10 using all three loop types.
        // Print multiplication tables.
        // Calculate the sum of numbers from 1 to N.
        //  // Programs to check if a number is positive/negative/zero.
        //    //Program to determine if a person is eligible to vote/drive.


    }
}
