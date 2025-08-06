public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};

        int n = arr.length;

        // This loop controls the number of passes
        for (int i = 0; i < n - 1; i++) {
            //
// Inner loop: This loop does the comparisons and swaps
            // It iterates from the beginning up to the last unsorted element
            for (int j = 0; j < n - 1 - i; j++) {
                //
                // Compare adjacent elements
                // If the element on the left is greater than the element on the right, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
