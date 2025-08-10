public class FindDuplicatesNew {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 2, 8, 1, 9, 9};
        sortSelection(numbers);
        findDuplicates(numbers);
    }

    public static void sortSelection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            //  // Inner loop: Find the index of the minimum element in the remaining unsorted part.
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //  // After the inner loop, minIndex holds the index of the smallest element
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void findDuplicates(int[] arr) {
        System.out.println("\nThe duplicates are : ");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }

    }
}
