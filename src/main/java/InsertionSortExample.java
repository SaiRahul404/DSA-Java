public class InsertionSortExample {
    // it's efficient for small data sets and is often used as a component of more complex sorting algorithms.
    public static void main(String[] args) {
        int[] list = {3, 31, 34, 34, 45};
        sort(list);
        printArray(list);
    }

    public static void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
