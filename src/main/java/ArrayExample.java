public class ArrayExample {
    public static void main(String[] args) {

        // In Java, an array is a fixed-size data structure that stores a collection of elements of the same data type.

        // [4,5,6,7,7] - int
        // [a,b,r,3,4] - char
        // [4.5f,5.6f] - float
        // [2,3.4f,5.664]  - not possible
        // Fixed-size: Once you create an array, you cannot change its size.
        // If you need a larger array, you must create a new one and copy the elements over.

        // Homogeneous: All elements in an array must have the same data type. You can't mix an int and a String in the same array.
        // Indexed: You access elements by their integer index, which starts at 0 and goes up to size - 1.

        // size 5
        // [3, 4, 6, 7, 8]
        // 0  1  2  3  4(5-1)

        // Syntax: dataType[] arrayName;
        int a;
        a = 5;
        int b = 5;
        int[] numbers;
        String[] names;

        numbers = new int[5]; // Creates an array of 5 integers, all initialized to 0.
        // [0 0 0 0 0]
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;


        // Using new and a block of values
        //This is a good way to create and initialize an array in a single line.
        int[] primeNumbers = new int[]{2, 3, 5, 7, 11};
        // [2 3 5 7 11]

        int firstElement = primeNumbers[0];
        int thirdElement = primeNumbers[2];

        System.out.println(firstElement); // // Gets the element at index 0, which is 2.
        System.out.println(thirdElement); // // Gets the element at index 2, which is 5.

        primeNumbers[4] = 13; // Changes the value at index 4 from 11 to 13.

        System.out.println(primeNumbers[4]);
        // Simplified syntax (most common)
        double[] temperatures = {25.5, 27.0, 24.8};

        //  Be careful not to access an index that is out of bounds (less than 0 or greater than or equal to the array's length).
        //  This will result in a ArrayIndexOutOfBoundsException.
        //System.out.println(primeNumbers[5]);
        System.out.println(primeNumbers.length);
        // The length of an array can be found using the .length property:

        //Iterating means processing each element in the array

        int[] scores = {85, 92, 78, 65, 95};
//        System.out.println(scores[0]);
//        System.out.println(scores[1]);
//        System.out.println(scores[2]);
//        System.out.println(scores[3]);
//        System.out.println(scores[4]);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Element at index " + i + ": " + scores[i]);
        }

        // The Enhanced for Loop (or for-each loop)
        // This loop is cleaner and more concise. It's ideal for simply reading each element from the array without needing the index.
        for(int j : scores) {
            System.out.println(j);
        }
        // Use the enhanced for loop whenever possible, as it is less error-prone and easier to read.
        // Use the standard for loop only when you need to access the index
    }
}
