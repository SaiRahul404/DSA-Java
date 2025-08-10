public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 2, 3, 4, 6, 11, 45};
        int[] arr2 = {111, 111};
        int[] output = mergeTwoArrays(arr1, arr2);
        printArray(output);

    }

    public static int[] mergeTwoArrays(int[] arr1, int[] arr2) {

        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // Loop to compare and merge elements from both arrays
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        // // Copy any remaining elements from arr1
        while (i < arr1.length) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        // Copy any remaining elements from arr2
        while (j < arr2.length) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
