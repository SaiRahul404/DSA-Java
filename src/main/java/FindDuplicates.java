public class FindDuplicates {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 2, 8, 1, 9, 9};
        findDuplicates(numbers);
    }

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicate elements in the array are:");

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
