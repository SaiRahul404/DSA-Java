public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {15, 8, 23, 4, 42};

//        int[] reverseArray = new int[numbers.length];
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            reverseArray[numbers.length - 1 - i] = numbers[i];
//        }
//
//        for (int i = 0; i <= numbers.length - 1; i++) {
//            System.out.println(reverseArray[i]);
//        }

        System.out.println("before Reverse");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // swap logic
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++; // forward
            end--; // backward
        }
        System.out.println("Reversed Array");
        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
