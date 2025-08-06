import java.util.Scanner;

public class LinearSearchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {15, 8, 23, 4, 42, 10};

        System.out.print(" Enter the number to find in the array : " );
        int elementToFind = sc.nextInt();
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == elementToFind) {
                System.out.println("Element found");
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Found the element " + elementToFind + "at index " + foundIndex);
        } else {
            System.out.println("Element is not present in the array");
        }
    }
}

// It's the simplest search method to understand and implement.
// No Sorting Needed:

// Can be Slow: If your array is very, very long (thousands or millions of items),
// checking one by one can take a long time