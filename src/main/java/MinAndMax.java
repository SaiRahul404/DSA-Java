public class MinAndMax {

    public static void main(String[] args) {
        int[] numbers = {
                4, 5, 2, 1, 9, 8, 3, 7, 6, 10,
                12, 11, 14, 13, 15, 18, 17, 16, 19, 20,
                21, 25, 24, 23, 22, 26, 28, 27, 30, 29,
                31, 35, 34, 33, 32, 36, 38, 37, 40, 39,
                41, 45, 44, 43, 42, 46, 48, 47, 50, 49
        };

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("The max element of the Array is " + max);

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("The min element of the Array is " + min);
    }
}
