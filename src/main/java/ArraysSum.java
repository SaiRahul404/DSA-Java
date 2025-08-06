public class ArraysSum {

    public static void main(String[] args) {
        int[] numbers = {-4,-5,-5,6,6};
        int sum = 0;
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum of elements of Array " + sum);
    }
}
